<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=basePath%>css/style.css" type="text/css" />
</head>
<!-- 
班级名称
班级人数
所属院系
所属专业
所属辅导员 Counsellor
 -->
<body>
	<div id="Container">
		<div id="Header">我是顶部</div>

		<div id="Content">
			<h1>添加班级信息:</h1>
			<br>
			<form action="" method="post">
				<center>
					<table border="1">
						<tr>
							<td>编号</td>
							<td>班级名称</td>
							<td>人数</td>
							<td>辅导员</td>
							<td>专业</td>
							<td>院系</td>
						</tr>
						<tr>
							<td>编号</td>
							<td>班级名称</td>
							<td>人数</td>
							<td>辅导员</td>
							<td>专业</td>
							<td>院系</td>
						</tr>

					</table>
				</center>
			</form>
		</div>
	</div>

</body>
</html>