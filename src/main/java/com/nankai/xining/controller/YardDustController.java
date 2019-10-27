package com.nankai.xining.controller;

import com.nankai.xining.bean.FYardDustSource;
import com.nankai.xining.service.YardDustService;
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
 * @Date: 2019-06-11 19:49
 */

@Controller
@RequestMapping(value = "/yardDust")
public class YardDustController {

    @Autowired
    YardDustService yardDustService;




    @RequestMapping(value = "/addyardDust", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addyardDust(FYardDustSource fYardDustSource, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (yardDustService.addYardDust(fYardDustSource,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }



    @RequestMapping(value = "/getYardDust")
    @ResponseBody
    public FYardDustSource getYardDust(Integer yardID){
        return yardDustService.selectYardDustByID(yardID);
    }



    @RequestMapping(value = "/updateYardDust")
    @ResponseBody
    public Map<String,Object> updateYardDust(@RequestBody FYardDustSource fYardDustSource, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (yardDustService.updateYardDust(fYardDustSource)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("yarddust",fYardDustSource);
        }else {
            result.put("isUpdate",false);
            result.put("yarddust",fYardDustSource);
        }
        return result;
    }


    @RequestMapping(value = "/delyardDust")
    @ResponseBody
    public Map<String,String> delyardDust(int yardDustID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = yardDustService.deleteYardDust(yardDustID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }

}
