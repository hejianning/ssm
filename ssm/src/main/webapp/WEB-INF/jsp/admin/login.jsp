<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<div align="center" style="color: red;">
		<h1>登录</h1>
	</div><br><br>
	<div align="center" style="color:green;">
		<a  href="${ctx }/admin/register">注册</a>
	</div><br><br>		
	<br><br>
	<div align="center">
		<form action="${ctx }/admin/login" method="post">
			登录名：<input type="text" name="loginName"><br>
			密码：<input type="password" name="password"><br>
			<input type="submit" value="登陆">
		</form>
	</div>
</body>
</html>