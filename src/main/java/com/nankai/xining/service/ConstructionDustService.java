package com.nankai.xining.service;

import com.nankai.xining.bean.FConstructionDustSource;
import com.nankai.xining.bean.FConstructionDustSourceExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FConstructionDustSourceMapper;
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
    FConstructionDustSourceMapper fConstructionDustSourceMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询施工源列表
     * @param factoryId
     * @return
     */
    public List<FConstructionDustSource> selectConsDustListByFactoryId(int factoryId) {
        FConstructionDustSourceExample fConstructionDustSourceExample = new FConstructionDustSourceExample();
        FConstructionDustSourceExample.Criteria criteria = fConstructionDustSourceExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fConstructionDustSourceMapper.selectByExample(fConstructionDustSourceExample);
    }

    /**
     * 添加施工源
     * @param fConstructionDustSource
     * @param factoryId
     * @return
     */
    public boolean addConsDust(FConstructionDustSource fConstructionDustSource, Integer factoryId) {
        //设置企业ID
        fConstructionDustSource.setFactoryid(factoryId);
        String scc="1603";

        //三级
        if(fConstructionDustSource.getConstructionType().equals("城市市政基础设施建设")){
            scc+="001";}else
        if(fConstructionDustSource.getConstructionType().equals("建筑物建造与拆迁")){
            scc+="002";}else
        if(fConstructionDustSource.getConstructionType().equals("设备安装工程")){
            scc+="003";}else{scc+="004";}

        //四级
        if(fConstructionDustSource.getConstructState().equals("未分类")){
            scc+="000";
        }else if(fConstructionDustSource.getConstructState().equals("土方开挖")){
            scc+="001";
        }else if(fConstructionDustSource.getConstructState().equals("地基建设")){
            scc+="002";
        }else if(fConstructionDustSource.getConstructState().equals("土方回填")){
            scc+="003";
        }else if(fConstructionDustSource.getConstructState().equals("主体建设")){
            scc+="004";
        }else{
            scc+="005";
        }
        fConstructionDustSource.setScccode(scc);

        if (fConstructionDustSourceMapper.insertSelective(fConstructionDustSource)!=0) {
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
    public FConstructionDustSource selectConDustByID(Integer conDustID) {
        return fConstructionDustSourceMapper.selectByPrimaryKey(conDustID);
    }

    /**
     * 更新
     * @param fConstructionDustSource
     * @return
     */
    public boolean updateConDust(FConstructionDustSource fConstructionDustSource) {
        if (fConstructionDustSourceMapper.updateByPrimaryKey(fConstructionDustSource)!=0){
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
        if (fConstructionDustSourceMapper.deleteByPrimaryKey(conDustID)!=0){
            return 1;
        }else {
            return 0;
        }
    }


}
