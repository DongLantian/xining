package com.nankai.xining.controller;


import com.nankai.xining.bean.FConstructionDustSourceTemp;
import com.nankai.xining.service.ConstructionDustService;
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
 * @Date: 2019-06-11 10:47
 */

@Controller
@RequestMapping(value = "/constructionDust")
public class ConstructionDustController {

    @Autowired
    ConstructionDustService constructionDustService;



    @RequestMapping(value = "/addconDust", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addconDust(FConstructionDustSourceTemp fConstructionDustSourceTemp, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (constructionDustService.addConsDust(fConstructionDustSourceTemp,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/getConDust")
    @ResponseBody
    public FConstructionDustSourceTemp getConDust(Integer conDustID){
        return constructionDustService.selectConDustByID(conDustID);
    }



    @RequestMapping(value = "/updateConDust")
    @ResponseBody
    public Map<String,Object> updateConDust(@RequestBody FConstructionDustSourceTemp fConstructionDustSourceTemp, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (constructionDustService.updateConDust(fConstructionDustSourceTemp)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("consdust",fConstructionDustSourceTemp);
        }else {
            result.put("isUpdate",false);
            result.put("consdust",fConstructionDustSourceTemp);
        }
        return result;
    }



    @RequestMapping(value = "/delConDust")
    @ResponseBody
    public Map<String,String> delConDust(int conDustID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = constructionDustService.deleteConDust(conDustID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }


}
