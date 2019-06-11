package com.nankai.xining.service;

import com.nankai.xining.bean.FYardDustSourceTemp;
import com.nankai.xining.bean.FYardDustSourceTempExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FYardDustSourceTempMapper;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-11 19:50
 */

@Service
public class YardDustService {

    @Autowired
    FYardDustSourceTempMapper fYardDustSourceTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID选择堆场列表
     * @param factoryId
     * @return
     */
    public List<FYardDustSourceTemp> selectYardDustListByFactoryId(int factoryId) {
        FYardDustSourceTempExample fYardDustSourceTempExample = new FYardDustSourceTempExample();
        FYardDustSourceTempExample.Criteria criteria = fYardDustSourceTempExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fYardDustSourceTempMapper.selectByExample(fYardDustSourceTempExample);
    }


    /**
     * 增加堆场
     * @param fYardDustSourceTemp
     * @param factoryId
     * @return
     */
    public boolean addYardDust(FYardDustSourceTemp fYardDustSourceTemp, Integer factoryId) {
        //设置企业ID
        fYardDustSourceTemp.setFactoryid(factoryId);
        //定义SCC变量
        String sccvalue="1604002";//风蚀
        String mvariable=fYardDustSourceTemp.getMaterialType();
        fYardDustSourceTemp.setMaterialType(mvariable);
        if(mvariable.equals("未分类")){
            sccvalue+="000";
        }else if(mvariable.equals("焦炭")){
            sccvalue+="001";
        }else if(mvariable.equals("块矿")){
            sccvalue+="002";
        }else if(mvariable.equals("矿渣") || mvariable.equals("炉渣")){
            sccvalue+="003";
        }else if(mvariable.equals("煤灰") || mvariable.equals("灰渣")){
            sccvalue+="004";
        }else if(mvariable.equals("煤炭")){
            sccvalue+="005";
        }else if(mvariable.equals("球团矿")){
            sccvalue+="006";
        }else if(mvariable.equals("沙石")){
            sccvalue+="007";
        }else if(mvariable.equals("砂石")){
            sccvalue+="008";
        }else if(mvariable.equals("石灰石")){
            sccvalue+="009";
        }else if(mvariable.equals("水泥熟料")){
            sccvalue+="010";
        }else{
            sccvalue+="011";
        }

        //装卸SCC
        //定义SCC变量
        String sccvalue1="1604001";
        String mvariable1=fYardDustSourceTemp.getMaterialType();
        if(mvariable1.equals("未分类")){
            sccvalue1+="000";
        }else if(mvariable.equals("焦炭")){
            sccvalue1+="001";
        }else if(mvariable1.equals("块矿")){
            sccvalue1+="002";
        }else if(mvariable1.equals("矿渣") || mvariable.equals("炉渣")){
            sccvalue1+="003";
        }else if(mvariable1.equals("煤灰") || mvariable.equals("灰渣")){
            sccvalue1+="004";
        }else if(mvariable1.equals("煤炭")){
            sccvalue1+="005";
        }else if(mvariable1.equals("球团矿")){
            sccvalue1+="006";
        }else if(mvariable1.equals("沙石")){
            sccvalue1+="007";
        }else if(mvariable1.equals("砂石")){
            sccvalue1+="008";
        }else if(mvariable1.equals("石灰石")){
            sccvalue1+="009";
        }else if(mvariable1.equals("水泥熟料")){
            sccvalue1+="010";
        }else{
            sccvalue1+="011";
        }
        fYardDustSourceTemp.setScccode(sccvalue);//风蚀
        fYardDustSourceTemp.setScccode1(sccvalue1);//装卸

        if (fYardDustSourceTempMapper.insertSelective(fYardDustSourceTemp)!=0) {
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
     * 查找堆场
     * @param yardID
     * @return
     */
    public FYardDustSourceTemp selectYardDustByID(Integer yardID) {
        return fYardDustSourceTempMapper.selectByPrimaryKey(yardID);
    }


    /**
     * 更新
     * @param fYardDustSourceTemp
     * @return
     */
    public boolean updateYardDust(FYardDustSourceTemp fYardDustSourceTemp) {
        if (fYardDustSourceTempMapper.updateByPrimaryKey(fYardDustSourceTemp)!=0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 删除
     * @param yardDustID
     * @return
     */
    public int deleteYardDust(int yardDustID) {
        if (fYardDustSourceTempMapper.deleteByPrimaryKey(yardDustID)!=0){
            return 1;
        }else {
            return 0;
        }
    }
}
