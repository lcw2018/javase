package com.lcw.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo5")
public class RequestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求消息体--请求参数


        //获取字符输入流
        BufferedReader reader = request.getReader();

        //读取数据
        String len = null;
        while ((len = reader.readLine()) != null) {
            System.out.println(len);

        }
        //username=curry&password=12345

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
