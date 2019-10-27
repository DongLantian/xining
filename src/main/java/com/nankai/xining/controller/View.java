package com.nankai.xining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-14 21:10
 */
@Controller
public class View {
    @RequestMapping("/")
    public String view(){
        return "user/enterpriseInfo";
    }
}
