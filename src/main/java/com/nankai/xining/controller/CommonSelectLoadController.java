package com.nankai.xining.controller;

import com.nankai.xining.bean.*;
import com.nankai.xining.service.CommonSelectLoadService;
import com.nankai.xining.service.DeviceService;
import com.nankai.xining.service.ExhaustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description: 通用下拉列表加载工具，用于加载烟囱、除尘方式、脱硫方式、脱硝方式下拉列表
 * @Author: 董兰天
 * @Date: 2019-05-17 16:55
 */

@Controller
@RequestMapping(value = "/common")
public class CommonSelectLoadController {

    @Autowired
    CommonSelectLoadService commonSelectLoadService;

    @Autowired
    ExhaustService exhaustService;

    @Autowired
    DeviceService deviceService;



    @RequestMapping(value = "/getExhaustList")
    @ResponseBody
    public List<ExhaustTemp> getExhaustList(HttpSession session){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        List<ExhaustTemp> exhaustList = exhaustService.selectExhaustListByFactoryId(factoryId);
        return exhaustList;
    }

    @RequestMapping(value = "/getDeviceList")
    @ResponseBody
    public List<DeviceTemp> getDeviceList(HttpSession session){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        List<DeviceTemp> deviceList = deviceService.selectDeviceListByFactoryId(factoryId);
        return deviceList;
    }

    @RequestMapping(value = "/getDustremoveList")
    @ResponseBody
    public List<Dustremove> getDustremoveList(){
        return commonSelectLoadService.selectDustremoveList();
    }

    @RequestMapping(value = "/getSulphurremoveList")
    @ResponseBody
    public List<Sulphurremove> getSulphurremoveList(){
        return commonSelectLoadService.selectSulphurremoveList();
    }

    @RequestMapping(value = "/getNitreremoveList")
    @ResponseBody
    public List<Nitreremove> getNitreremoveList(){
        return commonSelectLoadService.selectNitreremoveList();
    }

}
