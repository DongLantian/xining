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
 * @Date: 2019-05-27 11:00
 */

@Service
public class DeviceRawService {

    @Autowired
    DeviceRawMapper deviceRawMapper;

    @Autowired
    ExhaustMapper exhaustMapper;

    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    TotalProductrawMapper totalProductrawMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询设备原料列表
     * @param factoryId
     * @return
     */
    public List<DeviceRaw> selectRawListByFactoryId(int factoryId) {
        List<DeviceRaw> deviceRawList = deviceRawMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceRawList;
    }


    /**
     * 根据原料ID查询所选原料
     * @param rawID
     * @return
     */
    public DeviceRaw selectRawByID(Integer rawID) {
        return deviceRawMapper.selectByPrimaryKey(rawID);
    }

    /**
     *
     * @param deviceRaw
     * @param factoryId
     * @return
     */
    public boolean addRaw(DeviceRaw deviceRaw, Integer factoryId) {

        //设置原料编号，需要先找出原料表中该工厂下编号最大的原料
        //首先找出该工厂下所有的烟囱
        ExhaustExample exhaustExample = new ExhaustExample();
        ExhaustExample.Criteria exhCriteria = exhaustExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<Exhaust> exhaustList= exhaustMapper.selectByExample(exhaustExample);
        //将烟囱ID放在一个列表里
        List<Integer> exhaustIDList = new ArrayList<>();
        for (Exhaust temp:
                exhaustList) {
            exhaustIDList.add(temp.getExfId());
        }
        //然后查询设备
        DeviceExample deviceExample = new DeviceExample();
        DeviceExample.Criteria criteria = deviceExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<Device> deviceList = deviceMapper.selectByExample(deviceExample);
        List<Integer> deviceIDList = new ArrayList<>();
        for (Device temp:
                deviceList) {
            deviceIDList.add(temp.getId());
        }
        //这样就可以查询原料了
        DeviceRawExample deviceRawExample = new DeviceRawExample();
        deviceRawExample.setOrderByClause("nk_no DESC");
        DeviceRawExample.Criteria criteria2 = deviceRawExample.createCriteria();
        criteria2.andDeviceIdIn(deviceIDList);
        List<DeviceRaw> deviceRawList = deviceRawMapper.selectByExample(deviceRawExample);
        int curMaxNum=0;
        if (deviceRawList.size()!=0){
            DeviceRaw maxNumDeviceRaw = deviceRawList.get(0);
            curMaxNum = maxNumDeviceRaw.getNkNo();
        }
        //设置原料序号
        deviceRaw.setNkNo(curMaxNum+1);

        //更新total_productraw数据
        TotalProductrawExample totalProductrawExample = new TotalProductrawExample();
        TotalProductrawExample.Criteria totalPcriteria = totalProductrawExample.createCriteria();
        totalPcriteria.andFactoryIdEqualTo(factoryId);
        List<TotalProductraw> totalProductrawList = totalProductrawMapper.selectByExample(totalProductrawExample);
        Integer productrawtotalID = -1;
        boolean flag=true;
        if (totalProductrawList.size()!=0){
            //表中有总数记录，直接加一
            TotalProductraw totalProductraw = totalProductrawList.get(0);
            productrawtotalID = totalProductraw.getId();
            totalProductraw.setRawNum(totalProductraw.getRawNum()+1);
            if (totalProductrawMapper.updateByPrimaryKey(totalProductraw)==0){
                flag=false;
            }
        }else {
            ////表中无总数字段的情况是不可能发生的，因为没有设备不可以填写原料。
            /*TotalProductraw totalProductraw = new TotalProductraw();
            totalProductraw.setFactoryId(factoryId);
            totalProductraw.setDeviceNum(1);
            totalProductraw.setProductNum(0);
            totalProductraw.setRawNum(1);
            if (totalProductrawMapper.insert(totalProductraw)!=0){
                totalProductrawList=totalProductrawMapper.selectByExample(totalProductrawExample);
                productrawtotalID = totalProductrawList.get(0).getId();
            }else {
                flag=false;
            }*/
        }


        //初始化deviceRaw
        String StrSCC="11"+deviceRaw.getScc2()+deviceRaw.getScc3()+deviceRaw.getScc4();
        deviceRaw.setSccCode(StrSCC);
        deviceRaw.setDevicetotalId(productrawtotalID);

        if (flag){
            if (deviceRawMapper.insertSelective(deviceRaw)!=0) {
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
     * 删除原料
     * @param rawID
     * @param factoryID
     * @return
     */
    public int deleteRaw(int rawID, Integer factoryID) {
        //删除原料的同时更改total表
        if (deviceRawMapper.deleteByPrimaryKey(rawID)!=0){
            //更新total_productraw_temp数据
            TotalProductrawExample totalProductrawExample = new TotalProductrawExample();
            TotalProductrawExample.Criteria totalPcriteria = totalProductrawExample.createCriteria();
            totalPcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalProductraw> totalProductrawList = totalProductrawMapper.selectByExample(totalProductrawExample);
            TotalProductraw totalProductraw = totalProductrawList.get(0);
            totalProductraw.setRawNum(totalProductraw.getRawNum()-1);
            totalProductrawMapper.updateByPrimaryKey(totalProductraw);
            return 1;
        }else {
            return 0;
        }
    }


    /**
     * 更新原料信息
     * @param deviceRaw
     * @return
     */
    public boolean updateRaw(DeviceRaw deviceRaw) {
        String StrSCC="11"+deviceRaw.getScc2()+deviceRaw.getScc3()+deviceRaw.getScc4();
        deviceRaw.setSccCode(StrSCC);
        if (deviceRawMapper.updateByPrimaryKey(deviceRaw)!=0) return true;
        else return false;
    }
}
