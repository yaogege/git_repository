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
<title>Insert title here</title>
<link rel="stylesheet" href="<%=basePath%>css/normalize.css">

<link rel="stylesheet" href="<%=basePath%>css/menustyle.css"
	media="screen" type="text/css" />
	
</head>
<body style="background-color: #CAFFFF">
	<div class="containerMenu">
		<ul>
			<li class="dropdown"><a href="#" data-toggle="dropdown">添加信息<i
					class="icon-arrow"></i>
			</a>
				<ul class="dropdown-menu">
					<li><a href="<%=basePath%>add/addCollege.jsp" target="content">添加学院</a></li>
					<li><a href="<%=basePath%>jump/q_college_name.jsp" target="content">添加专业</a></li>
					<li><a href="<%=basePath%>add/addCounsellor.jsp"
						target="content">添加辅导员</a></li>
					<li><a href="<%=basePath%>add/addClass.jsp" target="content">添加班级</a></li>
					<li><a href="<%=basePath%>add/addCourse.jsp" target="content">添加课程信息</a></li>
					<li><a href="<%=basePath%>add/addStudent.jsp" target="content">添加学生信息</a></li>
					<li><a href="<%=basePath%>add/addStuScore.jsp"
						target="content">录入学生成绩</a></li>
				</ul></li>
			<li class="dropdown"><a href="#" data-toggle="dropdown">查询信息<i
					class="icon-arrow"></i>
			</a>
				<ul class="dropdown-menu">
					<li><a href="<%=basePath%>jump/a.jsp" target="content">查询学院信息</a></li>
					<li><a href="<%=basePath%>jump/b.jsp" target="content">查询专业信息</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Contact</a></li>
				</ul></li>
			<li class="dropdown"><a href="#" data-toggle="dropdown">更新信息<i
					class="icon-arrow"></i>
			</a>
				<ul class="dropdown-menu">
					<li><a href="#">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Contact</a></li>
				</ul></li>
		</ul>
	</div>

	<script src="<%=basePath%>/js/index.js"></script>

	<div>

		<ul>
			<li><a href="<%=basePath%>add/addCollege.jsp" target="content">添加学院</a></li>
			<li><a href="<%=basePath%>add/addSpecialty.jsp" target="content">添加专业</a></li>
			<li><a href="<%=basePath%>add/addCounsellor.jsp"
				target="content">添加辅导员</a></li>
			<li><a href="<%=basePath%>add/addClass.jsp" target="content">添加班级</a></li>
			<li><a href="<%=basePath%>add/addCourse.jsp" target="content">添加课程信息</a></li>
			<li><a href="<%=basePath%>add/addStudent.jsp" target="content">添加学生信息</a></li>
			<li><a href="<%=basePath%>add/addStuScore.jsp" target="content">录入学生成绩</a></li>
		</ul>

		<li><a href="<%=basePath%>query/qClassInfo.jsp" target="content">查看学院</a></li>
		<li><a href="<%=basePath%>add/addSpecialty.jsp" target="content">添加专业</a></li>


	</div>
</body>
</html>