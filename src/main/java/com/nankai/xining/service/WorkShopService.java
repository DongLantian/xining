package com.nankai.xining.service;

import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FNoOrganizationWorkshopDischargeMapper;
import com.nankai.xining.repository.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-12 13:49
 */

@Service
public class WorkShopService {

    @Autowired
    FNoOrganizationWorkshopDischargeMapper fNoOrganizationWorkshopDischargeMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询车间
     * @param factoryId
     * @return
     */
    public List<FNoOrganizationWorkshopDischarge> selectWorkShopListByFactoryId(int factoryId) {
        FNoOrganizationWorkshopDischargeExample fNoOrganizationWorkshopDischargeExample = new FNoOrganizationWorkshopDischargeExample();
        FNoOrganizationWorkshopDischargeExample.Criteria criteria = fNoOrganizationWorkshopDischargeExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fNoOrganizationWorkshopDischargeMapper.selectByExample(fNoOrganizationWorkshopDischargeExample);
    }

    /**
     * 根据ID查询车间
     * @param workshopID
     * @return
     */
    public FNoOrganizationWorkshopDischarge selectworkShopByID(Integer workshopID) {
        return fNoOrganizationWorkshopDischargeMapper.selectByPrimaryKey(workshopID);
    }

    /**
     * 新增车间
     * @param fNoOrganizationWorkshopDischarge
     * @param factoryId
     * @return
     */
    public boolean addWorkShop(FNoOrganizationWorkshopDischarge fNoOrganizationWorkshopDischarge, Integer factoryId) {
        //设置企业ID
        fNoOrganizationWorkshopDischarge.setFactoryid(factoryId);
        fNoOrganizationWorkshopDischarge.setScccode("1001110100");

        FNoOrganizationWorkshopDischargeExample fNoOrganizationWorkshopDischargeExample = new FNoOrganizationWorkshopDischargeExample();
        FNoOrganizationWorkshopDischargeExample.Criteria criteria = fNoOrganizationWorkshopDischargeExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        List<FNoOrganizationWorkshopDischarge> fNoOrganizationWorkshopDischargeList = fNoOrganizationWorkshopDischargeMapper.selectByExample(fNoOrganizationWorkshopDischargeExample);
        //更新factory中的count数据
        Factory factory = factoryMapper.selectByPrimaryKey(factoryId);
        int fNoOraWsDustCount = fNoOrganizationWorkshopDischargeList.size()+1;
        factory.setNoOrgWorkCount(fNoOraWsDustCount);

        if (fNoOrganizationWorkshopDischargeMapper.insertSelective(fNoOrganizationWorkshopDischarge)!=0) {
            //设置factory表中的更新时间：由于添加锅炉时早已添加烟囱，所以只需设置更新时间即可，不用判断了。
            Date now = new Date();
            factory.setLastChangedTime(now);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return true;
        }
        else return false;
    }

    /**
     * 更新车间
     * @param fNoOrganizationWorkshopDischarge
     * @return
     */
    public boolean updateWorkShop(FNoOrganizationWorkshopDischarge fNoOrganizationWorkshopDischarge) {
        if(fNoOrganizationWorkshopDischargeMapper.updateByPrimaryKey(fNoOrganizationWorkshopDischarge)!=0)
            return true;
        else
            return false;
    }

    /**
     * 删除车间
     * @param workshopID
     * @return
     */
    public int deleteWorkShop(int workshopID,int factoryID) {
        if (fNoOrganizationWorkshopDischargeMapper.deleteByPrimaryKey(workshopID)!=0){
            //更新factory中的count数据
            Factory factory = factoryMapper.selectByPrimaryKey(factoryID);
            int noOraWsCount = factory.getNoOrgWorkCount()-1;
            factory.setNoOrgWorkCount(noOraWsCount);
            factoryMapper.updateByPrimaryKeySelective(factory);

            return 1;
        }
        else
            return 0;
    }
}
