package com.nankai.xining.controller;

import com.nankai.xining.bean.RongjiProduct;
import com.nankai.xining.service.SolventProductService;
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
 * @Date: 2019-06-07 10:38
 */

@Controller
@RequestMapping(value = "/solventProduct")
public class SolventProductController {

    @Autowired
    SolventProductService solventProductService;




    @RequestMapping(value = "/getsolventProduct")
    @ResponseBody
    public RongjiProduct getsolventProduct(Integer solventproductID){
        return solventProductService.selectsolventProductByID(solventproductID);
    }



    @RequestMapping(value = "/addsolventProduct", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addsolventProduct(RongjiProduct rongjiProduct, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (solventProductService.addsolventProduct(rongjiProduct,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }



    @RequestMapping(value = "/updatesolventProduct")
    @ResponseBody
    public Map<String,Object> updatesolventProduct(@RequestBody RongjiProduct rongjiProduct, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (solventProductService.updatesolventProduct(rongjiProduct)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("solventproduct",rongjiProduct);
        }else {
            result.put("isUpdate",false);
            result.put("solventproduct",rongjiProduct);
        }
        return result;
    }



    @RequestMapping(value = "/delsolventProduct")
    @ResponseBody
    public Map<String,String> delsolventProduct(int solventproductID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = solventProductService.deletesolventProduct(solventproductID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }


}
