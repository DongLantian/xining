package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

/**
 * @Description: 企业信息界面需要的方法
 * @Author: 董兰天
 * @Date: 2019-05-11 12:27
 */

@Service
public class EnterpriseService {

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    IndustryBigMapper industryBigMapper;

    @Autowired
    IndustrySmallMapper industrySmallMapper;

    @Autowired
    CityMapper cityMapper;

    @Autowired
    CountyMapper countyMapper;

    /**
     * 获得工厂信息
     * @param factoryID
     * @return factory
     */
    public Factory getFactoryInfo(int factoryID){
        Factory resultFactory = factoryMapper.selectByPrimaryKey(factoryID);
        return resultFactory;
    }

    /**
     * 根据工厂编号获取工厂信息
     * @param factoryNo
     * @return
     */
    public FactoryInfo getFactoryInfoByNo(String factoryNo) throws IllegalAccessException {
        FactoryExample factoryExample = new FactoryExample();
        FactoryExample.Criteria criteria = factoryExample.createCriteria();
        criteria.andFactoryNoEqualTo(factoryNo);
        List<Factory> factoryList = factoryMapper.selectByExample(factoryExample);
        if (factoryList.isEmpty()){
            return null;
        }else {
            Factory factory = factoryList.get(0);
            FactoryInfo factoryInfo = new FactoryInfo();
            //使用反射将factory对象的数据拷贝到factoryInfo
            Field[] fields=factory.getClass().getDeclaredFields();
            for(int i = 0; i < fields.length; i++){
                if (fields[i].getName().equals("serialVersionUID")) continue;
                fields[i].setAccessible(true);
                Object sourceValue=fields[i].get(factory);
                fields[i].set(factoryInfo,sourceValue );
            }
            String countyID = factoryInfo.getCountyId();
            String countyIDRegister = factoryInfo.getCountyidRegister();
            factoryInfo.setCountyCity(factoryMapper.getCitybyCountry(countyID));
            factoryInfo.setCountyRegisterCity(factoryMapper.getCitybyCountry(countyIDRegister));
            return factoryInfo;
        }
    }



    /**
     * 更新工厂信息
     * @param factory
     * @param factoryid
     * @return Factory
     */
    public FactoryInfo updateFactory(Factory factory, int factoryid) throws IllegalAccessException {

        factory.setFactoryId(factoryid);
        Factory fac=factoryMapper.selectByPrimaryKey(factoryid);
        factory.setFactoryNo(fac.getFactoryNo());
        if(fac.getFillingTime()==null){
            factory.setFillingTime(new Date());
        }else{
            factory.setFillingTime(fac.getFillingTime());
        }
        factory.setLastChangedTime(new Date());
        factory.setYear(fac.getYear());
        factory.setStatus(8);
        if (factoryMapper.updateByPrimaryKeySelective(factory)!=0){
            FactoryInfo factoryInfo = new FactoryInfo();
            //使用反射将factory对象的数据拷贝到factoryInfo
            Field[] fields=factory.getClass().getDeclaredFields();
            for(int i = 0; i < fields.length; i++){
                if (fields[i].getName().equals("serialVersionUID")) continue;
                fields[i].setAccessible(true);
                Object sourceValue=fields[i].get(factory);
                fields[i].set(factoryInfo,sourceValue );
            }
            String countyID = factoryInfo.getCountyId();
            String countyIDRegister = factoryInfo.getCountyidRegister();
            factoryInfo.setCountyCity(factoryMapper.getCitybyCountry(countyID));
            factoryInfo.setCountyRegisterCity(factoryMapper.getCitybyCountry(countyIDRegister));
            return factoryInfo;
        }else
            return null;
    }

    /**
     * 查询全部行业大类信息
     * @return
     */
    public List<IndustryBig> getindustryBigAll(){
        IndustryBigExample industryBigExample = new IndustryBigExample();
        List<IndustryBig> resultIndustryBig = industryBigMapper.selectByExample(industryBigExample);
        return resultIndustryBig;
    }

    /**
     * 根据一级行业类别ID查询二级行业类别信息
     * @param industryBigID
     * @return
     */
    public List<IndustrySmall> getindustrySmallPart(String industryBigID){

        IndustrySmallExample industrySmallExample = new IndustrySmallExample();
        IndustrySmallExample.Criteria criteria = industrySmallExample.createCriteria();
        criteria.andIndustryBigEqualTo(industryBigID);
        List<IndustrySmall> resultIndustrySmall = industrySmallMapper.selectByExample(industrySmallExample);
        return resultIndustrySmall;
    }


    /**
     * 查询所有城市信息
     * @return
     */
    public List<City> getcityALl() {
        CityExample cityExample = new CityExample();
        List<City> resultCity = cityMapper.selectByExample(cityExample);
        return resultCity;
    }

    /**
     * 根据城市ID查询区县信息
     * @param cityCode
     * @return
     */
    public List<County> getcountryPartByCitycode(String cityCode){
        CountyExample countyExample = new CountyExample();
        CountyExample.Criteria criteria = countyExample.createCriteria();
        criteria.andCityCodeEqualTo(cityCode);
        List<County> resultCountry = countyMapper.selectByExample(countyExample);
        return resultCountry;
    }
}
