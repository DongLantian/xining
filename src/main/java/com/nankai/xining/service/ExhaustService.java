package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-12 20:31
 */

@Service
public class ExhaustService {

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    BoilerTempMapper boilerTempMapper;

    @Autowired
    KilnTempMapper kilnTempMapper;

    @Autowired
    DeviceTempMapper deviceTempMapper;

    /**
     * 根据企业ID查询烟囱信息列表
     * @param factoryId
     * @return
     */
    public List<ExhaustTemp> selectExhaustListByFactoryId(int factoryId){
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        ExhaustTempExample.Criteria criteria = exhaustTempExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<ExhaustTemp> resultExhaustList = exhaustTempMapper.selectByExample(exhaustTempExample);
        return resultExhaustList;
    }

    /**
     * 查询某个烟囱
     * @param exhaustID
     * @return
     */
    public ExhaustTemp selectExhaust(int exhaustID) {
        ExhaustTemp resultExhaust = exhaustTempMapper.selectByPrimaryKey(exhaustID);
        return resultExhaust;
    }

    /**
     * 更改选中的烟囱信息
     * @param exhaustTemp
     * @return
     */
    public boolean updateExhaust(ExhaustTemp exhaustTemp) {
        if (exhaustTempMapper.updateByPrimaryKeySelective(exhaustTemp)!=0){
            return true;
        }else
            return false;
    }

    /**
     * 添加烟囱
     * @param exhaustTemp
     * @param m_factoryId
     * @return
     */
    public boolean addExhaust(ExhaustTemp exhaustTemp, Integer m_factoryId) {
        //设置烟囱编号，需要先找出烟囱表中该工厂下编号最大的烟囱
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        exhaustTempExample.setOrderByClause("NK_NO DESC");
        ExhaustTempExample.Criteria criteria = exhaustTempExample.createCriteria();
        criteria.andFactoryIdEqualTo(m_factoryId);
        List<ExhaustTemp> exhaustList = exhaustTempMapper.selectByExample(exhaustTempExample);
        int curMaxNum=0;
        if (exhaustList.size()!=0){
            ExhaustTemp maxNumExhaust = exhaustList.get(0);
            curMaxNum = maxNumExhaust.getNkNo();
        }


        exhaustTemp.setNkNo(curMaxNum+1);
        exhaustTemp.setFactoryId(m_factoryId);
        exhaustTemp.setExfNo("");

        if (exhaustTempMapper.insertSelective(exhaustTemp)!=0){
            //添加烟囱成功
            //设置工厂表中的exhaust_num字段，即烟囱总数。
            //设置工厂表中更新时间
            Factory fac = factoryMapper.selectByPrimaryKey(m_factoryId);
            int oldExhaustNum = fac.getExhaustNum();
            int  m_status=0;
            Date now = new Date();

            fac.setExhaustNum(oldExhaustNum+1);

            if(fac.getStatus()!=null){
                m_status=fac.getStatus();
            }
            if (m_status == 0) {
                fac.setFillingTime(now);
            }
            fac.setLastChangedTime(now);

            factoryMapper.updateByPrimaryKeySelective(fac);

            return true;
        }else {
            return false;
        }
    }

    /**
     * 根据ID删除烟囱
     * @param exhaustID
     * @param m_factoryId
     * @return int
     * 1：删除成功；  0：有其他东西选择了该烟囱，删除失败；  -1：未知原因删除失败
     */
    public int deleteExhaust(int exhaustID, Integer m_factoryId) {
        //首先判断有没有锅炉或者窑炉或者设备选了这个烟囱
        BoilerTempExample boilerTempExample = new BoilerTempExample();
        BoilerTempExample.Criteria criteriaBoiler = boilerTempExample.createCriteria();
        criteriaBoiler.andExhustIdEqualTo(exhaustID);
        long boilerCount = boilerTempMapper.countByExample(boilerTempExample);

        KilnTempExample kilnTempExample = new KilnTempExample();
        KilnTempExample.Criteria criteriaKiln = kilnTempExample.createCriteria();
        criteriaKiln.andExhustIdEqualTo(exhaustID);
        long kilnCount = kilnTempMapper.countByExample(kilnTempExample);

        DeviceTempExample deviceTempExample = new DeviceTempExample();
        DeviceTempExample.Criteria criteriaDevice = deviceTempExample.createCriteria();
        criteriaDevice.andExhustIdEqualTo(exhaustID);
        long deviceCount = deviceTempMapper.countByExample(deviceTempExample);

        if (boilerCount>0||kilnCount>0||deviceCount>0){
            //有锅炉或窑炉或设备选择了这个烟囱，不能删除。
            return 0;
        }else {
            //首先删除烟囱
            if (exhaustTempMapper.deleteByPrimaryKey(exhaustID)!=0){
                //删除成功后factory表中exhaust_num字段减一
                Factory fac = factoryMapper.selectByPrimaryKey(m_factoryId);
                int oldExhaustNum = fac.getExhaustNum();
                fac.setExhaustNum(oldExhaustNum-1);
                factoryMapper.updateByPrimaryKeySelective(fac);

                return 1;
            }else
                return -1;
        }

    }
}
