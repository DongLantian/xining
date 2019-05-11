package com.nankai.xining.controller;

import com.nankai.xining.bean.*;
import com.nankai.xining.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-05-11 12:21
 */

@Controller
@RequestMapping(value = "/enterprise")
public class EnterpriseController {

    @Autowired
    EnterpriseService enterpriseService;

    /**
     * 企业信息页面
     * @param session
     * @return
     */
    @RequestMapping("/enterpriseInfo")
    public String enterpriseInfo(HttpSession session){
        //工厂ID。暂未实现登录，做测试用
        session.setAttribute("clientfactoryid","17200");

        Factory factoryInfo = enterpriseService.gerFactoryInfo(17200);
        session.setAttribute("factoryInfo",factoryInfo);

        return "/user/enterpriseInfo";
    }

    /**
     * 得到全部行业大类
     * @return
     */
    @RequestMapping(value = "/getIndustryBigAll")
    @ResponseBody
    public List<IndustryBig> getIndustryBigAll(){
        List<IndustryBig> resultIndustryBigs = enterpriseService.getindustryBigAll();
        return resultIndustryBigs;
    }

    /**
     * 根据行业大类ID得到行业小类
     * @param industrybigid
     * @return
     */
    @RequestMapping(value = "/getIndustrySmallByBigID")
    @ResponseBody
    public List<IndustrySmall> getIndustrySmallByBigID(String industrybigid){
        List<IndustrySmall> resultIndustrySmall = enterpriseService.getindustrySmallPart(industrybigid);
        return  resultIndustrySmall;

    }

    /**
     * 查询所有城市信息
     * @return
     */
    @RequestMapping(value = "/getCityAll")
    @ResponseBody
    public List<City> getCityAll(){
        List<City> resultCityAll = enterpriseService.getcityALl();
        return resultCityAll;
    }

    /**
     * 根据城市ID查询所有区县信息
     * @param cityCode
     * @return
     */
    @RequestMapping(value = "/getCountryByCityCode")
    @ResponseBody
    public List<County> getCountryByCityCode(String cityCode){
        List<County> resultCountry = enterpriseService.getcountryPartByCitycode(cityCode);
        return resultCountry;
    }
}
