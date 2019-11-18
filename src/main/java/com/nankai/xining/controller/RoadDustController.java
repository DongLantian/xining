package com.nankai.xining.controller;

import com.nankai.xining.bean.FRoadDustSource;
import com.nankai.xining.service.RoadDustService;
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
 * @Date: 2019-06-08 16:49
 */

@Controller
@RequestMapping(value = "/roadDust")
public class RoadDustController {

    @Autowired
    RoadDustService roadDustService;




    @RequestMapping(value = "/getRoadDust")
    @ResponseBody
    public FRoadDustSource getRoadDust(Integer roadDustID){
        return roadDustService.selectRoadDustByID(roadDustID);
    }


    @RequestMapping(value = "/addRoadDust", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addRoadDust(FRoadDustSource fRoadDustSource, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (roadDustService.addRoadDust(fRoadDustSource,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }



    @RequestMapping(value = "/updateRoadDust")
    @ResponseBody
    public Map<String,Object> updateRoadDust(@RequestBody FRoadDustSource fRoadDustSource, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (roadDustService.updateRoadDust(fRoadDustSource)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("roaddust",fRoadDustSource);
        }else {
            result.put("isUpdate",false);
            result.put("roaddust",fRoadDustSource);
        }
        return result;
    }


    @RequestMapping(value = "/delRoadDust")
    @ResponseBody
    public Map<String,String> delRoadDust(int roadDustID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = roadDustService.deleteRoadDust(roadDustID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }



}
