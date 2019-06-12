package com.nankai.xining.interceptor;

import com.nankai.xining.bean.Factory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-06-12 18:40
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        Factory factory = (Factory) request.getSession().getAttribute("factoryInfo");
        if (factory==null){
            response.sendRedirect(request.getContextPath()+"/Client/login");
            return false;
        }else {
            return true;
        }
    }
}
