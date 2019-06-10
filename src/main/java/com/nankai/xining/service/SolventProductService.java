package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.RongjiProductTempMapper;
import com.nankai.xining.repository.TotalRongjiTempMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-07 10:39
 */

@Service
public class SolventProductService {

    @Autowired
    RongjiProductTempMapper rongjiProductTempMapper;

    @Autowired
    TotalRongjiTempMapper totalRongjiTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询溶剂产品列表
     * @param factoryId
     * @return
     */
    public List<RongjiProductTemp> selectRawListByFactoryId(int factoryId) {
        List<RongjiProductTemp> rongjiProductTempList = rongjiProductTempMapper.selectByFactoryIdWithJoin(factoryId);
        return rongjiProductTempList;
    }


    /**
     * 根据ID查询溶剂产品
     * @param solventproductID
     * @return
     */
    public RongjiProductTemp selectsolventProductByID(Integer solventproductID) {
        return rongjiProductTempMapper.selectByPrimaryKey(solventproductID);
    }


    /**
     * 新增溶剂产品
     * @param rongjiProductTemp
     * @param factoryId
     * @return
     */
    public boolean addsolventProduct(RongjiProductTemp rongjiProductTemp, Integer factoryId) {

        //设置产品编号，需要先找出产品表中该工厂下编号最大的产品
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
        totalRongjiTempNew.setProductNum(totalRongjiTempNew.getProductNum()+1);
        totalRongjiTempMapper.updateByPrimaryKey(totalRongjiTempNew);
        //获取totalID
        totalSolventID = totalRongjiTempNew.getId();

        //这样就可以查询产品了
        RongjiProductTempExample rongjiProductTempExample = new RongjiProductTempExample();
        rongjiProductTempExample.setOrderByClause("nk_no DESC");
        RongjiProductTempExample.Criteria criteria2 = rongjiProductTempExample.createCriteria();
        criteria2.andDevicetotalIdEqualTo(totalSolventID);
        List<RongjiProductTemp> rongjiProductTempList = rongjiProductTempMapper.selectByExample(rongjiProductTempExample);
        int curMaxNum=0;
        if (rongjiProductTempList.size()!=0){
            RongjiProductTemp maxNumSolventProduct = rongjiProductTempList.get(0);
            curMaxNum = maxNumSolventProduct.getNkNo();
        }
        //设置原料序号
        rongjiProductTemp.setNkNo(curMaxNum+1);

        //初始化rongjiRawTemp
        String StrSCC="14"+rongjiProductTemp.getActivitiesCategory()+rongjiProductTemp.getNameCategory()+rongjiProductTemp.getDrainageProcess();
        rongjiProductTemp.setSccCode(StrSCC);
        rongjiProductTemp.setDevicetotalId(totalSolventID);


        if (rongjiProductTempMapper.insertSelective(rongjiProductTemp)!=0) {
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
     * 删除产品
     * @param solventproductID
     * @param factoryID
     * @return
     */
    public int deletesolventProduct(int solventproductID, Integer factoryID) {
        //删除产品的同时更改total表
        if (rongjiProductTempMapper.deleteByPrimaryKey(solventproductID)!=0){
            //更新total_rongji_temp数据
            TotalRongjiTempExample totalRongjiTempExample = new TotalRongjiTempExample();
            TotalRongjiTempExample.Criteria totalRcriteria = totalRongjiTempExample.createCriteria();
            totalRcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalRongjiTemp> totalRongjiTempList = totalRongjiTempMapper.selectByExample(totalRongjiTempExample);
            TotalRongjiTemp totalRongjiTemp = totalRongjiTempList.get(0);
            totalRongjiTemp.setProductNum(totalRongjiTemp.getProductNum()-1);
            totalRongjiTempMapper.updateByPrimaryKey(totalRongjiTemp);
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 更改溶剂产品信息
     * @param rongjiProductTemp
     * @return
     */
    public boolean updatesolventProduct(RongjiProductTemp rongjiProductTemp) {
        String StrSCC="14"+rongjiProductTemp.getActivitiesCategory()+rongjiProductTemp.getNameCategory()+rongjiProductTemp.getDrainageProcess();
        rongjiProductTemp.setSccCode(StrSCC);
        if (rongjiProductTempMapper.updateByPrimaryKey(rongjiProductTemp)!=0){
            return true;
        }else
            return false;
    }
}
