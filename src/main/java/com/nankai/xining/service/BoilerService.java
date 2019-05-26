package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-15 10:00
 */

@Service
public class BoilerService {

    @Autowired
    BoilerTempMapper boilerTempMapper;

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    SccMapper sccMapper;

    @Autowired
    TotalBoilerTempMapper totalBoilerTempMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询锅炉信息列表
     * @param factoryId
     * @return
     */
    public List<BoilerTemp> selectBoilerListByFactoryId(int factoryId){
        List<BoilerTemp> boilerTempList = boilerTempMapper.selectByFactoryIdWithJoin(factoryId);
        return boilerTempList;
    }

    /**
     * 根据锅炉ID查询某个锅炉
     * @param boilerID
     * @return
     */
    public BoilerTemp selectBoilerById(Integer boilerID) {
        BoilerTemp boilerTemp = boilerTempMapper.selectByPrimaryKey(boilerID);
        return boilerTemp;
    }

    /**
     * 新增锅炉
     * @param boilerTemp
     * @param m_factoryId
     * @return
     */
    @Transactional
    public boolean addBoiler(BoilerTemp boilerTemp, Integer m_factoryId) {

        //设置锅炉编号，需要先找出锅炉表中该工厂下编号最大的锅炉
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        ExhaustTempExample.Criteria exhCriteria = exhaustTempExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(m_factoryId);
        List<ExhaustTemp> exhaustTempList= exhaustTempMapper.selectByExample(exhaustTempExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (ExhaustTemp temp:
                exhaustTempList) {
            exhaustIDList.add(temp.getExfId());
        }
        BoilerTempExample boilerTempExample = new BoilerTempExample();
        boilerTempExample.setOrderByClause("NK_NO DESC");
        BoilerTempExample.Criteria criteria = boilerTempExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<BoilerTemp> boilerTempList = boilerTempMapper.selectByExample(boilerTempExample);
        int curMaxNum=0;
        if (boilerTempList.size()!=0){
            BoilerTemp maxNumBoiler = boilerTempList.get(0);
            curMaxNum = maxNumBoiler.getNkNo();
        }


        boilerTemp.setNkNo(curMaxNum+1);

        //更新total_boiler数据
        TotalBoilerTempExample totalBoilerTempExample = new TotalBoilerTempExample();
        TotalBoilerTempExample.Criteria totalBcriteria = totalBoilerTempExample.createCriteria();
        totalBcriteria.andFactoryIdEqualTo(m_factoryId);
        List<TotalBoilerTemp> totalBoilerTemp = totalBoilerTempMapper.selectByExample(totalBoilerTempExample);
        Integer tboilerID = -1;
        boolean flag=true;
        if (totalBoilerTemp.size()!=0){
            //表中有总数记录，直接加一
            TotalBoilerTemp totalBoilerTemp1 = totalBoilerTemp.get(0);
            tboilerID = totalBoilerTemp1.getTboilerId();
            totalBoilerTemp1.setTboilerNum(totalBoilerTemp1.getTboilerNum()+1);
            if (totalBoilerTempMapper.updateByPrimaryKey(totalBoilerTemp1)==0){
                flag=false;
            }
        }else {
            //表中无总数字段，插入
            TotalBoilerTemp totalBoilerTemp2 = new TotalBoilerTemp();
            totalBoilerTemp2.setFactoryId(m_factoryId);
            totalBoilerTemp2.setTboilerNum(1);
            if (totalBoilerTempMapper.insert(totalBoilerTemp2)!=0){
                totalBoilerTemp=totalBoilerTempMapper.selectByExample(totalBoilerTempExample);
                tboilerID = totalBoilerTemp.get(0).getTboilerId();
            }else {
                flag=false;
            }
        }


        //初始化boilerTemp
        Double fuelAuseage = boilerTemp.getFuelAusage();
        String StrSCC="10"+boilerTemp.getFunctio()+boilerTemp.getFueltype()+boilerTemp.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        boilerTemp.setBc((scc.getBc()*fuelAuseage)/100);
        boilerTemp.setCo((scc.getCo()*fuelAuseage)/100);
        boilerTemp.setNh3((scc.getNh3()*fuelAuseage)/100);
        boilerTemp.setPm((scc.getPm()*fuelAuseage)/100);
        boilerTemp.setOc((scc.getOc()*fuelAuseage)/100);
        boilerTemp.setPm10((scc.getPm10()*fuelAuseage)/100);
        boilerTemp.setPm25((scc.getPm25()*fuelAuseage)/100);
        boilerTemp.setSo2((scc.getSo2()*fuelAuseage)/100);
        boilerTemp.setNox((scc.getNox()*fuelAuseage)/100);
        boilerTemp.setVoc((scc.getVocs()*fuelAuseage)/100);
        boilerTemp.setScc(StrSCC);
        boilerTemp.setTboilerId(tboilerID);

        if (flag){
            if (boilerTempMapper.insertSelective(boilerTemp)!=0) {
                //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
                Factory fac = factoryMapper.selectByPrimaryKey(m_factoryId);
                Date now = new Date();
                fac.setLastChangedTime(now);
                factoryMapper.updateByPrimaryKeySelective(fac);

                return true;
            }
            else return false;
        }else
            return false;
    }

    /**
     * 更新选中的烟囱信息
     * @param boilerTemp
     * @return
     */
    @Transactional
    public boolean updateBoiler(BoilerTemp boilerTemp) {
        //初始化boilerTemp
        Double fuelAuseage = boilerTemp.getFuelAusage();
        String StrSCC="10"+boilerTemp.getFunctio()+boilerTemp.getFueltype()+boilerTemp.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        boilerTemp.setBc((scc.getBc()*fuelAuseage)/100);
        boilerTemp.setCo((scc.getCo()*fuelAuseage)/100);
        boilerTemp.setNh3((scc.getNh3()*fuelAuseage)/100);
        boilerTemp.setPm((scc.getPm()*fuelAuseage)/100);
        boilerTemp.setOc((scc.getOc()*fuelAuseage)/100);
        boilerTemp.setPm10((scc.getPm10()*fuelAuseage)/100);
        boilerTemp.setPm25((scc.getPm25()*fuelAuseage)/100);
        boilerTemp.setSo2((scc.getSo2()*fuelAuseage)/100);
        boilerTemp.setNox((scc.getNox()*fuelAuseage)/100);
        boilerTemp.setVoc((scc.getVocs()*fuelAuseage)/100);
        boilerTemp.setScc(StrSCC);
        if (boilerTempMapper.updateByPrimaryKey(boilerTemp)!=0){
            return true;
        }else
            return false;
    }


    /**
     * 删除锅炉
     * @param boilerID
     * @param factoryID
     * @return
     */
    @Transactional
    public int deleteBoiler(int boilerID, Integer factoryID) {
        //删除锅炉的同时更改total表
        if (boilerTempMapper.deleteByPrimaryKey(boilerID)!=0){
            //更新total_boiler数据
            TotalBoilerTempExample totalBoilerTempExample = new TotalBoilerTempExample();
            TotalBoilerTempExample.Criteria totalBcriteria = totalBoilerTempExample.createCriteria();
            totalBcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalBoilerTemp> totalBoilerTemp = totalBoilerTempMapper.selectByExample(totalBoilerTempExample);
            TotalBoilerTemp totalBoilerTemp1 = totalBoilerTemp.get(0);
            totalBoilerTemp1.setTboilerNum(totalBoilerTemp1.getTboilerNum()-1);
            totalBoilerTempMapper.updateByPrimaryKey(totalBoilerTemp1);
            return 1;
        }else {
            return 0;
        }

    }
}
