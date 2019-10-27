package com.nankai.xining.controller;

import com.nankai.xining.bean.Kiln;
import com.nankai.xining.bean.KilnTemp;
import com.nankai.xining.service.KilnService;
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
 * @Date: 2019-05-21 20:55
 */

@Controller
@RequestMapping(value = "/kiln")
public class KilnController {

    @Autowired
    KilnService kilnService;


    @RequestMapping(value = "/getKiln")
    @ResponseBody
    public Kiln getKiln(Integer kilnID){
        return kilnService.selectKilnByID(kilnID);
    }


    @RequestMapping(value = "/addKiln", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addKiln(Kiln kiln, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (kilnService.addKiln(kiln,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/updateKiln")
    @ResponseBody
    public Map<String,Object> updateBoiler(@RequestBody Kiln kiln, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (kilnService.updateKiln(kiln)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("kiln",kiln);
        }else {
            result.put("isUpdate",false);
            result.put("kiln",kiln);
        }
        return result;
    }



    @RequestMapping(value = "/delKiln")
    @ResponseBody
    public Map<String,String> delKiln(int kilnID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = kilnService.deleteKiln(kilnID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
