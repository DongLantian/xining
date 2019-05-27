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
public class RawService {

    @Autowired
    DeviceRawTempMapper deviceRawTempMapper;

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    DeviceTempMapper deviceTempMapper;

    @Autowired
    TotalProductrawTempMapper totalProductrawTempMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询设备原料列表
     * @param factoryId
     * @return
     */
    public List<DeviceRawTemp> selectRawListByFactoryId(int factoryId) {
        List<DeviceRawTemp> deviceRawTempList = deviceRawTempMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceRawTempList;
    }


    /**
     * 根据原料ID查询所选原料
     * @param rawID
     * @return
     */
    public DeviceRawTemp selectRawByID(Integer rawID) {
        return deviceRawTempMapper.selectByPrimaryKey(rawID);
    }

    /**
     *
     * @param deviceRawTemp
     * @param factoryId
     * @return
     */
    public boolean addRaw(DeviceRawTemp deviceRawTemp, Integer factoryId) {

        //设置原料编号，需要先找出原料表中该工厂下编号最大的原料
        //首先找出该工厂下所有的烟囱
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        ExhaustTempExample.Criteria exhCriteria = exhaustTempExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<ExhaustTemp> exhaustTempList= exhaustTempMapper.selectByExample(exhaustTempExample);
        //将烟囱ID放在一个列表里
        List<Integer> exhaustIDList = new ArrayList<>();
        for (ExhaustTemp temp:
                exhaustTempList) {
            exhaustIDList.add(temp.getExfId());
        }
        //然后查询设备
        DeviceTempExample deviceTempExample = new DeviceTempExample();
        DeviceTempExample.Criteria criteria = deviceTempExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<DeviceTemp> deviceTempList = deviceTempMapper.selectByExample(deviceTempExample);
        List<Integer> deviceIDList = new ArrayList<>();
        for (DeviceTemp temp:
                deviceTempList) {
            deviceIDList.add(temp.getId());
        }
        //这样就可以查询原料了
        DeviceRawTempExample deviceRawTempExample = new DeviceRawTempExample();
        deviceRawTempExample.setOrderByClause("nk_no DESC");
        DeviceRawTempExample.Criteria criteria2 = deviceRawTempExample.createCriteria();
        criteria2.andDeviceIdIn(deviceIDList);
        List<DeviceRawTemp> deviceRawTempList = deviceRawTempMapper.selectByExample(deviceRawTempExample);
        int curMaxNum=0;
        if (deviceRawTempList.size()!=0){
            DeviceRawTemp maxNumDeviceRaw = deviceRawTempList.get(0);
            curMaxNum = maxNumDeviceRaw.getNkNo();
        }
        //设置原料序号
        deviceRawTemp.setNkNo(curMaxNum+1);

        //更新total_productraw数据
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
            totalProductrawTemp.setRawNum(totalProductrawTemp.getRawNum()+1);
            if (totalProductrawTempMapper.updateByPrimaryKey(totalProductrawTemp)==0){
                flag=false;
            }
        }else {
            ////表中无总数字段的情况是不可能发生的，因为没有设备不可以填写原料。
            /*TotalProductrawTemp totalProductrawTemp = new TotalProductrawTemp();
            totalProductrawTemp.setFactoryId(factoryId);
            totalProductrawTemp.setDeviceNum(1);
            totalProductrawTemp.setProductNum(0);
            totalProductrawTemp.setRawNum(1);
            if (totalProductrawTempMapper.insert(totalProductrawTemp)!=0){
                totalProductrawTempList=totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
                productrawtotalID = totalProductrawTempList.get(0).getId();
            }else {
                flag=false;
            }*/
        }


        //初始化deviceRawTemp
        String StrSCC="11"+deviceRawTemp.getScc2()+deviceRawTemp.getScc3()+deviceRawTemp.getScc4();
        deviceRawTemp.setSccCode(StrSCC);
        deviceRawTemp.setDevicetotalId(productrawtotalID);

        if (flag){
            if (deviceRawTempMapper.insertSelective(deviceRawTemp)!=0) {
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
        if (deviceRawTempMapper.deleteByPrimaryKey(rawID)!=0){
            //更新total_productraw_temp数据
            TotalProductrawTempExample totalProductrawTempExample = new TotalProductrawTempExample();
            TotalProductrawTempExample.Criteria totalPcriteria = totalProductrawTempExample.createCriteria();
            totalPcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalProductrawTemp> totalProductrawTempList = totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
            TotalProductrawTemp totalProductrawTemp = totalProductrawTempList.get(0);
            totalProductrawTemp.setRawNum(totalProductrawTemp.getRawNum()-1);
            totalProductrawTempMapper.updateByPrimaryKey(totalProductrawTemp);
            return 1;
        }else {
            return 0;
        }
    }


    /**
     * 更新原料信息
     * @param deviceRawTemp
     * @return
     */
    public boolean updateRaw(DeviceRawTemp deviceRawTemp) {
        if (deviceRawTempMapper.updateByPrimaryKey(deviceRawTemp)!=0) return true;
        else return false;
    }
}
