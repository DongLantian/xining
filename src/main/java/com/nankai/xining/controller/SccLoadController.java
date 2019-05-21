package com.nankai.xining.controller;

import com.nankai.xining.bean.Scc2;
import com.nankai.xining.bean.Scc3;
import com.nankai.xining.bean.Scc4;
import com.nankai.xining.service.SccLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: Scc三级下拉列表工具，用于加载scc2、scc3、scc4表中的数据
 * @Author: 董兰天
 * @Date: 2019-05-15 18:53
 */

@Controller
@RequestMapping(value = "/scc")
public class SccLoadController {

    @Autowired
    SccLoadService sccLoadService;

    @RequestMapping(value = "/loadSelectA")
    @ResponseBody
    public List<Scc2> loadSelectA(String scc1ID){
        return sccLoadService.loadSelectAonScc2ByScc1(scc1ID);
    }

    @RequestMapping(value = "/loadSelectB")
    @ResponseBody
    public List<Scc3> loadSelectB(String scc1ID,String scc2ID){
        return sccLoadService.loadSelectBonScc3ByScc1andScc2(scc1ID,scc2ID);
    }

    @RequestMapping(value = "/loadSelectC")
    @ResponseBody
    public List<Scc4> loadSelectC(String scc1ID,String scc2ID,String scc3ID){
        return sccLoadService.loadSelectConScc4ByScc1andScc2andScc3(scc1ID,scc2ID,scc3ID);
    }


}
