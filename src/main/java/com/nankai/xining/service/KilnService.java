package com.nankai.xining.service;

import com.nankai.xining.bean.KilnTemp;
import com.nankai.xining.repository.KilnTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-21 20:55
 */

@Service
public class KilnService {

    @Autowired
    KilnTempMapper kilnTempMapper;

    /**
     * 根据企业ID查询窑炉列表
     * @param factoryId
     * @return
     */
    public List<KilnTemp> selectKilnListByFactoryId(int factoryId) {
        List<KilnTemp> kilnTempList = kilnTempMapper.selectByFactoryIdWithJoin(factoryId);
        return kilnTempList;
    }


    /**
     * 根据ID查询窑炉
     * @param kilnID
     * @return
     */
    public KilnTemp selectKilnByID(Integer kilnID) {
        return kilnTempMapper.selectByPrimaryKey(kilnID);
    }
}
