package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-15 18:54
 */

@Service
public class SccLoadService {

    @Autowired
    SccMapper sccMapper;

    @Autowired
    Scc1Mapper scc1Mapper;

    @Autowired
    Scc2Mapper scc2Mapper;

    @Autowired
    Scc3Mapper scc3Mapper;

    @Autowired
    Scc4Mapper scc4Mapper;


    /**
     * 用于加载一级下来菜单：根据scc1ID查询scc2表
     * @param scc1ID
     * @return
     */
    public List<Scc2> loadSelectAonScc2ByScc1(String scc1ID){
        Scc2Example scc2Example = new Scc2Example();
        Scc2Example.Criteria criteria = scc2Example.createCriteria();
        criteria.andScc1EqualTo(scc1ID);
        List<Scc2> resultScc2List = scc2Mapper.selectByExample(scc2Example);
        return resultScc2List;
    }

    /**
     * 用于加载二级下拉菜单：根据scc1id和scc2id查询scc3表
     * @param scc1ID
     * @param scc2ID
     * @return
     */
    public List<Scc3> loadSelectBonScc3ByScc1andScc2(String scc1ID,String scc2ID){
        Scc3Example scc3Example = new Scc3Example();
        Scc3Example.Criteria criteria = scc3Example.createCriteria();
        criteria.andScc1EqualTo(scc1ID);
        criteria.andScc2EqualTo(scc2ID);
        List<Scc3> resultScc3List = scc3Mapper.selectByExample(scc3Example);
        return resultScc3List;
    }

    /**
     * 用于加载三级下拉菜单：根据scc1id和scc2id和scc3id查询scc4表
     * @param scc1ID
     * @param scc2ID
     * @param scc3ID
     * @return
     */
    public List<Scc4> loadSelectConScc4ByScc1andScc2andScc3(String scc1ID,String scc2ID,String scc3ID){
        Scc4Example scc4Example = new Scc4Example();
        Scc4Example.Criteria criteria = scc4Example.createCriteria();
        criteria.andScc1EqualTo(scc1ID);
        criteria.andScc2EqualTo(scc2ID);
        criteria.andScc3EqualTo(scc3ID);
        List<Scc4> resultScc4List = scc4Mapper.selectByExample(scc4Example);
        return resultScc4List;
    }


}
