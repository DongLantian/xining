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
 * @Date: 2019-05-29 16:07
 */

@Service
public class DeviceProductService {

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    DeviceTempMapper deviceTempMapper;

    @Autowired
    DeviceProductTempMapper deviceProductTempMapper;

    @Autowired
    TotalProductrawTempMapper totalProductrawTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询产品列表
     * @param factoryId
     * @return
     */
    public List<DeviceProductTemp> selectProductListByFactoryId(int factoryId) {
        List<DeviceProductTemp> deviceProductTempList = deviceProductTempMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceProductTempList;
    }


    /**
     * 根据ID查询单个产品
     * @param productID
     * @return
     */
    public DeviceProductTemp selectProductByID(Integer productID) {
        return deviceProductTempMapper.selectByPrimaryKey(productID);
    }


    /**
     * 添加设备产品
     * @param deviceProductTemp
     * @param factoryId
     * @return
     */
    public boolean addProduct(DeviceProductTemp deviceProductTemp, Integer factoryId) {
        //设置产品编号，需要先找出原料表中该工厂下编号最大的产品
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
        //这样就可以查询产品了
        DeviceProductTempExample deviceProductTempExample = new DeviceProductTempExample();
        deviceProductTempExample.setOrderByClause("nk_no DESC");
        DeviceProductTempExample.Criteria criteria2 = deviceProductTempExample.createCriteria();
        criteria2.andDeviceIdIn(deviceIDList);
        List<DeviceProductTemp> deviceProductTempList = deviceProductTempMapper.selectByExample(deviceProductTempExample);
        int curMaxNum=0;
        if (deviceProductTempList.size()!=0){
            DeviceProductTemp maxNumDeviceProduct = deviceProductTempList.get(0);
            curMaxNum = maxNumDeviceProduct.getNkNo();
        }
        //设置原料序号
        deviceProductTemp.setNkNo(curMaxNum+1);

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
            totalProductrawTemp.setProductNum(totalProductrawTemp.getProductNum()+1);
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


        //初始化deviceProductTemp
        String StrSCC="11"+deviceProductTemp.getActivitiesCategory()+deviceProductTemp.getNameCategory()+deviceProductTemp.getDrainageProcess();
        deviceProductTemp.setSccCode(StrSCC);
        deviceProductTemp.setDevicetotalId(productrawtotalID);

        if (flag){
            if (deviceProductTempMapper.insertSelective(deviceProductTemp)!=0) {
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
     * 更新产品信息
     * @param deviceProductTemp
     * @return
     */
    public boolean updateProduct(DeviceProductTemp deviceProductTemp) {
        String StrSCC="11"+deviceProductTemp.getActivitiesCategory()+deviceProductTemp.getNameCategory()+deviceProductTemp.getDrainageProcess();
        deviceProductTemp.setSccCode(StrSCC);
        if (deviceProductTempMapper.updateByPrimaryKey(deviceProductTemp)!=0) return true;
        else return false;
    }

    /**
     * 删除产品信息
     * @param productID
     * @param factoryID
     * @return
     */
    public int deleteProduct(int productID, Integer factoryID) {
        //删除产品的同时更改total表
        if (deviceProductTempMapper.deleteByPrimaryKey(productID)!=0){
            //更新total_productraw_temp数据
            TotalProductrawTempExample totalProductrawTempExample = new TotalProductrawTempExample();
            TotalProductrawTempExample.Criteria totalPcriteria = totalProductrawTempExample.createCriteria();
            totalPcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalProductrawTemp> totalProductrawTempList = totalProductrawTempMapper.selectByExample(totalProductrawTempExample);
            TotalProductrawTemp totalProductrawTemp = totalProductrawTempList.get(0);
            totalProductrawTemp.setProductNum(totalProductrawTemp.getProductNum()-1);
            totalProductrawTempMapper.updateByPrimaryKey(totalProductrawTemp);
            return 1;
        }else {
            return 0;
        }
    }
}
