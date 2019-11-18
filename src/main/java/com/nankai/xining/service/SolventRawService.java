package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FactoryMapper;
import com.nankai.xining.repository.RongjiRawMapper;
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
    RongjiRawMapper rongjiRawMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询全部溶剂原料
     * @param factoryId
     * @return
     */
    public List<RongjiRaw> selectRawListByFactoryId(int factoryId) {
        List<RongjiRaw> rongjiRawList = rongjiRawMapper.selectByFactoryIdWithJoin(factoryId);
        return rongjiRawList;
    }


    /**
     * 根据ID查询溶剂原料
     * @param solventrawID
     * @return
     */
    public RongjiRaw selectsolventRawByID(Integer solventrawID) {
        return rongjiRawMapper.selectByPrimaryKey(solventrawID);
    }



    /**
     * 添加溶剂原料
     * @param rongjiRaw
     * @param factoryId
     * @return
     */
    public boolean addsolventRaw(RongjiRaw rongjiRaw, Integer factoryId) {
        //设置原料编号，需要先找出原料表中该工厂下编号最大的原料
        RongjiRawExample rongjiRawExample = new RongjiRawExample();
        rongjiRawExample.setOrderByClause("nk_no DESC");
        RongjiRawExample.Criteria criteria2 = rongjiRawExample.createCriteria();
        criteria2.andFactoryIdEqualTo(factoryId);
        List<RongjiRaw> rongjiRawList = rongjiRawMapper.selectByExample(rongjiRawExample);
        int curMaxNum=0;
        if (rongjiRawList.size()!=0){
            RongjiRaw maxNumSolventRaw = rongjiRawList.get(0);
            curMaxNum = maxNumSolventRaw.getNkNo();
        }
        //设置原料序号
        rongjiRaw.setNkNo(curMaxNum+1);
        rongjiRaw.setFactoryId(factoryId);

        //更新factory中的count数据
        Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
        int rongjiRawCount = rongjiRawList.size()+1;
        factory.setRongjiRawCount(rongjiRawCount);

        //初始化rongjiRaw
        String StrSCC="14"+rongjiRaw.getScc2()+rongjiRaw.getScc3()+rongjiRaw.getScc4();
        rongjiRaw.setSccCode(StrSCC);


        if (rongjiRawMapper.insertSelective(rongjiRaw)!=0) {
            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;

    }


    /**
     * 更新溶剂原料
     * @param rongjiRaw
     * @return
     */
    public boolean updatesolventRaw(RongjiRaw rongjiRaw) {
        String StrSCC="14"+rongjiRaw.getScc2()+rongjiRaw.getScc3()+rongjiRaw.getScc4();
        rongjiRaw.setSccCode(StrSCC);
        if (rongjiRawMapper.updateByPrimaryKey(rongjiRaw)!=0){
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
        if (rongjiRawMapper.deleteByPrimaryKey(solventrawID)!=0){
            Factory factory = factoryMapper.selectByPrimaryKey(factoryID);
            int rongjiRawCount = factory.getRongjiRawCount()-1;
            factory.setRongjiRawCount(rongjiRawCount);
            factoryMapper.updateByPrimaryKeySelective(factory);
            return 1;
        }else {
            return 0;
        }
    }
}
