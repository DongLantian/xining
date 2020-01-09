package com.nankai.xining.controller;

import com.nankai.xining.utils.DeviceProductDataImport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * @Description: **
 * @Author: 董兰天
 * @Date: 2019-12-09 18:55
 */
@Controller
@RequestMapping(value = "/productDataImport")
public class ProductDataImport {

    @Autowired
    DeviceProductDataImport deviceProductDataImport;

    @RequestMapping(value = "/productDataImport")
    public void impotr(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        try {
            //获取上传的文件
            MultipartHttpServletRequest multipart = (MultipartHttpServletRequest) request;
            MultipartFile file = multipart.getFile("upfile");
            InputStream in = file.getInputStream();
            deviceProductDataImport.importExcelInfo(in, file);
            in.close();
            out.print("<script language='JavaScript'>alert('文件上传成功！');window.location.href='"+request.getContextPath()+"/fileupload/enterinput';</script>");
        } catch (Exception e) {
            e.printStackTrace();
            out.print("<script language='JavaScript'>alert('文件上传失败！请检查Excel表是否符合规范！');window.location.href='"+request.getContextPath()+"/fileupload/enterinput';</script>");
        }
    }

}
