package com.lcw.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/5/29
 */
@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
            1. 获取请求方式 ：GET
                * String getMethod()
            2. (*)获取虚拟目录:
                * String getContextPath()
            3. 获取Servlet路径: /requestDemo1
                * String getServletPath()
            4. 获取get方式请求参数：name=zhangsan
                * String getQueryString()
            5. (*)获取请求URI：/day14/demo1
                * String getRequestURI():		/day14/requestDemo1
                * StringBuffer getRequestURL()  :http://localhost/day14/requestDemo1
            6. 获取协议及版本：HTTP/1.1
                * String getProtocol()

            7. 获取客户机的IP地址：
                * String getRemoteAddr()

         */

        //1. 获取请求方式 ：GET

        String method = request.getMethod();
        System.out.println(method);//GET

        // 2.获取虚拟目录:

        String path = request.getContextPath();

        System.out.println(path);//        /day11

        //3 获取Servlet路径:

        String servletPath = request.getServletPath();

        System.out.println(servletPath);//    /requestDemo1

        //4 获取get方式请求参数

        String queryString = request.getQueryString();

        System.out.println(queryString); //    name=curry&age=12

        //5.获取请求URI

        String requestURI = request.getRequestURI();


        System.out.println(requestURI);//     /day11/requestDemo1

        //6.获取请求URL

        StringBuffer requestURL = request.getRequestURL();


        System.out.println(requestURL); //         http://localhost:8099/day11/requestDemo1

        //7 获取协议及版本

        String protocol = request.getProtocol();

        System.out.println(protocol);    //     HTTP/1.1


        //8.获取客户机的IP地址


        String remoteAddr = request.getRemoteAddr();

        System.out.println(remoteAddr);   //   0:0:0:0:0:0:0:1


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
