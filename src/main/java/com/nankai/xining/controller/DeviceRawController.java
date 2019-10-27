package com.nankai.xining.controller;

import com.nankai.xining.bean.DeviceRaw;
import com.nankai.xining.service.DeviceRawService;
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
public class DeviceRawController {

    @Autowired
    DeviceRawService deviceRawService;


    @RequestMapping(value = "/getRaw")
    @ResponseBody
    public DeviceRaw getRaw(Integer rawID){
        return deviceRawService.selectRawByID(rawID);
    }

    @RequestMapping(value = "/addRaw", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addRaw(DeviceRaw deviceRaw, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (deviceRawService.addRaw(deviceRaw,factoryId)){
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
    public Map<String,Object> updateRaw(@RequestBody DeviceRaw deviceRaw, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (deviceRawService.updateRaw(deviceRaw)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("raw",deviceRaw);
        }else {
            result.put("isUpdate",false);
            result.put("raw",deviceRaw);
        }
        return result;
    }


    @RequestMapping(value = "/delRaw")
    @ResponseBody
    public Map<String,String> delRaw(int rawID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = deviceRawService.deleteRaw(rawID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
