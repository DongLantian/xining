package com.nankai.xining.service;

import com.nankai.xining.bean.FConstructionDustSourceTemp;
import com.nankai.xining.bean.FConstructionDustSourceTempExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FConstructionDustSourceTempMapper;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-11 10:58
 */

@Service
public class ConstructionDustService {

    @Autowired
    FConstructionDustSourceTempMapper fConstructionDustSourceTempMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询施工源列表
     * @param factoryId
     * @return
     */
    public List<FConstructionDustSourceTemp> selectConsDustListByFactoryId(int factoryId) {
        FConstructionDustSourceTempExample fConstructionDustSourceTempExample = new FConstructionDustSourceTempExample();
        FConstructionDustSourceTempExample.Criteria criteria = fConstructionDustSourceTempExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fConstructionDustSourceTempMapper.selectByExample(fConstructionDustSourceTempExample);
    }

    /**
     * 添加施工源
     * @param fConstructionDustSourceTemp
     * @param factoryId
     * @return
     */
    public boolean addConsDust(FConstructionDustSourceTemp fConstructionDustSourceTemp, Integer factoryId) {
        //设置企业ID
        fConstructionDustSourceTemp.setFactoryid(factoryId);
        String scc="1603";

        //三级
        if(fConstructionDustSourceTemp.getConstructionType().equals("城市市政基础设施建设")){
            scc+="001";}else
        if(fConstructionDustSourceTemp.getConstructionType().equals("建筑物建造与拆迁")){
            scc+="002";}else
        if(fConstructionDustSourceTemp.getConstructionType().equals("设备安装工程")){
            scc+="003";}else{scc+="004";}

        //四级
        if(fConstructionDustSourceTemp.getConstructState().equals("未分类")){
            scc+="000";
        }else if(fConstructionDustSourceTemp.getConstructState().equals("土方开挖")){
            scc+="001";
        }else if(fConstructionDustSourceTemp.getConstructState().equals("地基建设")){
            scc+="002";
        }else if(fConstructionDustSourceTemp.getConstructState().equals("土方回填")){
            scc+="003";
        }else if(fConstructionDustSourceTemp.getConstructState().equals("主体建设")){
            scc+="004";
        }else{
            scc+="005";
        }
        fConstructionDustSourceTemp.setScccode(scc);

        if (fConstructionDustSourceTempMapper.insertSelective(fConstructionDustSourceTemp)!=0) {
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
     * 根据ID查找施工源
     * @param conDustID
     * @return
     */
    public FConstructionDustSourceTemp selectConDustByID(Integer conDustID) {
        return fConstructionDustSourceTempMapper.selectByPrimaryKey(conDustID);
    }

    /**
     * 更新
     * @param fConstructionDustSourceTemp
     * @return
     */
    public boolean updateConDust(FConstructionDustSourceTemp fConstructionDustSourceTemp) {
        if (fConstructionDustSourceTempMapper.updateByPrimaryKey(fConstructionDustSourceTemp)!=0){
            return true;
        }else {
            return false;
        }
    }


    /**
     * 删除施工源
     * @param conDustID
     * @return
     */
    public int deleteConDust(int conDustID) {
        if (fConstructionDustSourceTempMapper.deleteByPrimaryKey(conDustID)!=0){
            return 1;
        }else {
            return 0;
        }
    }


}
