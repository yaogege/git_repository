<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
<title>admin</title>
</head>

<!-- 
rows="60,*"是把页面分为上下两个部分，rows="*,*,*"是把页面分成上中下3个部分 
cols="60,*"是把页面分为左右两个部分，以此类推....省略其中方法和属性描述 
 -->
<frameset rows="60,*,30" frameborder="1" border="0"
	bordercolor="#000FFF" framespacing="1">
	<frame src="<%=basePath%>admin/head.jsp" name="head" scrolling="No"
		noresize="noresize" id="head" title="head" />
	<frameset cols="170,*" frameborder="1" border="0" framespacing="1">
		<frame src="<%=basePath%>admin/menu.jsp" name="menu" scrolling="No"
			noresize="noresize" id="menu" title="menu" />
		<frame src="<%=basePath%>admin/content.jsp" name="content"
			scrolling="Yes" noresize="noresize" id="content" title="content" />
	</frameset>
	<frame src="<%=basePath%>admin/foot.jsp" name="foot" scrolling="No"
		noresize="noresize" id="foot" title="foot" />
</frameset>


</html>