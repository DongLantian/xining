package com.nankai.xining.service;

import com.nankai.xining.bean.FBareSoilDustSourceTemp;
import com.nankai.xining.bean.FBareSoilDustSourceTempExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FBareSoilDustSourceTempMapper;
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
    FBareSoilDustSourceTempMapper fBareSoilDustSourceTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查找裸土
     * @param factoryId
     * @return
     */
    public List<FBareSoilDustSourceTemp> selectBareDustListByFactoryId(int factoryId) {
        FBareSoilDustSourceTempExample fBareSoilDustSourceTempExample = new FBareSoilDustSourceTempExample();
        FBareSoilDustSourceTempExample.Criteria criteria = fBareSoilDustSourceTempExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fBareSoilDustSourceTempMapper.selectByExample(fBareSoilDustSourceTempExample);
    }


    /**
     * 新增裸土
     * @param fBareSoilDustSourceTemp
     * @param factoryId
     * @return
     */
    public boolean addBareSoilDust(FBareSoilDustSourceTemp fBareSoilDustSourceTemp, Integer factoryId) {
        //设置企业ID
        fBareSoilDustSourceTemp.setFactoryid(factoryId);
        fBareSoilDustSourceTemp.setScccode("1601003002");//装卸

        if (fBareSoilDustSourceTempMapper.insertSelective(fBareSoilDustSourceTemp)!=0) {
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
    public FBareSoilDustSourceTemp selectBareDustByID(Integer baresoilID) {
        return fBareSoilDustSourceTempMapper.selectByPrimaryKey(baresoilID);
    }

    /**
     * 更新
     * @param fBareSoilDustSourceTemp
     * @return
     */
    public boolean updateBareDust(FBareSoilDustSourceTemp fBareSoilDustSourceTemp) {
        if (fBareSoilDustSourceTempMapper.updateByPrimaryKey(fBareSoilDustSourceTemp)!=0){
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
        if (fBareSoilDustSourceTempMapper.deleteByPrimaryKey(baresoilID)!=0){
            return 1;
        }else {
            return 0;
        }
    }
}
