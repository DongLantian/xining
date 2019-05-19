package com.nankai.xining.utils;

import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @Description: 设置系统更新时间
 * @Author: 董兰天
 * @Date: 2019-05-18 14:14
 */

@Component
public class LastChangedTimeSet {

    @Autowired
    FactoryMapper factoryMapper1;

    private static FactoryMapper factoryMapper;

    @PostConstruct
    public void init(){
        factoryMapper=factoryMapper1;
    }

    public static void setLastChangedTime(Integer factoryID){
        Factory factory = factoryMapper.selectByPrimaryKey(factoryID);
        factory.setLastChangedTime(new Date());
        factoryMapper.updateByPrimaryKeySelective(factory);
    }
}
