package com.nankai.xining.controller;

import com.nankai.xining.bean.BoilerTemp;
import com.nankai.xining.bean.ExhaustTemp;
import com.nankai.xining.service.BoilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public BoilerTemp getBoiler(Integer boilerID){
        BoilerTemp resultBoiler = boilerService.selectBoilerById(boilerID);
        return resultBoiler;
    }

    @RequestMapping(value = "/addBoiler", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addBoiler(BoilerTemp boilerTemp, HttpSession session){
        Map result = new HashMap();
        Integer m_factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (m_factoryId!=null){
            if (boilerService.addBoiler(boilerTemp,m_factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }

}
