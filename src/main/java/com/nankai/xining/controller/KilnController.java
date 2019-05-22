package com.nankai.xining.controller;

import com.nankai.xining.bean.KilnTemp;
import com.nankai.xining.service.KilnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public KilnTemp getKiln(Integer kilnID){
        return kilnService.selectKilnByID(kilnID);
    }


}
