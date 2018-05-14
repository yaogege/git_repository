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
</style>
<body>
	<div id="Container">
		<div id="Header">我是顶部</div>

		<div id="Content">
			<h1>查看专业信息:</h1>
			<br>
			<form action="" method="post">
				<center>
					<table border="1" class="table">
						<tr align="center">
							<td width="15px">序号</td>
							<td width="100px">专业名称</td>
							<td width="30px">所属院系</td>
							<td width="30px">人数</td>
							<td width="400px">专业简介</td>
						</tr>
						<c:forEach var="list" varStatus="status"
							items="${specialtyEntitys }">
							<tr>
								<td>${status.index+1 }</td>
								<td>${list.specialtyName }</td>
								<td>${list.belongToCollege }</td>
								<td>${list.specialtyNumber }</td>
								<td>${list.specialtySummarize }</td>
							</tr>
						</c:forEach>

					</table>
				</center>
			</form>
		</div>
	</div>

</body>
</html>