package com.nankai.xining.controller;

import com.nankai.xining.bean.DeviceTemp;
import com.nankai.xining.service.DeviceService;
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
 * @Date: 2019-05-26 14:31
 */

@Controller
@RequestMapping(value = "/device")
public class DeviceController {

    @Autowired
    DeviceService deviceService;


    @RequestMapping(value = "/getDevice")
    @ResponseBody
    public DeviceTemp getDevice(Integer deviceID){
        return deviceService.selectDeviceByID(deviceID);
    }


    @RequestMapping(value = "/addDevice", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addDevice(DeviceTemp deviceTemp, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (deviceService.addDevice(deviceTemp,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }



    @RequestMapping(value = "/updateDevice")
    @ResponseBody
    public Map<String,Object> updateDevice(@RequestBody DeviceTemp deviceTemp, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (deviceService.updateDevice(deviceTemp)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("device",deviceTemp);
        }else {
            result.put("isUpdate",false);
            result.put("device",deviceTemp);
        }
        return result;
    }


    @RequestMapping(value = "/delDevice")
    @ResponseBody
    public Map<String,String> delDevice(int deviceID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = deviceService.deleteDevice(deviceID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }



}
