package com.nankai.xining.service;

import com.nankai.xining.bean.BoilerTemp;
import com.nankai.xining.bean.BoilerTempExample;
import com.nankai.xining.repository.BoilerTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-15 10:00
 */

@Service
public class BoilerService {

    @Autowired
    BoilerTempMapper boilerTempMapper;

    /**
     * 根据企业ID查询锅炉信息列表
     * @param factoryId
     * @return
     */
    public List<BoilerTemp> selectBoilerListByFactoryId(int factoryId){
        List<BoilerTemp> boilerTempList = boilerTempMapper.selectByFactoryIdWithJoin(factoryId);
        return boilerTempList;
    }

    /**
     * 根据锅炉ID查询某个锅炉
     * @param boilerID
     * @return
     */
    public BoilerTemp selectBoilerById(Integer boilerID) {
        BoilerTemp boilerTemp = boilerTempMapper.selectByPrimaryKey(boilerID);
        return boilerTemp;
    }
}
