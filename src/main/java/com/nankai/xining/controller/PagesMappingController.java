package com.nankai.xining.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nankai.xining.bean.BoilerTemp;
import com.nankai.xining.bean.ExhaustTemp;
import com.nankai.xining.bean.Factory;
import com.nankai.xining.service.BoilerService;
import com.nankai.xining.service.ExhaustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-12 14:33
 */
@Controller
@RequestMapping(value = "/Client")
public class PagesMappingController {
    //每页条目数量
    private static final int PAGE_SIZE = 3;

    @Autowired
    ExhaustService exhaustService;

    @Autowired
    BoilerService boilerService;

    @RequestMapping("/enterpriseInfo")
    public String enterpriseInfo(){
        return "/user/enterpriseInfo";
    }

    @RequestMapping("/auxiliarybaresoildust")
    public String auxiliarybaresoildust(){
        return "/user/auxiliarybaresoildust";
    }

    @RequestMapping("/auxiliaryconstructiondust")
    public String auxiliaryconstructiondust(){
        return "/user/auxiliaryconstructiondust";
    }

    @RequestMapping("/auxiliaryroaddust")
    public String auxiliaryroaddust(){
        return "/user/auxiliaryroaddust";
    }

    @RequestMapping("/auxiliaryWorkshop")
    public String auxiliaryWorkshop(){
        return "/user/auxiliaryWorkshop";
    }

    @RequestMapping("/auxiliaryyarddust")
    public String auxiliaryyarddust(){
        return "/user/auxiliaryyarddust";
    }

    @RequestMapping("/boilershell")
    public String boilershell(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<BoilerTemp> boilerList = boilerService.selectBoilerListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(boilerList);
        model.addAttribute("boilerList",pageResult.getList());
        model.addAttribute("boilerCount",pageResult.getTotal());

        return "/user/boilershell";
    }

    @RequestMapping("/device")
    public String device(){
        return "/user/device";
    }

    @RequestMapping("/exhaust")
    public String exhaust(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<ExhaustTemp> exhaustList = exhaustService.selectExhaustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(exhaustList);
        model.addAttribute("exhaustList",pageResult.getList());
        model.addAttribute("exhaustCount",pageResult.getTotal());
        return "/user/exhaust";
    }

    @RequestMapping("/kilnshell")
    public String kilnshell(){
        return "/user/kilnshell";
    }

    @RequestMapping("/product")
    public String product(){
        return "/user/product";
    }

    @RequestMapping("/raw")
    public String raw(){
        return "/user/raw";
    }

    @RequestMapping("/solventproduct")
    public String solventproduct(){
        return "/user/solventproduct";
    }

    @RequestMapping("/solventraw")
    public String solventraw(){
        return "/user/solventraw";
    }

    @RequestMapping("/wastedevice")
    public String wastedevice(){
        return "/user/wastedevice";
    }


}