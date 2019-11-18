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
    DeviceMapper deviceMapper;

    @Autowired
    ExhaustMapper exhaustMapper;

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    DeviceRawMapper deviceRawMapper;


    /**
     * 根据企业ID查询设备列表
     * @param factoryId
     * @return
     */
    public List<Device> selectDeviceListByFactoryId(int factoryId) {
        List<Device> deviceList = deviceMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceList;
    }

    /**
     * 根据设备ID查找设备
     * @param deviceID
     * @return
     */
    public Device selectDeviceByID(Integer deviceID) {
        return deviceMapper.selectByPrimaryKey(deviceID);
    }


    /**
     * 增加设备
     * @param device
     * @param factoryId
     * @return
     */
    public boolean addDevice(Device device, Integer factoryId) {
        //设置设备编号，需要先找出设备表中该工厂下编号最大的设备
        ExhaustExample exhaustExample = new ExhaustExample();
        ExhaustExample.Criteria exhCriteria = exhaustExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<Exhaust> exhaustList= exhaustMapper.selectByExample(exhaustExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (Exhaust temp:
                exhaustList) {
            exhaustIDList.add(temp.getExfId());
        }
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.setOrderByClause("nk_no DESC");
        DeviceExample.Criteria criteria = deviceExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<Device> deviceList = deviceMapper.selectByExample(deviceExample);
        int curMaxNum=0;
        if (deviceList.size()!=0){
            Device maxNumDevice = deviceList.get(0);
            curMaxNum = maxNumDevice.getNkNo();
        }


        device.setNkNo(curMaxNum+1);

        //更新factory中的count数据
        Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
        int deviceCount = deviceList.size()+1;
        factory.setDeviceCount(deviceCount);

        if (deviceMapper.insertSelective(device)!=0) {

            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;

    }


    /**
     * 删除设备
     * @param deviceID
     * @param factoryID
     * @return
     */
    public int deleteDevice(int deviceID, Integer factoryID) {
        //首先验证有没有原料选择了该设备
        DeviceRawExample deviceRawExample = new DeviceRawExample();
        DeviceRawExample.Criteria criteria = deviceRawExample.createCriteria();
        criteria.andDeviceIdEqualTo(deviceID);
        List<DeviceRaw> deviceRawList = deviceRawMapper.selectByExample(deviceRawExample);
        if (deviceRawList.isEmpty()){
            //没有原料选择了该设备
            //删除设备的同时更改total表
            if (deviceMapper.deleteByPrimaryKey(deviceID)!=0){
                //更新factory中的count数据
                Factory factory = factoryMapper.selectByPrimaryKey(factoryID);
                int deviceCount = factory.getDeviceCount()-1;
                factory.setDeviceCount(deviceCount);
                factoryMapper.updateByPrimaryKeySelective(factory);
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
     * @param device
     * @return
     */
    public boolean updateDevice(Device device) {
        if (deviceMapper.updateByPrimaryKey(device)!=0){
            return true;
        }else
            return false;
    }
}
