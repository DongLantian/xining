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
 * @Date: 2019-05-21 20:55
 */

@Service
public class KilnService {

    @Autowired
    KilnTempMapper kilnTempMapper;

    @Autowired
    ExhaustTempMapper exhaustTempMapper;

    @Autowired
    TotalKilnTempMapper totalKilnTempMapper;

    @Autowired
    SccMapper sccMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询窑炉列表
     * @param factoryId
     * @return
     */
    public List<KilnTemp> selectKilnListByFactoryId(int factoryId) {
        List<KilnTemp> kilnTempList = kilnTempMapper.selectByFactoryIdWithJoin(factoryId);
        return kilnTempList;
    }


    /**
     * 根据ID查询窑炉
     * @param kilnID
     * @return
     */
    public KilnTemp selectKilnByID(Integer kilnID) {
        return kilnTempMapper.selectByPrimaryKey(kilnID);
    }

    /**
     * 新增窑炉
     * @param kilnTemp
     * @param factoryId
     * @return
     */
    @Transactional
    public boolean addKiln(KilnTemp kilnTemp, Integer factoryId) {

        //设置窑炉编号，需要先找出窑炉表中该工厂下编号最大的窑炉
        ExhaustTempExample exhaustTempExample = new ExhaustTempExample();
        ExhaustTempExample.Criteria exhCriteria = exhaustTempExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<ExhaustTemp> exhaustTempList= exhaustTempMapper.selectByExample(exhaustTempExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (ExhaustTemp temp:
                exhaustTempList) {
            exhaustIDList.add(temp.getExfId());
        }
        KilnTempExample kilnTempExample = new KilnTempExample();
        kilnTempExample.setOrderByClause("NK_NO DESC");
        KilnTempExample.Criteria criteria = kilnTempExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<KilnTemp> kilnTempList = kilnTempMapper.selectByExample(kilnTempExample);
        int curMaxNum=0;
        if (kilnTempList.size()!=0){
            KilnTemp maxNumKiln = kilnTempList.get(0);
            curMaxNum = maxNumKiln.getNkNo();
        }

        kilnTemp.setNkNo(curMaxNum+1);
        kilnTemp.setKilnNo(curMaxNum+1+"");

        //更新total_kiln数据
        TotalKilnTempExample totalKilnTempExample = new TotalKilnTempExample();
        TotalKilnTempExample.Criteria totalKcriteria = totalKilnTempExample.createCriteria();
        totalKcriteria.andFactoryIdEqualTo(factoryId);
        List<TotalKilnTemp> totalKilnTemp = totalKilnTempMapper.selectByExample(totalKilnTempExample);
        Integer tkilnID = -1;
        boolean flag=true;
        if (totalKilnTemp.size()!=0){
            //表中有总数记录，直接加一
            TotalKilnTemp totalKilnTemp1 = totalKilnTemp.get(0);
            tkilnID = totalKilnTemp1.getFkilntotalId();
            totalKilnTemp1.setFkilnNum(totalKilnTemp1.getFkilnNum()+1);
            if (totalKilnTempMapper.updateByPrimaryKey(totalKilnTemp1)==0){
                flag=false;
            }
        }else {
            //表中无总数字段，插入
            TotalKilnTemp totalKilnTemp2 = new TotalKilnTemp();
            totalKilnTemp2.setFactoryId(factoryId);
            totalKilnTemp2.setFkilnNum(1);
            if (totalKilnTempMapper.insert(totalKilnTemp2)!=0){
                totalKilnTemp=totalKilnTempMapper.selectByExample(totalKilnTempExample);
                tkilnID = totalKilnTemp.get(0).getFkilntotalId();
            }else {
                flag=false;
            }
        }


        //初始化kilnTemp
        Double fuelAuseage = kilnTemp.getKilnFuelAusage();
        String StrSCC="11"+kilnTemp.getFunctio()+kilnTemp.getFueltype()+kilnTemp.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        kilnTemp.setBc((scc.getBc()*fuelAuseage)/100);
        kilnTemp.setCo((scc.getCo()*fuelAuseage)/100);
        kilnTemp.setNh3((scc.getNh3()*fuelAuseage)/100);
        kilnTemp.setPm((scc.getPm()*fuelAuseage)/100);
        kilnTemp.setOc((scc.getOc()*fuelAuseage)/100);
        kilnTemp.setPm10((scc.getPm10()*fuelAuseage)/100);
        kilnTemp.setPm25((scc.getPm25()*fuelAuseage)/100);
        kilnTemp.setSo2((scc.getSo2()*fuelAuseage)/100);
        kilnTemp.setNox((scc.getNox()*fuelAuseage)/100);
        kilnTemp.setVoc((scc.getVocs()*fuelAuseage)/100);
        kilnTemp.setScccode(StrSCC);
        kilnTemp.setTkilnId(tkilnID);

        if (flag){
            if (kilnTempMapper.insertSelective(kilnTemp)!=0) {
                //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
                Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
                Date now = new Date();
                factory.setLastChangedTime(now);
                factoryMapper.updateByPrimaryKeySelective(factory);

                return true;
            }
            else return false;
        }else
            return false;
    }

    /**
     * 更改窑炉信息
     * @param kilnTemp
     * @return
     */
    public boolean updateKiln(KilnTemp kilnTemp) {
        //初始化kilnTemp
        Double fuelAuseage = kilnTemp.getKilnFuelAusage();
        String StrSCC="11"+kilnTemp.getFunctio()+kilnTemp.getFueltype()+kilnTemp.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        kilnTemp.setBc((scc.getBc()*fuelAuseage)/100);
        kilnTemp.setCo((scc.getCo()*fuelAuseage)/100);
        kilnTemp.setNh3((scc.getNh3()*fuelAuseage)/100);
        kilnTemp.setPm((scc.getPm()*fuelAuseage)/100);
        kilnTemp.setOc((scc.getOc()*fuelAuseage)/100);
        kilnTemp.setPm10((scc.getPm10()*fuelAuseage)/100);
        kilnTemp.setPm25((scc.getPm25()*fuelAuseage)/100);
        kilnTemp.setSo2((scc.getSo2()*fuelAuseage)/100);
        kilnTemp.setNox((scc.getNox()*fuelAuseage)/100);
        kilnTemp.setVoc((scc.getVocs()*fuelAuseage)/100);
        kilnTemp.setScccode(StrSCC);

        if (kilnTempMapper.updateByPrimaryKey(kilnTemp)!=0){
            return true;
        }else
            return false;
    }

    /**
     * 删除窑炉
     * @param kilnID 窑炉ID
     * @param factoryID 企业ID
     * @return
     */
    public int deleteKiln(int kilnID, Integer factoryID) {
        //删除窑炉的同时更改total表
        if (kilnTempMapper.deleteByPrimaryKey(kilnID)!=0){
            //更新total_kiln数据
            TotalKilnTempExample totalKilnTempExample = new TotalKilnTempExample();
            TotalKilnTempExample.Criteria totalKcriteria = totalKilnTempExample.createCriteria();
            totalKcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalKilnTemp> totalKilnTemp = totalKilnTempMapper.selectByExample(totalKilnTempExample);
            TotalKilnTemp totalKilnTemp1 = totalKilnTemp.get(0);
            totalKilnTemp1.setFkilnNum(totalKilnTemp1.getFkilnNum()-1);
            totalKilnTempMapper.updateByPrimaryKey(totalKilnTemp1);
            return 1;
        }else {
            return 0;
        }
    }
}
