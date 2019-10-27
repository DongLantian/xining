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
    ExhaustMapper exhaustMapper;

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    BoilerMapper boilerMapper;

    @Autowired
    KilnMapper kilnMapper;

    @Autowired
    DeviceMapper deviceMapper;

    /**
     * 根据企业ID查询烟囱信息列表
     * @param factoryId
     * @return
     */
    public List<Exhaust> selectExhaustListByFactoryId(int factoryId){
        ExhaustExample exhaustExample = new ExhaustExample();
        ExhaustExample.Criteria criteria = exhaustExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<Exhaust> resultExhaustList = exhaustMapper.selectByExample(exhaustExample);
        return resultExhaustList;
    }

    /**
     * 查询某个烟囱
     * @param exhaustID
     * @return
     */
    public Exhaust selectExhaust(int exhaustID) {
        Exhaust resultExhaust = exhaustMapper.selectByPrimaryKey(exhaustID);
        return resultExhaust;
    }

    /**
     * 更改选中的烟囱信息
     * @param exhaust
     * @return
     */
    public boolean updateExhaust(Exhaust exhaust) {
        if (exhaustMapper.updateByPrimaryKeySelective(exhaust)!=0){
            return true;
        }else
            return false;
    }

    /**
     * 添加烟囱
     * @param exhaust
     * @param m_factoryId
     * @return
     */
    public boolean addExhaust(Exhaust exhaust, Integer m_factoryId) {
        //设置烟囱编号，需要先找出烟囱表中该工厂下编号最大的烟囱
        ExhaustExample exhaustExample = new ExhaustExample();
        exhaustExample.setOrderByClause("NK_NO DESC");
        ExhaustExample.Criteria criteria = exhaustExample.createCriteria();
        criteria.andFactoryIdEqualTo(m_factoryId);
        List<Exhaust> exhaustList = exhaustMapper.selectByExample(exhaustExample);
        int curMaxNum=0;
        if (exhaustList.size()!=0){
            Exhaust maxNumExhaust = exhaustList.get(0);
            curMaxNum = maxNumExhaust.getNkNo();
        }


        exhaust.setNkNo(curMaxNum+1);
        exhaust.setFactoryId(m_factoryId);
        exhaust.setExfNo("");

        if (exhaustMapper.insertSelective(exhaust)!=0){
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
        BoilerExample boilerExample = new BoilerExample();
        BoilerExample.Criteria criteriaBoiler = boilerExample.createCriteria();
        criteriaBoiler.andExhustIdEqualTo(exhaustID);
        long boilerCount = boilerMapper.countByExample(boilerExample);

        KilnExample kilnExample = new KilnExample();
        KilnExample.Criteria criteriaKiln = kilnExample.createCriteria();
        criteriaKiln.andExhustIdEqualTo(exhaustID);
        long kilnCount = kilnMapper.countByExample(kilnExample);

        DeviceExample deviceExample = new DeviceExample();
        DeviceExample.Criteria criteriaDevice = deviceExample.createCriteria();
        criteriaDevice.andExhustIdEqualTo(exhaustID);
        long deviceCount = deviceMapper.countByExample(deviceExample);

        if (boilerCount>0||kilnCount>0||deviceCount>0){
            //有锅炉或窑炉或设备选择了这个烟囱，不能删除。
            return 0;
        }else {
            //首先删除烟囱
            if (exhaustMapper.deleteByPrimaryKey(exhaustID)!=0){
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
