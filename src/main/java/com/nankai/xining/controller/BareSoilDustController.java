package com.nankai.xining.controller;

import com.nankai.xining.bean.FBareSoilDustSourceTemp;
import com.nankai.xining.service.BareSoilDustService;
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
 * @Date: 2019-06-11 21:46
 */

@Controller
@RequestMapping(value = "/baresoil")
public class BareSoilDustController {

    @Autowired
    BareSoilDustService bareSoilDustService;




    @RequestMapping(value = "/addbaresoil", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addbaresoil(FBareSoilDustSourceTemp fBareSoilDustSourceTemp, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (bareSoilDustService.addBareSoilDust(fBareSoilDustSourceTemp,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/getbaresoil")
    @ResponseBody
    public FBareSoilDustSourceTemp getbaresoil(Integer baresoilID){
        return bareSoilDustService.selectBareDustByID(baresoilID);
    }



    @RequestMapping(value = "/updateBareDust")
    @ResponseBody
    public Map<String,Object> updateBareDust(@RequestBody FBareSoilDustSourceTemp fBareSoilDustSourceTemp, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (bareSoilDustService.updateBareDust(fBareSoilDustSourceTemp)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("baredust",fBareSoilDustSourceTemp);
        }else {
            result.put("isUpdate",false);
            result.put("baredust",fBareSoilDustSourceTemp);
        }
        return result;
    }


    @RequestMapping(value = "/delbaresoil")
    @ResponseBody
    public Map<String,String> delbaresoil(int baresoilID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = bareSoilDustService.deleteBareDust(baresoilID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
