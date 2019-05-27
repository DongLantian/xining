package com.nankai.xining.controller;

import com.nankai.xining.bean.DeviceRawTemp;
import com.nankai.xining.service.RawService;
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
 * @Date: 2019-05-27 11:00
 */

@Controller
@RequestMapping(value = "/raw")
public class RawController {

    @Autowired
    RawService rawService;


    @RequestMapping(value = "/getRaw")
    @ResponseBody
    public DeviceRawTemp getRaw(Integer rawID){
        return rawService.selectRawByID(rawID);
    }

    @RequestMapping(value = "/addRaw", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addKiln(DeviceRawTemp deviceRawTemp, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (rawService.addRaw(deviceRawTemp,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }




    @RequestMapping(value = "/updateRaw")
    @ResponseBody
    public Map<String,Object> updateRaw(@RequestBody DeviceRawTemp deviceRawTemp, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (rawService.updateRaw(deviceRawTemp)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("raw",deviceRawTemp);
        }else {
            result.put("isUpdate",false);
            result.put("raw",deviceRawTemp);
        }
        return result;
    }


    @RequestMapping(value = "/delRaw")
    @ResponseBody
    public Map<String,String> delRaw(int rawID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = rawService.deleteRaw(rawID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
