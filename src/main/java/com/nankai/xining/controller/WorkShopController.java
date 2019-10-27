package com.nankai.xining.controller;

import com.nankai.xining.bean.FNoOrganizationWorkshopDischarge;
import com.nankai.xining.service.WorkShopService;
import com.nankai.xining.utils.LastChangedTimeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-12 13:48
 */

@Controller
@RequestMapping(value = "/workshop")
public class WorkShopController {

    @Autowired
    WorkShopService workShopService;




    @RequestMapping(value = "/addworkshop", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addworkshop(FNoOrganizationWorkshopDischarge fNoOrganizationWorkshopDischarge, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (workShopService.addWorkShop(fNoOrganizationWorkshopDischarge,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/getworkshop")
    @ResponseBody
    public FNoOrganizationWorkshopDischarge getworkshop(Integer workshopID){
        return workShopService.selectworkShopByID(workshopID);
    }



    @RequestMapping(value = "/updateWorkShop")
    @ResponseBody
    public Map<String,Object> updateWorkShop(@RequestBody FNoOrganizationWorkshopDischarge fNoOrganizationWorkshopDischarge, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (workShopService.updateWorkShop(fNoOrganizationWorkshopDischarge)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("workshop",fNoOrganizationWorkshopDischarge);
        }else {
            result.put("isUpdate",false);
            result.put("workshop",fNoOrganizationWorkshopDischarge);
        }
        return result;
    }



    @RequestMapping(value = "/delworkshop")
    @ResponseBody
    public Map<String,String> delworkshop(int workshopID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = workShopService.deleteWorkShop(workshopID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }


}
