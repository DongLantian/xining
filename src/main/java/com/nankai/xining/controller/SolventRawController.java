package com.nankai.xining.controller;

import com.nankai.xining.bean.RongjiRaw;
import com.nankai.xining.service.SolventRawService;
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
 * @Date: 2019-06-06 17:50
 */

@Controller
@RequestMapping(value = "/solventraw")
public class SolventRawController {

    @Autowired
    SolventRawService solventRawService;



    @RequestMapping(value = "/getsolventRaw")
    @ResponseBody
    public RongjiRaw getsolventRaw(Integer solventrawID){
        return solventRawService.selectsolventRawByID(solventrawID);
    }


    @RequestMapping(value = "/updatesolventRaw")
    @ResponseBody
    public Map<String,Object> updatesolventRaw(@RequestBody RongjiRaw rongjiRaw, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (solventRawService.updatesolventRaw(rongjiRaw)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("solventraw",rongjiRaw);
        }else {
            result.put("isUpdate",false);
            result.put("solventraw",rongjiRaw);
        }
        return result;
    }


    @RequestMapping(value = "/addsolventRaw", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addsolventRaw(RongjiRaw rongjiRaw, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (solventRawService.addsolventRaw(rongjiRaw,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/delsolventRaw")
    @ResponseBody
    public Map<String,String> delsolventRaw(int solventrawID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = solventRawService.deletesolventRaw(solventrawID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
