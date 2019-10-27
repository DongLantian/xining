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
    KilnMapper kilnMapper;

    @Autowired
    ExhaustMapper exhaustMapper;

    @Autowired
    TotalKilnMapper totalKilnMapper;

    @Autowired
    SccMapper sccMapper;

    @Autowired
    FactoryMapper factoryMapper;

    /**
     * 根据企业ID查询窑炉列表
     * @param factoryId
     * @return
     */
    public List<Kiln> selectKilnListByFactoryId(int factoryId) {
        List<Kiln> kilnList = kilnMapper.selectByFactoryIdWithJoin(factoryId);
        return kilnList;
    }


    /**
     * 根据ID查询窑炉
     * @param kilnID
     * @return
     */
    public Kiln selectKilnByID(Integer kilnID) {
        return kilnMapper.selectByPrimaryKey(kilnID);
    }

    /**
     * 新增窑炉
     * @param kiln
     * @param factoryId
     * @return
     */
    @Transactional
    public boolean addKiln(Kiln kiln, Integer factoryId) {

        //设置窑炉编号，需要先找出窑炉表中该工厂下编号最大的窑炉
        ExhaustExample exhaustExample = new ExhaustExample();
        ExhaustExample.Criteria exhCriteria = exhaustExample.createCriteria();
        exhCriteria.andFactoryIdEqualTo(factoryId);
        List<Exhaust> exhaustList= exhaustMapper.selectByExample(exhaustExample);
        List<Integer> exhaustIDList = new ArrayList<>();
        for (Exhaust temp:
                exhaustList) {
            exhaustIDList.add(temp.getExfId());
        }
        KilnExample kilnExample = new KilnExample();
        kilnExample.setOrderByClause("NK_NO DESC");
        KilnExample.Criteria criteria = kilnExample.createCriteria();
        criteria.andExhustIdIn(exhaustIDList);
        List<Kiln> kilnList = kilnMapper.selectByExample(kilnExample);
        int curMaxNum=0;
        if (kilnList.size()!=0){
            Kiln maxNumKiln = kilnList.get(0);
            curMaxNum = maxNumKiln.getNkNo();
        }

        kiln.setNkNo(curMaxNum+1);
        kiln.setKilnNo(curMaxNum+1+"");

        //更新total_kiln数据
        TotalKilnExample totalKilnExample = new TotalKilnExample();
        TotalKilnExample.Criteria totalKcriteria = totalKilnExample.createCriteria();
        totalKcriteria.andFactoryIdEqualTo(factoryId);
        List<TotalKiln> totalKiln = totalKilnMapper.selectByExample(totalKilnExample);
        Integer tkilnID = -1;
        boolean flag=true;
        if (totalKiln.size()!=0){
            //表中有总数记录，直接加一
            TotalKiln totalKiln1 = totalKiln.get(0);
            tkilnID = totalKiln1.getFkilntotalId();
            totalKiln1.setFkilnNum(totalKiln1.getFkilnNum()+1);
            if (totalKilnMapper.updateByPrimaryKey(totalKiln1)==0){
                flag=false;
            }
        }else {
            //表中无总数字段，插入
            TotalKiln totalKiln2 = new TotalKiln();
            totalKiln2.setFactoryId(factoryId);
            totalKiln2.setFkilnNum(1);
            if (totalKilnMapper.insert(totalKiln2)!=0){
                totalKiln=totalKilnMapper.selectByExample(totalKilnExample);
                tkilnID = totalKiln.get(0).getFkilntotalId();
            }else {
                flag=false;
            }
        }


        //初始化kiln
        Double fuelAuseage = kiln.getKilnFuelAusage();
        String StrSCC="11"+kiln.getFunctio()+kiln.getFueltype()+kiln.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        kiln.setBc((scc.getBc()*fuelAuseage)/100);
        kiln.setCo((scc.getCo()*fuelAuseage)/100);
        kiln.setNh3((scc.getNh3()*fuelAuseage)/100);
        kiln.setPm((scc.getPm()*fuelAuseage)/100);
        kiln.setOc((scc.getOc()*fuelAuseage)/100);
        kiln.setPm10((scc.getPm10()*fuelAuseage)/100);
        kiln.setPm25((scc.getPm25()*fuelAuseage)/100);
        kiln.setSo2((scc.getSo2()*fuelAuseage)/100);
        kiln.setNox((scc.getNox()*fuelAuseage)/100);
        kiln.setVoc((scc.getVocs()*fuelAuseage)/100);
        kiln.setScccode(StrSCC);
        kiln.setTkilnId(tkilnID);

        if (flag){
            if (kilnMapper.insertSelective(kiln)!=0) {
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
     * @param kiln
     * @return
     */
    public boolean updateKiln(Kiln kiln) {
        //初始化kiln
        Double fuelAuseage = kiln.getKilnFuelAusage();
        String StrSCC="11"+kiln.getFunctio()+kiln.getFueltype()+kiln.getModel();
        Scc scc = sccMapper.selectByPrimaryKey(StrSCC);
        kiln.setBc((scc.getBc()*fuelAuseage)/100);
        kiln.setCo((scc.getCo()*fuelAuseage)/100);
        kiln.setNh3((scc.getNh3()*fuelAuseage)/100);
        kiln.setPm((scc.getPm()*fuelAuseage)/100);
        kiln.setOc((scc.getOc()*fuelAuseage)/100);
        kiln.setPm10((scc.getPm10()*fuelAuseage)/100);
        kiln.setPm25((scc.getPm25()*fuelAuseage)/100);
        kiln.setSo2((scc.getSo2()*fuelAuseage)/100);
        kiln.setNox((scc.getNox()*fuelAuseage)/100);
        kiln.setVoc((scc.getVocs()*fuelAuseage)/100);
        kiln.setScccode(StrSCC);

        if (kilnMapper.updateByPrimaryKey(kiln)!=0){
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
        if (kilnMapper.deleteByPrimaryKey(kilnID)!=0){
            //更新total_kiln数据
            TotalKilnExample totalKilnExample = new TotalKilnExample();
            TotalKilnExample.Criteria totalKcriteria = totalKilnExample.createCriteria();
            totalKcriteria.andFactoryIdEqualTo(factoryID);
            List<TotalKiln> totalKiln = totalKilnMapper.selectByExample(totalKilnExample);
            TotalKiln totalKiln1 = totalKiln.get(0);
            totalKiln1.setFkilnNum(totalKiln1.getFkilnNum()-1);
            totalKilnMapper.updateByPrimaryKey(totalKiln1);
            return 1;
        }else {
            return 0;
        }
    }
}
