package com.nankai.xining.service;

import com.nankai.xining.bean.Factory;
import com.nankai.xining.bean.FeiqiTemp;
import com.nankai.xining.bean.FeiqiTempExample;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.FeiqiTempMapper;
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
    FeiqiTempMapper feiqiTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询废弃物处理设备列表
     * @param factoryId
     * @return
     */
    public List<FeiqiTemp> selectDeviceListByFactoryId(int factoryId) {
        FeiqiTempExample feiqiTempExample = new FeiqiTempExample();
        FeiqiTempExample.Criteria criteria = feiqiTempExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<FeiqiTemp> feiqiTempList = feiqiTempMapper.selectByExample(feiqiTempExample);
        return feiqiTempList;
    }


    /**
     * 根据ID查询设备
     * @param deviceID
     * @return
     */
    public FeiqiTemp selectDeviceByID(Integer deviceID) {
        return feiqiTempMapper.selectByPrimaryKey(deviceID);
    }


    /**
     * 新增废弃物处理设备
     * @param feiqiTemp
     * @param factoryId
     * @return
     */
    public boolean addDevice(FeiqiTemp feiqiTemp, Integer factoryId) {
        //设置设备编号，需要先找出废弃物设备表中该工厂下编号最大的设备
        FeiqiTempExample feiqiTempExample = new FeiqiTempExample();
        feiqiTempExample.setOrderByClause("nkno DESC");
        FeiqiTempExample.Criteria criteria = feiqiTempExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<FeiqiTemp> feiqiTempList = feiqiTempMapper.selectByExample(feiqiTempExample);
        int curMaxNum=0;
        if (feiqiTempList.size()!=0){
            FeiqiTemp maxNumFeiqiDevice = feiqiTempList.get(0);
            curMaxNum = maxNumFeiqiDevice.getNkno();
        }
        //设置设备序号
        feiqiTemp.setNkno(curMaxNum+1);
        //设置企业ID
        feiqiTemp.setFactoryId(factoryId);

        //初始化feiqiTemp
        String StrSCC="21"+feiqiTemp.getScc2()+feiqiTemp.getScc3()+feiqiTemp.getScc4();
        feiqiTemp.setSccCode(StrSCC);


        if (feiqiTempMapper.insertSelective(feiqiTemp)!=0) {
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
     * @param feiqiTemp
     * @return
     */
    public boolean updateDevice(FeiqiTemp feiqiTemp) {
        String StrSCC="21"+feiqiTemp.getScc2()+feiqiTemp.getScc3()+feiqiTemp.getScc4();
        feiqiTemp.setSccCode(StrSCC);
        if (feiqiTempMapper.updateByPrimaryKey(feiqiTemp)!=0) return true;
        else return false;
    }


    /**
     * 删除设备
     * @param deviceID
     * @return
     */
    public int deleteDevice(int deviceID) {
        if (feiqiTempMapper.deleteByPrimaryKey(deviceID)!=0){
            return 1;
        }else {
            return 0;
        }
    }

}
