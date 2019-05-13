package com.nankai.xining.controller;

import com.nankai.xining.bean.*;
import com.nankai.xining.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        session.setAttribute("clientfactoryid","17203");

        Factory factoryInfo = enterpriseService.getFactoryInfo(17203);
        session.setAttribute("factoryInfo",factoryInfo);

        return "/user/enterpriseInfo";
    }

    /**
     * 保存更新企业信息
     * @param factory
     * @param session
     * @return
     */
    @RequestMapping(value = "enterpriseUpdate")
    @ResponseBody
    public Map<String,Integer> updateEnterpriseInfo(Factory factory,HttpSession session){
        Map resultStatus = new HashMap();
        Integer m_factoryInteger= Integer.parseInt(session.getAttribute("clientfactoryid").toString());

        if(m_factoryInteger!=null){
            Factory resultFactory=enterpriseService.updateFactory(factory,m_factoryInteger);
            if (resultFactory!=null){
                session.setAttribute("factoryInfo",resultFactory);
                resultStatus.put("status",1);//成功
            }else {
                resultStatus.put("status",2);//更新失败
            }
        }else{
            resultStatus.put("status",0);//factoryID不存在
        }
        return resultStatus;
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
