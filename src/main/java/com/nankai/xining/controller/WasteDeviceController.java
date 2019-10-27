package com.nankai.xining.controller;

import com.nankai.xining.bean.Feiqi;
import com.nankai.xining.service.WasteDeviceService;
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
 * @Date: 2019-06-07 14:21
 */

@Controller
@RequestMapping(value = "/wasteDevice")
public class WasteDeviceController {

    @Autowired
    WasteDeviceService wasteDeviceService;




    @RequestMapping(value = "/getDevice")
    @ResponseBody
    public Feiqi getDevice(Integer deviceID){
        return wasteDeviceService.selectDeviceByID(deviceID);
    }


    @RequestMapping(value = "/addDevice", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addDevice(Feiqi feiqi, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (wasteDeviceService.addDevice(feiqi,factoryId)){
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
    public Map<String,Object> updateDevice(@RequestBody Feiqi feiqi, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (wasteDeviceService.updateDevice(feiqi)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("wastedevice",feiqi);
        }else {
            result.put("isUpdate",false);
            result.put("wastedevice",feiqi);
        }
        return result;
    }


    @RequestMapping(value = "/delDevice")
    @ResponseBody
    public Map<String,String> delDevice(int deviceID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = wasteDeviceService.deleteDevice(deviceID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }


}
