<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String pathUri = request.getRequestURI();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/style.css" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<div id="Container">
		<div id="Header">我是顶部</div>

		<div id="Content">
			<h1>添加专业信息</h1>
			<br>
			<form action="add_Specialty_info" method="post">
				<center>
					<table border="1">
						<tr>
							<td>专业名称</td>
							<td><input type="text" name="specialty.specialtyName" /></td>
						</tr>
						<tr>
							<td>所属院系</td>
							<td width="120px"><select name="specialty.belongToCollege">
									<c:forEach var="list" varStatus="status" items="${entitys }">
										<option value="${list.collegeName }">${list.collegeName }</option>
									</c:forEach>
							</select></td>
						</tr>
						<tr>
							<td>专业简介</td>
							<td><textarea rows="20" cols="40"
									name="specialty.specialtySummarize"></textarea></td>
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