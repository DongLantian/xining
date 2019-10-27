package com.nankai.xining.service;

import com.nankai.xining.bean.FRoadDustSource;
import com.nankai.xining.bean.FRoadDustSourceExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FRoadDustSourceMapper;
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
    FRoadDustSourceMapper fRoadDustSourceMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查找道路扬尘源
     * @param factoryId
     * @return
     */
    public List<FRoadDustSource> selectRoadDustListByFactoryId(int factoryId) {
        FRoadDustSourceExample fRoadDustSourceExample = new FRoadDustSourceExample();
        FRoadDustSourceExample.Criteria criteria = fRoadDustSourceExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fRoadDustSourceMapper.selectByExample(fRoadDustSourceExample);
    }


    /**
     * 根据ID查找道路扬尘源
     * @param roadDustID
     * @return
     */
    public FRoadDustSource selectRoadDustByID(Integer roadDustID) {
        return fRoadDustSourceMapper.selectByPrimaryKey(roadDustID);
    }



    /**
     * 添加道路扬尘源
     * @param fRoadDustSource
     * @param factoryId
     * @return
     */
    public boolean addRoadDust(FRoadDustSource fRoadDustSource, Integer factoryId) {
        //设置企业ID
        fRoadDustSource.setFactoryid(factoryId);

        if (fRoadDustSourceMapper.insertSelective(fRoadDustSource)!=0) {
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
     * @param fRoadDustSource
     * @return
     */
    public boolean updateRoadDust(FRoadDustSource fRoadDustSource) {
        if (fRoadDustSourceMapper.updateByPrimaryKey(fRoadDustSource)!=0){
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
        if (fRoadDustSourceMapper.deleteByPrimaryKey(roadDustID)!=0){
            return 1;
        }else {
            return 0;
        }
    }


}
