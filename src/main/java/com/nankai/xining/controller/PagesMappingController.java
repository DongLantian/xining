package com.nankai.xining.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nankai.xining.bean.*;
import com.nankai.xining.repository.FeiqiMapper;
import com.nankai.xining.service.*;
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

    @Autowired
    KilnService kilnService;

    @Autowired
    DeviceService deviceService;

    @Autowired
    DeviceRawService deviceRawService;

    @Autowired
    DeviceProductService deviceProductService;

    @Autowired
    SolventRawService solventRawService;

    @Autowired
    SolventProductService solventProductService;

    @Autowired
    WasteDeviceService wasteDeviceService;

    @Autowired
    RoadDustService roadDustService;

    @Autowired
    ConstructionDustService constructionDustService;

    @Autowired
    YardDustService yardDustService;

    @Autowired
    BareSoilDustService bareSoilDustService;

    @Autowired
    WorkShopService workShopService;


    @RequestMapping("/enterpriseInfo")
    public String enterpriseInfo(){
        return "user/enterpriseInfo";
    }

    @RequestMapping("/layuiTest")
    public String layuiTest(){
        return "/user/layuiTest";
    }

    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/auxiliarybaresoildust")
    public String auxiliarybaresoildust(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<FBareSoilDustSource> fBareSoilDustSourceList = bareSoilDustService.selectBareDustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(fBareSoilDustSourceList);
        model.addAttribute("baredustList",pageResult.getList());
        model.addAttribute("baredustCount",pageResult.getTotal());

        return "user/auxiliarybaresoildust";
    }

    @RequestMapping("/auxiliaryconstructiondust")
    public String auxiliaryconstructiondust(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<FConstructionDustSource> fConstructionDustSources = constructionDustService.selectConsDustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(fConstructionDustSources);
        model.addAttribute("consdustList",pageResult.getList());
        model.addAttribute("consdustCount",pageResult.getTotal());

        return "user/auxiliaryconstructiondust";
    }

    @RequestMapping("/auxiliaryroaddust")
    public String auxiliaryroaddust(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<FRoadDustSource> fRoadDustSourceList = roadDustService.selectRoadDustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(fRoadDustSourceList);
        model.addAttribute("roaddustList",pageResult.getList());
        model.addAttribute("roaddustCount",pageResult.getTotal());

        return "user/auxiliaryroaddust";
    }

    @RequestMapping("/auxiliaryWorkshop")
    public String auxiliaryWorkshop(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<FNoOrganizationWorkshopDischarge> fNoOrganizationWorkshopDischargeList = workShopService.selectWorkShopListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(fNoOrganizationWorkshopDischargeList);
        model.addAttribute("workshopList",pageResult.getList());
        model.addAttribute("workshopCount",pageResult.getTotal());

        return "user/auxiliaryWorkshop";
    }

    @RequestMapping("/auxiliaryyarddust")
    public String auxiliaryyarddust( HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<FYardDustSource> fYardDustSourceList = yardDustService.selectYardDustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(fYardDustSourceList);
        model.addAttribute("yarddustList",pageResult.getList());
        model.addAttribute("yarddustCount",pageResult.getTotal());

        return "user/auxiliaryyarddust";
    }

    @RequestMapping("/boilershell")
    public String boilershell(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<Boiler> boilerList = boilerService.selectBoilerListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(boilerList);
        model.addAttribute("boilerList",pageResult.getList());
        model.addAttribute("boilerCount",pageResult.getTotal());

        return "user/boilershell";
    }

    @RequestMapping("/device")
    public String device(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<Device> deviceList = deviceService.selectDeviceListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(deviceList);
        model.addAttribute("deviceList",pageResult.getList());
        model.addAttribute("deviceCount",pageResult.getTotal());

        return "user/device";
    }

    @RequestMapping("/exhaust")
    public String exhaust(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<Exhaust> exhaustList = exhaustService.selectExhaustListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(exhaustList);
        model.addAttribute("exhaustList",pageResult.getList());
        model.addAttribute("exhaustCount",pageResult.getTotal());
        return "user/exhaust";
    }

    @RequestMapping("/kilnshell")
    public String kilnshell(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<Kiln> kilnList = kilnService.selectKilnListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(kilnList);
        model.addAttribute("kilnList",pageResult.getList());
        model.addAttribute("kilnCount",pageResult.getTotal());

        return "user/kilnshell";
    }

    @RequestMapping("/product")
    public String product(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<DeviceProduct> deviceProductList = deviceProductService.selectProductListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(deviceProductList);
        model.addAttribute("productList",pageResult.getList());
        model.addAttribute("productCount",pageResult.getTotal());

        return "user/product";
    }

    @RequestMapping("/raw")
    public String raw(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<DeviceRaw> deviceRawList = deviceRawService.selectRawListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(deviceRawList);
        model.addAttribute("rawList",pageResult.getList());
        model.addAttribute("rawCount",pageResult.getTotal());

        return "user/raw";
    }

    @RequestMapping("/solventproduct")
    public String solventproduct(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<RongjiProduct> rongjiProductList = solventProductService.selectRawListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(rongjiProductList);
        model.addAttribute("solventproductList",pageResult.getList());
        model.addAttribute("solventproductCount",pageResult.getTotal());

        return "user/solventproduct";
    }

    @RequestMapping("/solventraw")
    public String solventraw(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<RongjiRaw> solventRawList = solventRawService.selectRawListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(solventRawList);
        model.addAttribute("solventrawList",pageResult.getList());
        model.addAttribute("solventrawCount",pageResult.getTotal());

        return "user/solventraw";
    }

    @RequestMapping("/wastedevice")
    public String wastedevice(HttpSession session, Model model,@RequestParam(value="page", required=false, defaultValue="1") int page){
        int factoryId = Integer.parseInt(session.getAttribute("clientfactoryid").toString());
        //获取第1页，3条内容，默认查询数据库中记录的总数count
        PageHelper.startPage(page, PAGE_SIZE);
        List<Feiqi> feiqiList = wasteDeviceService.selectDeviceListByFactoryId(factoryId);
        //用PageInfo对结果进行包装
        PageInfo pageResult = new PageInfo(feiqiList);
        model.addAttribute("wastedeviceList",pageResult.getList());
        model.addAttribute("wastedeviceCount",pageResult.getTotal());

        return "user/wastedevice";
    }


}
