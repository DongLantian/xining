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
    BoilerMapper boilerMapper;

    @Autowired
    ExhaustMapper exhaustMapper;

    @Autowired
    SccMapper sccMapper;

    @Autowired
    TotalBoilerMapper totalBoilerMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询锅炉信息列表
     * @param factoryId
     * @return
     */
    public List<Boiler> selectBoilerListByFactoryId(int factoryId){
        List<Boiler> boilerList = boilerMapper.selectByFactoryIdWithJoin(factoryId);
        return boilerList;
    }

    /**
     * 根据锅炉ID查询某个锅炉
     * @param boilerID
     * @return
     */
    public Boiler selectBoilerById(Integer boilerID) {
        Boiler boiler = boilerMapper.selectByPrimaryKey(boilerID);
        return boiler;
    }

    /**
     * 新增锅炉
     * @param boiler
     * @param m_factoryId
     * @return
     */
    @Transactional
    public boolean addBoiler(Boiler boiler, Integer m_factoryId) {

        //设置锅炉编号，需要先找出锅炉表中该工厂下编号最大的锅炉
        ExhaustExample exhaustExample = new ExhaustExample();
        ExhaustExample.Criteria exhCriteria = exhaustExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(m_factoryId);
        List<Exhaust> exhaustList= exhaustMapper.selectByExample(exhaustExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (Exhaust temp:
                exhaustList) {
            exhaustIDList.add(temp.getExfId());
        }
        BoilerExample boilerExample = new BoilerExample();
        boilerExample.setOrderByClause("NK_NO DESC");
        BoilerExample.Criteria criteria = boilerExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<Boiler> boilerList = boilerMapper.selectByExample(boilerExample);
        int curMaxNum=0;
        if (boilerList.size()!=0){
            Boiler maxNumBoiler = boilerList.get(0);
            curMaxNum = maxNumBoiler.getNkNo();
        }


        boiler.setNkNo(curMaxNum+1);

        //更新total_boiler数据
        TotalBoilerExample totalBoilerExample = new TotalBoilerExample();
        TotalBoilerExample.Criteria totalBcriteria = totalBoilerExample.createCriteria();
        totalBcriteria.andFactoryIdEqualTo(m_factoryId);
        List<TotalBoiler> totalBoiler = totalBoilerMapper.selectByExample(totalBoilerExample);
        Integer tboilerID = -1;
        boolean flag=true;
        if (totalBoiler.size()!=0){
            //表中有总数记录，直接加一
            TotalBoiler totalBoiler1 = totalBoiler.get(0);
            tboilerID = totalBoiler1.getTboilerId();
            totalBoiler1.setTboilerNum(totalBoiler1.getTboilerNum()+1);
            if (totalBoilerMapper.updateByPrimaryKey(totalBoiler1)==0){
                flag=false;
            }
        }else {
            //表中无总数字段，插入
            TotalBoiler totalBoiler2 = new TotalBoiler();
            totalBoiler2.setFactoryId(m_factoryId);
            totalBoiler2.setTboilerNum(1);
            if (totalBoilerMapper.insert(totalBoiler2)!=0){
                totalBoiler=totalBoilerMapper.selectByExample(totalBoilerExample);
                tboilerID = totalBoiler.get(0).getTboilerId();
            }else {
                flag=false;
            }
        }


        //初始化boiler
        Double fuelAuseage = boiler.getFuelAusage();
        String StrSCC="10"+boiler.getFunctio()+boiler.getFueltype()+boiler.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        boiler.setBc((scc.getBc()*fuelAuseage)/100);
        boiler.setCo((scc.getCo()*fuelAuseage)/100);
        boiler.setNh3((scc.getNh3()*fuelAuseage)/100);
        boiler.setPm((scc.getPm()*fuelAuseage)/100);
        boiler.setOc((scc.getOc()*fuelAuseage)/100);
        boiler.setPm10((scc.getPm10()*fuelAuseage)/100);
        boiler.setPm25((scc.getPm25()*fuelAuseage)/100);
        boiler.setSo2((scc.getSo2()*fuelAuseage)/100);
        boiler.setNox((scc.getNox()*fuelAuseage)/100);
        boiler.setVoc((scc.getVocs()*fuelAuseage)/100);
        boiler.setScc(StrSCC);
        boiler.setTboilerId(tboilerID);

        if (flag){
            if (boilerMapper.insertSelective(boiler)!=0) {
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
     * @param boiler
     * @return
     */
    @Transactional
    public boolean updateBoiler(Boiler boiler) {
        //初始化boiler
        Double fuelAuseage = boiler.getFuelAusage();
        String StrSCC="10"+boiler.getFunctio()+boiler.getFueltype()+boiler.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        boiler.setBc((scc.getBc()*fuelAuseage)/100);
        boiler.setCo((scc.getCo()*fuelAuseage)/100);
        boiler.setNh3((scc.getNh3()*fuelAuseage)/100);
        boiler.setPm((scc.getPm()*fuelAuseage)/100);
        boiler.setOc((scc.getOc()*fuelAuseage)/100);
        boiler.setPm10((scc.getPm10()*fuelAuseage)/100);
        boiler.setPm25((scc.getPm25()*fuelAuseage)/100);
        boiler.setSo2((scc.getSo2()*fuelAuseage)/100);
        boiler.setNox((scc.getNox()*fuelAuseage)/100);
        boiler.setVoc((scc.getVocs()*fuelAuseage)/100);
        boiler.setScc(StrSCC);
        if (boilerMapper.updateByPrimaryKey(boiler)!=0){
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
        if (boilerMapper.deleteByPrimaryKey(boilerID)!=0){
            //更新total_boiler数据
            TotalBoilerExample totalBoilerExample = new TotalBoilerExample();
            TotalBoilerExample.Criteria totalBcriteria = totalBoilerExample.createCriteria();
            totalBcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalBoiler> totalBoiler = totalBoilerMapper.selectByExample(totalBoilerExample);
            TotalBoiler totalBoiler1 = totalBoiler.get(0);
            totalBoiler1.setTboilerNum(totalBoiler1.getTboilerNum()-1);
            totalBoilerMapper.updateByPrimaryKey(totalBoiler1);
            return 1;
        }else {
            return 0;
        }

    }
}
