package com.nankai.xining.service;

import com.nankai.xining.bean.FBareSoilDustSource;
import com.nankai.xining.bean.FBareSoilDustSourceExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FBareSoilDustSourceMapper;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-11 21:47
 */

@Service
public class BareSoilDustService {

    @Autowired
    FBareSoilDustSourceMapper fBareSoilDustSourceMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查找裸土
     * @param factoryId
     * @return
     */
    public List<FBareSoilDustSource> selectBareDustListByFactoryId(int factoryId) {
        FBareSoilDustSourceExample fBareSoilDustSourceExample = new FBareSoilDustSourceExample();
        FBareSoilDustSourceExample.Criteria criteria = fBareSoilDustSourceExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fBareSoilDustSourceMapper.selectByExample(fBareSoilDustSourceExample);
    }


    /**
     * 新增裸土
     * @param fBareSoilDustSource
     * @param factoryId
     * @return
     */
    public boolean addBareSoilDust(FBareSoilDustSource fBareSoilDustSource, Integer factoryId) {
        //设置企业ID
        fBareSoilDustSource.setFactoryid(factoryId);
        fBareSoilDustSource.setScccode("1601003002");

        if (fBareSoilDustSourceMapper.insertSelective(fBareSoilDustSource)!=0) {
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
     * 查找裸土
     * @param baresoilID
     * @return
     */
    public FBareSoilDustSource selectBareDustByID(Integer baresoilID) {
        return fBareSoilDustSourceMapper.selectByPrimaryKey(baresoilID);
    }

    /**
     * 更新
     * @param fBareSoilDustSource
     * @return
     */
    public boolean updateBareDust(FBareSoilDustSource fBareSoilDustSource) {
        if (fBareSoilDustSourceMapper.updateByPrimaryKey(fBareSoilDustSource)!=0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 删除
     * @param baresoilID
     * @return
     */
    public int deleteBareDust(int baresoilID) {
        if (fBareSoilDustSourceMapper.deleteByPrimaryKey(baresoilID)!=0){
            return 1;
        }else {
            return 0;
        }
    }
}
