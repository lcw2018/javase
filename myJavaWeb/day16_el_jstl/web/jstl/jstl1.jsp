<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lcw2017
  Date: 2019/6/3
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--

 c:if标签
     1. 属性：
         * test 必须属性，接受boolean表达式
             * 如果表达式为true，则显示if标签体内容，如果为false，则不显示标签体内容
             * 一般情况下，test属性值会结合el表达式一起使用

     2. 注意：c:if标签没有else情况，想要else情况，则可以在定义一个c:if标签


 --%>


<c:if test="true">

    <h3>我是真</h3>

</c:if>
<br>


<%
    //判断request域中的一个list集合是否为空，如果不为null则显示遍历集合
    List list = new ArrayList();

    list.add("aaaa");

    request.setAttribute("list", list);


    request.setAttribute("number", 4);


%>


<c:if test="${not empty list}">

    <h3>遍历集合</h3>


</c:if>

<c:if test="${number % 2==0}">

    <h3> ${number}为偶数</h3>

</c:if>

<c:if test="${number % 2!=0}">
    <h3>${number}为奇数</h3>

</c:if>


</body>
</html>
