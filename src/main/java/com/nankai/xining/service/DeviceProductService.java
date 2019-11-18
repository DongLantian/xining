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
    ExhaustMapper exhaustMapper;

    @Autowired
    DeviceMapper deviceMapper;

    @Autowired
    DeviceProductMapper deviceProductMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询产品列表
     * @param factoryId
     * @return
     */
    public List<DeviceProduct> selectProductListByFactoryId(int factoryId) {
        List<DeviceProduct> deviceProductList = deviceProductMapper.selectByFactoryIdWithJoin(factoryId);
        return deviceProductList;
    }


    /**
     * 根据ID查询单个产品
     * @param productID
     * @return
     */
    public DeviceProduct selectProductByID(Integer productID) {
        return deviceProductMapper.selectByPrimaryKey(productID);
    }


    /**
     * 添加设备产品
     * @param deviceProduct
     * @param factoryId
     * @return
     */
    public boolean addProduct(DeviceProduct deviceProduct, Integer factoryId) {
        //设置产品编号，需要先找出原料表中该工厂下编号最大的产品
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
        //这样就可以查询产品了
        DeviceProductExample deviceProductExample = new DeviceProductExample();
        deviceProductExample.setOrderByClause("nk_no DESC");
        DeviceProductExample.Criteria criteria2 = deviceProductExample.createCriteria();
        criteria2.andDeviceIdIn(deviceIDList);
        List<DeviceProduct> deviceProductList = deviceProductMapper.selectByExample(deviceProductExample);
        int curMaxNum=0;
        if (deviceProductList.size()!=0){
            DeviceProduct maxNumDeviceProduct = deviceProductList.get(0);
            curMaxNum = maxNumDeviceProduct.getNkNo();
        }
        //设置原料序号
        deviceProduct.setNkNo(curMaxNum+1);

        //更新factory中的count数据
        Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
        int deviceProductCount = deviceProductList.size()+1;
        factory.setDeviceProductCount(deviceProductCount);


        //初始化deviceProduct
        String StrSCC="11"+deviceProduct.getActivitiesCategory()+deviceProduct.getNameCategory()+deviceProduct.getDrainageProcess();
        deviceProduct.setSccCode(StrSCC);
        if (deviceProductMapper.insertSelective(deviceProduct)!=0) {
            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;
    }


    /**
     * 更新产品信息
     * @param deviceProduct
     * @return
     */
    public boolean updateProduct(DeviceProduct deviceProduct) {
        String StrSCC="11"+deviceProduct.getActivitiesCategory()+deviceProduct.getNameCategory()+deviceProduct.getDrainageProcess();
        deviceProduct.setSccCode(StrSCC);
        if (deviceProductMapper.updateByPrimaryKey(deviceProduct)!=0) return true;
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
        if (deviceProductMapper.deleteByPrimaryKey(productID)!=0){
            //更新factory中的count数据
            Factory factory = factoryMapper.selectByPrimaryKey(factoryID);
            int deviceProductCount = factory.getDeviceProductCount()-1;
            factory.setDeviceProductCount(deviceProductCount);
            factoryMapper.updateByPrimaryKeySelective(factory);
            return 1;
        }else {
            return 0;
        }
    }
}
