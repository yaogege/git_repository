<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=basePath%>css/style.css" type="text/css" />
</head>

<body>
	<div id="Container">
		<div id="Header">我是顶部</div>

		<div id="Content">
			<h1>添加班级信息:</h1>
			<form action="add_college_info" method="post">
				<center>
					<table border="1">
						<tr>
							<td>学院名称</td>
							<td><input type="text" name="college.collegeName" /></td>
						</tr>
						<tr>
							<td>学院简介</td>
							<td><input type="text" name="college.collegeSummarize" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="添加" /></td>
						</tr>
					</table>
				</center>
			</form>
		</div>
	</div>

</body>
</html>