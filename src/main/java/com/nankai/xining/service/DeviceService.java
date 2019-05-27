package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-26 14:31
 */

@Service
public class DeviceService {

    @Autowired
    DeviceTempMapper deviceTempMapper;

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    TotalProductrawTempMapper totalProductrawTempMapper;

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    DeviceRawTempMapper deviceRawTempMapper;


    /**
     * 根据企业ID查询设备列表
     * @param factoryId
     * @return
     */
    public List<DeviceTemp> selectDeviceListByFactoryId(int factoryId) {
        List<DeviceTemp> deviceTempList = deviceTempMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceTempList;
    }

    /**
     * 根据设备ID查找设备
     * @param deviceID
     * @return
     */
    public DeviceTemp selectDeviceByID(Integer deviceID) {
        return deviceTempMapper.selectByPrimaryKey(deviceID);
    }


    /**
     * 增加设备
     * @param deviceTemp
     * @param factoryId
     * @return
     */
    public boolean addDevice(DeviceTemp deviceTemp, Integer factoryId) {
        //设置设备编号，需要先找出设备表中该工厂下编号最大的设备
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        ExhaustTempExample.Criteria exhCriteria = exhaustTempExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<ExhaustTemp> exhaustTempList= exhaustTempMapper.selectByExample(exhaustTempExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (ExhaustTemp temp:
                exhaustTempList) {
            exhaustIDList.add(temp.getExfId());
        }
        DeviceTempExample deviceTempExample = new DeviceTempExample();
        deviceTempExample.setOrderByClause("nk_no DESC");
        DeviceTempExample.Criteria criteria = deviceTempExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<DeviceTemp> deviceTempList = deviceTempMapper.selectByExample(deviceTempExample);
        int curMaxNum=0;
        if (deviceTempList.size()!=0){
            DeviceTemp maxNumDevice = deviceTempList.get(0);
            curMaxNum = maxNumDevice.getNkNo();
        }


        deviceTemp.setNkNo(curMaxNum+1);
        deviceTemp.setDeviceNo(curMaxNum+1+"");

        //更新total_device数据
        TotalProductrawTempExample totalProductrawTempExample = new TotalProductrawTempExample();
        TotalProductrawTempExample.Criteria totalPcriteria = totalProductrawTempExample.createCriteria();
        totalPcriteria.andFactoryIdEqualTo(factoryId);
        List<TotalProductrawTemp> totalProductrawTempList = totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
        Integer productrawtotalID = -1;
        boolean flag=true;
        if (totalProductrawTempList.size()!=0){
            //表中有总数记录，直接加一
            TotalProductrawTemp totalProductrawTemp = totalProductrawTempList.get(0);
            productrawtotalID = totalProductrawTemp.getId();
            totalProductrawTemp.setDeviceNum(totalProductrawTemp.getDeviceNum()+1);
            if (totalProductrawTempMapper.updateByPrimaryKey(totalProductrawTemp)==0){
                flag=false;
            }
        }else {
            //表中无总数字段，插入
            TotalProductrawTemp totalProductrawTemp = new TotalProductrawTemp();
            totalProductrawTemp.setFactoryId(factoryId);
            totalProductrawTemp.setDeviceNum(1);
            totalProductrawTemp.setProductNum(0);
            totalProductrawTemp.setRawNum(0);
            if (totalProductrawTempMapper.insert(totalProductrawTemp)!=0){
                totalProductrawTempList=totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
                productrawtotalID = totalProductrawTempList.get(0).getId();
            }else {
                flag=false;
            }
        }

        //初始化deviceTemp
        deviceTemp.setProductrawtotalId(productrawtotalID);

        if (flag){
            if (deviceTempMapper.insertSelective(deviceTemp)!=0) {

                //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
                Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
                Date now = new Date();
                factory.setLastChangedTime(now);
                factoryMapper.updateByPrimaryKeySelective(factory);

                return true;
            }
            else return false;
        }else
            return false;
    }


    /**
     * 删除设备
     * @param deviceID
     * @param factoryID
     * @return
     */
    public int deleteDevice(int deviceID, Integer factoryID) {
        //首先验证有没有原料选择了该设备
        DeviceRawTempExample deviceRawTempExample = new DeviceRawTempExample();
        DeviceRawTempExample.Criteria criteria = deviceRawTempExample.createCriteria();
        criteria.andDeviceIdEqualTo(deviceID);
        List<DeviceRawTemp> deviceRawTempList = deviceRawTempMapper.selectByExample(deviceRawTempExample);
        if (deviceRawTempList.isEmpty()){
            //没有原料选择了该设备
            //删除设备的同时更改total表
            if (deviceTempMapper.deleteByPrimaryKey(deviceID)!=0){
                //更新total_productraw_temp数据
                TotalProductrawTempExample totalProductrawTempExample = new TotalProductrawTempExample();
                TotalProductrawTempExample.Criteria totalPcriteria = totalProductrawTempExample.createCriteria();
                totalPcriteria.andFactoryIdEqualTo(factoryID);
                List<TotalProductrawTemp> totalProductrawTempList = totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
                TotalProductrawTemp totalProductrawTemp = totalProductrawTempList.get(0);
                totalProductrawTemp.setDeviceNum(totalProductrawTemp.getDeviceNum()-1);
                totalProductrawTempMapper.updateByPrimaryKey(totalProductrawTemp);
                return 1;
            }else {
                return 0;
            }
        }else {
            return -1;
        }

    }

    /**
     * 更新设备信息
     * @param deviceTemp
     * @return
     */
    public boolean updateDevice(DeviceTemp deviceTemp) {
        if (deviceTempMapper.updateByPrimaryKey(deviceTemp)!=0){
            return true;
        }else
            return false;
    }
}
