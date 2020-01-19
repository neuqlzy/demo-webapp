<%--
  Created by IntelliJ IDEA.
  User: 李泽阳
  Date: 2020/1/19
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ page import="com.adtec.lizy.demo.page.IndexPage" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h2>Hello world.测试</h2>
    <%= IndexPage.getContent() %><br/>
    <c:forEach var="i" begin="1" end="5">
        Item ${i}<br/>
    </c:forEach>
    <c:forTokens items="google,runoob,taobao" delims="," var="name">
        <a href="https://www.${name}.com" target="_blank">
            ${name}
        </a><br/>
    </c:forTokens>
</body>
</html>
