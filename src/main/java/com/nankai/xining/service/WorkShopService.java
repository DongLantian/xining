package com.nankai.xining.service;

import com.nankai.xining.bean.FNoOrganizationWorkshopDischargeTemp;
import com.nankai.xining.bean.FNoOrganizationWorkshopDischargeTempExample;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.repository.FNoOrganizationWorkshopDischargeTempMapper;
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
    FNoOrganizationWorkshopDischargeTempMapper fNoOrganizationWorkshopDischargeTempMapper;

    @Autowired
    FactoryMapper factoryMapper;


    /**
     * 根据企业ID查询车间
     * @param factoryId
     * @return
     */
    public List<FNoOrganizationWorkshopDischargeTemp> selectWorkShopListByFactoryId(int factoryId) {
        FNoOrganizationWorkshopDischargeTempExample fNoOrganizationWorkshopDischargeTempExample = new FNoOrganizationWorkshopDischargeTempExample();
        FNoOrganizationWorkshopDischargeTempExample.Criteria criteria = fNoOrganizationWorkshopDischargeTempExample.createCriteria();
        criteria.andFactoryidEqualTo(factoryId);
        return fNoOrganizationWorkshopDischargeTempMapper.selectByExample(fNoOrganizationWorkshopDischargeTempExample);
    }

    /**
     * 根据ID查询车间
     * @param workshopID
     * @return
     */
    public FNoOrganizationWorkshopDischargeTemp selectworkShopByID(Integer workshopID) {
        return fNoOrganizationWorkshopDischargeTempMapper.selectByPrimaryKey(workshopID);
    }

    /**
     * 新增车间
     * @param fNoOrganizationWorkshopDischargeTemp
     * @param factoryId
     * @return
     */
    public boolean addWorkShop(FNoOrganizationWorkshopDischargeTemp fNoOrganizationWorkshopDischargeTemp, Integer factoryId) {
        //设置企业ID
        fNoOrganizationWorkshopDischargeTemp.setFactoryid(factoryId);
        fNoOrganizationWorkshopDischargeTemp.setScccode("1001110100");

        if (fNoOrganizationWorkshopDischargeTempMapper.insertSelective(fNoOrganizationWorkshopDischargeTemp)!=0) {
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
     * 更新车间
     * @param fNoOrganizationWorkshopDischargeTemp
     * @return
     */
    public boolean updateWorkShop(FNoOrganizationWorkshopDischargeTemp fNoOrganizationWorkshopDischargeTemp) {
        if(fNoOrganizationWorkshopDischargeTempMapper.updateByPrimaryKey(fNoOrganizationWorkshopDischargeTemp)!=0)
            return true;
        else
            return false;
    }

    /**
     * 删除车间
     * @param workshopID
     * @return
     */
    public int deleteWorkShop(int workshopID) {
        if (fNoOrganizationWorkshopDischargeTempMapper.deleteByPrimaryKey(workshopID)!=0)
            return 1;
        else
            return 0;
    }
}
