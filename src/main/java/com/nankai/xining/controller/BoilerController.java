package com.nankai.xining.controller;

import com.nankai.xining.bean.Boiler;
import com.nankai.xining.service.BoilerService;
import com.nankai.xining.utils.LastChangedTimeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-15 15:58
 */

@Controller
@RequestMapping(value = "/boiler")
public class BoilerController {

    @Autowired
    BoilerService boilerService;


    @RequestMapping(value = "/getBoiler")
    @ResponseBody
    public Boiler getBoiler(Integer boilerID){
        Boiler resultBoiler = boilerService.selectBoilerById(boilerID);
        return resultBoiler;
    }

    @RequestMapping(value = "/addBoiler", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addBoiler(Boiler boiler, HttpSession session){
        Map result = new HashMap();
        Integer m_factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (m_factoryId!=null){
            if (boilerService.addBoiler(boiler,m_factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }

    @RequestMapping(value = "/updateBoiler")
    @ResponseBody
    public Map<String,Object> updateBoiler(@RequestBody Boiler boiler,HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (boilerService.updateBoiler(boiler)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("boiler",boiler);
        }else {
            result.put("isUpdate",false);
            result.put("boiler",boiler);
        }
        return result;
    }


    @RequestMapping(value = "/delBoiler")
    @ResponseBody
    public Map<String,String> delBoiler(int boilerID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = boilerService.deleteBoiler(boilerID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
