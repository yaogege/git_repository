<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
    String pathUri = request.getRequestURI();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">

<title>登录成功</title>
<!--

<link rel="stylesheet" type="text/css" href="styles.css">

-->
</head>
<body>
	登录成功
	<br>
	<br>
	<%= path%>
	<br>
	<%= pathUri%>
	<br>
	<%= basePath%>
	<br>
	<!-- 
	/Struts2 
   /Struts2/success.jsp 
   http://localhost:8080/Struts2/ 
	 -->
	
</body>
</html>