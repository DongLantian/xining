package com.nankai.xining.service;

import com.nankai.xining.bean.Factory;
import com.nankai.xining.bean.Feiqi;
import com.nankai.xining.bean.FeiqiExample;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.FeiqiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-07 14:22
 */

@Service
public class WasteDeviceService {

    @Autowired
    FeiqiMapper feiqiMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询废弃物处理设备列表
     * @param factoryId
     * @return
     */
    public List<Feiqi> selectDeviceListByFactoryId(int factoryId) {
        FeiqiExample feiqiExample = new FeiqiExample();
        FeiqiExample.Criteria criteria = feiqiExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<Feiqi> feiqiList = feiqiMapper.selectByExample(feiqiExample);
        return feiqiList;
    }


    /**
     * 根据ID查询设备
     * @param deviceID
     * @return
     */
    public Feiqi selectDeviceByID(Integer deviceID) {
        return feiqiMapper.selectByPrimaryKey(deviceID);
    }


    /**
     * 新增废弃物处理设备
     * @param feiqi
     * @param factoryId
     * @return
     */
    public boolean addDevice(Feiqi feiqi, Integer factoryId) {
        //设置设备编号，需要先找出废弃物设备表中该工厂下编号最大的设备
        FeiqiExample feiqiExample = new FeiqiExample();
        feiqiExample.setOrderByClause("nkno DESC");
        FeiqiExample.Criteria criteria = feiqiExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<Feiqi> feiqiList = feiqiMapper.selectByExample(feiqiExample);
        int curMaxNum=0;
        if (feiqiList.size()!=0){
            Feiqi maxNumFeiqiDevice = feiqiList.get(0);
            curMaxNum = maxNumFeiqiDevice.getNkno();
        }
        //设置设备序号
        feiqi.setNkno(curMaxNum+1);
        //设置企业ID
        feiqi.setFactoryId(factoryId);

        //初始化feiqi
        String StrSCC="21"+feiqi.getScc2()+feiqi.getScc3()+feiqi.getScc4();
        feiqi.setSccCode(StrSCC);


        if (feiqiMapper.insertSelective(feiqi)!=0) {
            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;

    }


    /**
     * 更改设备信息
     * @param feiqi
     * @return
     */
    public boolean updateDevice(Feiqi feiqi) {
        String StrSCC="21"+feiqi.getScc2()+feiqi.getScc3()+feiqi.getScc4();
        feiqi.setSccCode(StrSCC);
        if (feiqiMapper.updateByPrimaryKey(feiqi)!=0) return true;
        else return false;
    }


    /**
     * 删除设备
     * @param deviceID
     * @return
     */
    public int deleteDevice(int deviceID) {
        if (feiqiMapper.deleteByPrimaryKey(deviceID)!=0){
            return 1;
        }else {
            return 0;
        }
    }

}
