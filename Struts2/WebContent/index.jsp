<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
	<!-- action为login,提交时会根据路径在struts.xml找到与其匹配的action类 -->
	<form action="login" method="post">
		登录名：<input type="text" name="userinfo.username" /><br /> 密 码:<input
			type="password" name="userinfo.password" /> <input type="submit"
			value="登录" />
	</form>
</body>
</html>