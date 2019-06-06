package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.RongjiRawTempMapper;
import com.nankai.xining.repository.SolventTempMapper;
import com.nankai.xining.repository.TotalRongjiTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-06 17:50
 */

@Service
public class SolventRawService {

    @Autowired
    RongjiRawTempMapper rongjiRawTempMapper;

    @Autowired
    TotalRongjiTempMapper totalRongjiTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询全部溶剂原料
     * @param factoryId
     * @return
     */
    public List<RongjiRawTemp> selectRawListByFactoryId(int factoryId) {
        List<RongjiRawTemp> rongjiRawTempList = rongjiRawTempMapper.selectByFactoryIdWithJoin(factoryId);
        return rongjiRawTempList;
    }


    /**
     * 根据ID查询溶剂原料
     * @param solventrawID
     * @return
     */
    public RongjiRawTemp selectsolventRawByID(Integer solventrawID) {
        return rongjiRawTempMapper.selectByPrimaryKey(solventrawID);
    }



    /**
     * 添加溶剂原料
     * @param rongjiRawTemp
     * @param factoryId
     * @return
     */
    public boolean addsolventRaw(RongjiRawTemp rongjiRawTemp, Integer factoryId) {
        //设置原料编号，需要先找出原料表中该工厂下编号最大的原料
        //首先在total_rongji_temp表找出该工厂对应的totalID
        TotalRongjiTempExample totalRongjiTempExample = new TotalRongjiTempExample();
        TotalRongjiTempExample.Criteria criteria = totalRongjiTempExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<TotalRongjiTemp> totalRongjiTempList = totalRongjiTempMapper.selectByExample(totalRongjiTempExample);
        int totalSolventID=0;
        //表中无记录，新建
        if (totalRongjiTempList.isEmpty()){
            TotalRongjiTemp totalRongjiTemp = new TotalRongjiTemp();
            totalRongjiTemp.setFactoryId(factoryId);
            totalRongjiTemp.setRawNum(0);
            totalRongjiTemp.setProductNum(0);
            totalRongjiTempMapper.insertSelective(totalRongjiTemp);
            totalRongjiTempList = totalRongjiTempMapper.selectByExample(totalRongjiTempExample);
        }
        //更新total表
        TotalRongjiTemp totalRongjiTempNew = totalRongjiTempList.get(0);
        totalRongjiTempNew.setRawNum(totalRongjiTempNew.getRawNum()+1);
        totalRongjiTempMapper.updateByPrimaryKey(totalRongjiTempNew);
        //获取totalID
        totalSolventID = totalRongjiTempNew.getId();

        //这样就可以查询原料了
        RongjiRawTempExample rongjiRawTempExample = new RongjiRawTempExample();
        rongjiRawTempExample.setOrderByClause("nk_no DESC");
        RongjiRawTempExample.Criteria criteria2 = rongjiRawTempExample.createCriteria();
        criteria2.andDevicetotalIdEqualTo(totalSolventID);
        List<RongjiRawTemp> rongjiRawTempList = rongjiRawTempMapper.selectByExample(rongjiRawTempExample);
        int curMaxNum=0;
        if (rongjiRawTempList.size()!=0){
            RongjiRawTemp maxNumSolventRaw = rongjiRawTempList.get(0);
            curMaxNum = maxNumSolventRaw.getNkNo();
        }
        //设置原料序号
        rongjiRawTemp.setNkNo(curMaxNum+1);

        //初始化rongjiRawTemp
        String StrSCC="14"+rongjiRawTemp.getScc2()+rongjiRawTemp.getScc3()+rongjiRawTemp.getScc4();
        rongjiRawTemp.setSccCode(StrSCC);
        rongjiRawTemp.setDevicetotalId(totalSolventID);


        if (rongjiRawTempMapper.insertSelective(rongjiRawTemp)!=0) {
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
     * 更新溶剂原料
     * @param rongjiRawTemp
     * @return
     */
    public boolean updatesolventRaw(RongjiRawTemp rongjiRawTemp) {
        String StrSCC="14"+rongjiRawTemp.getScc2()+rongjiRawTemp.getScc3()+rongjiRawTemp.getScc4();
        rongjiRawTemp.setSccCode(StrSCC);
        if (rongjiRawTempMapper.updateByPrimaryKey(rongjiRawTemp)!=0){
            return true;
        }else
            return false;
    }


    /**
     * 删除溶剂原料
     * @param solventrawID
     * @param factoryID
     * @return
     */
    public int deletesolventRaw(int solventrawID, Integer factoryID) {
        //删除原料的同时更改total表
        if (rongjiRawTempMapper.deleteByPrimaryKey(solventrawID)!=0){
            //更新total_rongji_temp数据
            TotalRongjiTempExample totalRongjiTempExample = new TotalRongjiTempExample();
            TotalRongjiTempExample.Criteria totalRcriteria = totalRongjiTempExample.createCriteria();
            totalRcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalRongjiTemp> totalRongjiTempList = totalRongjiTempMapper.selectByExample(totalRongjiTempExample);
            TotalRongjiTemp totalRongjiTemp = totalRongjiTempList.get(0);
            totalRongjiTemp.setRawNum(totalRongjiTemp.getRawNum()-1);
            totalRongjiTempMapper.updateByPrimaryKey(totalRongjiTemp);
            return 1;
        }else {
            return 0;
        }
    }
}
