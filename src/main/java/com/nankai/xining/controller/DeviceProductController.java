package com.nankai.xining.controller;

import com.nankai.xining.bean.DeviceProduct;
import com.nankai.xining.service.DeviceProductService;
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
 * @Date: 2019-05-29 16:06
 */

@Controller
@RequestMapping(value = "/deviceProduct")
public class DeviceProductController {

    @Autowired
    DeviceProductService deviceProductService;





    @RequestMapping(value = "/getProduct")
    @ResponseBody
    public DeviceProduct getProduct(Integer productID){
        return deviceProductService.selectProductByID(productID);
    }



    @RequestMapping(value = "/addProduct", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Object> addProduct(DeviceProduct deviceProduct, HttpSession session){
        Map result = new HashMap();
        Integer factoryId= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (factoryId!=null){
            if (deviceProductService.addProduct(deviceProduct,factoryId)){
                result.put("isAdd",true);
            }else {
                result.put("isAdd",false);
            }
        }else {
            result.put("isAdd",false);
        }
        return result;
    }


    @RequestMapping(value = "/updateProduct")
    @ResponseBody
    public Map<String,Object> updateProduct(@RequestBody DeviceProduct deviceProduct, HttpSession session){
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        if (deviceProductService.updateProduct(deviceProduct)){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isUpdate",true);
            result.put("product",deviceProduct);
        }else {
            result.put("isUpdate",false);
            result.put("product",deviceProduct);
        }
        return result;
    }



    @RequestMapping(value = "/delProduct")
    @ResponseBody
    public Map<String,String> delProduct(int productID,HttpSession session) throws Exception{
        HashMap result = new HashMap();
        Integer factoryID= Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        int delFlag = deviceProductService.deleteProduct(productID,factoryID);
        if (delFlag==1){
            LastChangedTimeSet.setLastChangedTime(factoryID);
            result.put("isDel","success");
        }else {
            result.put("isDel","fail");
        }
        return result;
    }


}
