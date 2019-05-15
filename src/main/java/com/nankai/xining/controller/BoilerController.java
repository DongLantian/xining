package com.nankai.xining.controller;

import com.nankai.xining.bean.BoilerTemp;
import com.nankai.xining.service.BoilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-15 15:58
 */

@Controller
@RequestMapping(value = "/boiler")
public class BoilerController {

    @Autowired
    BoilerService boilerService;

    @RequestMapping(value = "/getBoiler")
    @ResponseBody
    public BoilerTemp getBoiler(Integer boilerID){
        BoilerTemp resultBoiler = boilerService.selectBoilerById(boilerID);
        return resultBoiler;
    }

}
