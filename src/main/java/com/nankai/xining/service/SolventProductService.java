package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.RongjiProductMapper;
import com.nankai.xining.repository.TotalRongjiMapper;
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
    RongjiProductMapper rongjiProductMapper;

    @Autowired
    TotalRongjiMapper totalRongjiMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询溶剂产品列表
     * @param factoryId
     * @return
     */
    public List<RongjiProduct> selectRawListByFactoryId(int factoryId) {
        List<RongjiProduct> rongjiProductList = rongjiProductMapper.selectByFactoryIdWithJoin(factoryId);
        return rongjiProductList;
    }


    /**
     * 根据ID查询溶剂产品
     * @param solventproductID
     * @return
     */
    public RongjiProduct selectsolventProductByID(Integer solventproductID) {
        return rongjiProductMapper.selectByPrimaryKey(solventproductID);
    }


    /**
     * 新增溶剂产品
     * @param rongjiProduct
     * @param factoryId
     * @return
     */
    public boolean addsolventProduct(RongjiProduct rongjiProduct, Integer factoryId) {

        //设置产品编号，需要先找出产品表中该工厂下编号最大的产品
        //首先在total_rongji_temp表找出该工厂对应的totalID
        TotalRongjiExample totalRongjiExample = new TotalRongjiExample();
        TotalRongjiExample.Criteria criteria = totalRongjiExample.createCriteria();
        criteria.andFactoryIdEqualTo(factoryId);
        List<TotalRongji> totalRongjiList = totalRongjiMapper.selectByExample(totalRongjiExample);
        int totalSolventID=0;
        //表中无记录，新建
        if (totalRongjiList.isEmpty()){
            TotalRongji totalRongji = new TotalRongji();
            totalRongji.setFactoryId(factoryId);
            totalRongji.setRawNum(0);
            totalRongji.setProductNum(0);
            totalRongjiMapper.insertSelective(totalRongji);
            totalRongjiList = totalRongjiMapper.selectByExample(totalRongjiExample);
        }
        //更新total表
        TotalRongji totalRongjiNew = totalRongjiList.get(0);
        totalRongjiNew.setProductNum(totalRongjiNew.getProductNum()+1);
        totalRongjiMapper.updateByPrimaryKey(totalRongjiNew);
        //获取totalID
        totalSolventID = totalRongjiNew.getId();

        //这样就可以查询产品了
        RongjiProductExample rongjiProductExample = new RongjiProductExample();
        rongjiProductExample.setOrderByClause("nk_no DESC");
        RongjiProductExample.Criteria criteria2 = rongjiProductExample.createCriteria();
        criteria2.andDevicetotalIdEqualTo(totalSolventID);
        List<RongjiProduct> rongjiProductList = rongjiProductMapper.selectByExample(rongjiProductExample);
        int curMaxNum=0;
        if (rongjiProductList.size()!=0){
            RongjiProduct maxNumSolventProduct = rongjiProductList.get(0);
            curMaxNum = maxNumSolventProduct.getNkNo();
        }
        //设置原料序号
        rongjiProduct.setNkNo(curMaxNum+1);

        //初始化rongjiRaw
        String StrSCC="14"+rongjiProduct.getActivitiesCategory()+rongjiProduct.getNameCategory()+rongjiProduct.getDrainageProcess();
        rongjiProduct.setSccCode(StrSCC);
        rongjiProduct.setDevicetotalId(totalSolventID);


        if (rongjiProductMapper.insertSelective(rongjiProduct)!=0) {
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
        if (rongjiProductMapper.deleteByPrimaryKey(solventproductID)!=0){
            //更新total_rongji_temp数据
            TotalRongjiExample totalRongjiExample = new TotalRongjiExample();
            TotalRongjiExample.Criteria totalRcriteria = totalRongjiExample.createCriteria();
            totalRcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalRongji> totalRongjiList = totalRongjiMapper.selectByExample(totalRongjiExample);
            TotalRongji totalRongji = totalRongjiList.get(0);
            totalRongji.setProductNum(totalRongji.getProductNum()-1);
            totalRongjiMapper.updateByPrimaryKey(totalRongji);
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 更改溶剂产品信息
     * @param rongjiProduct
     * @return
     */
    public boolean updatesolventProduct(RongjiProduct rongjiProduct) {
        String StrSCC="14"+rongjiProduct.getActivitiesCategory()+rongjiProduct.getNameCategory()+rongjiProduct.getDrainageProcess();
        rongjiProduct.setSccCode(StrSCC);
        if (rongjiProductMapper.updateByPrimaryKey(rongjiProduct)!=0){
            return true;
        }else
            return false;
    }
}
