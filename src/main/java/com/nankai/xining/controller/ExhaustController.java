package com.nankai.xining.controller;

import com.nankai.xining.bean.Exhaust;
import com.nankai.xining.bean.ExhaustTemp;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.service.EnterpriseService;
import com.nankai.xining.service.ExhaustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-12 20:25
 */

@Controller
@RequestMapping(value = "/exhaust")
public class ExhaustController {

    @Autowired
    ExhaustService exhaustService;

    @RequestMapping(value = "/getExhaust",method = {RequestMethod.GET})
    @ResponseBody
    public ExhaustTemp getExhaust(int exhaustID){
        ExhaustTemp resultExhaust = exhaustService.selectExhaust(exhaustID);
        return resultExhaust;
    }


    @RequestMapping(value = "/updateExhaust")
    @ResponseBody
    public Map<String,Object> updateExhaust(@RequestBody ExhaustTemp exhaustTemp){
        HashMap result = new HashMap();
        if (exhaustService.updateExhaust(exhaustTemp)){
            result.put("isUpdate",true);
            result.put("exhaust",exhaustTemp);
        }else {
            result.put("isUpdate",false);
            result.put("exhaust",exhaustTemp);
        }
        return result;
    }


    @RequestMapping(value = "/addExhaust", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addExhaust(ExhaustTemp exhaustTemp,HttpSession session){
        Map result = new HashMap();
        Integer m_factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (m_factoryId!=null){
            if (exhaustService.addExhaust(exhaustTemp,m_factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/delExhaust")
    @ResponseBody
    public Map<String,String> delExhaust(int exhaustID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer m_factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = exhaustService.deleteExhaust(exhaustID,m_factoryId);
        if (delFlag==1){
            result.put("isDel","success");
        }else if (delFlag==0){
            result.put("isDel","constraint");
        }else if (delFlag==-1){
            result.put("isDel","fail");
        }
        return result;
    }


}
