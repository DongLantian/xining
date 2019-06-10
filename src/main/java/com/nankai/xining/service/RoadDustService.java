package com.nankai.xining.service;

import com.nankai.xining.bean.FRoadDustSourceTemp;
import com.nankai.xining.bean.FRoadDustSourceTempExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FRoadDustSourceTempMapper;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-08 16:50
 */

@Service
public class RoadDustService {

    @Autowired
    FRoadDustSourceTempMapper fRoadDustSourceTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查找道路扬尘源
     * @param factoryId
     * @return
     */
    public List<FRoadDustSourceTemp> selectRoadDustListByFactoryId(int factoryId) {
        FRoadDustSourceTempExample fRoadDustSourceTempExample = new FRoadDustSourceTempExample();
        FRoadDustSourceTempExample.Criteria criteria = fRoadDustSourceTempExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fRoadDustSourceTempMapper.selectByExample(fRoadDustSourceTempExample);
    }


    /**
     * 根据ID查找道路扬尘源
     * @param roadDustID
     * @return
     */
    public FRoadDustSourceTemp selectRoadDustByID(Integer roadDustID) {
        return fRoadDustSourceTempMapper.selectByPrimaryKey(roadDustID);
    }



    /**
     * 添加道路扬尘源
     * @param fRoadDustSourceTemp
     * @param factoryId
     * @return
     */
    public boolean addRoadDust(FRoadDustSourceTemp fRoadDustSourceTemp, Integer factoryId) {
        //设置企业ID
        fRoadDustSourceTemp.setFactoryid(factoryId);

        if (fRoadDustSourceTempMapper.insertSelective(fRoadDustSourceTemp)!=0) {
            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;
    }


    /**
     * 更改道路扬尘源信息
     * @param fRoadDustSourceTemp
     * @return
     */
    public boolean updateRoadDust(FRoadDustSourceTemp fRoadDustSourceTemp) {
        if (fRoadDustSourceTempMapper.updateByPrimaryKey(fRoadDustSourceTemp)!=0){
            return true;
        }else {
            return false;
        }
    }


    /**
     * 删除道路扬尘源
     * @param roadDustID
     * @return
     */
    public int deleteRoadDust(int roadDustID) {
        if (fRoadDustSourceTempMapper.deleteByPrimaryKey(roadDustID)!=0){
            return 1;
        }else {
            return 0;
        }
    }


}
