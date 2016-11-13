<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
</head>
<body>
	<div align="center" style="color: red;">
		<h1>注册</h1>
	</div><br><br>
	<div align="center">
		<form action="${ctx }/admin/register" method="post">
			登录名：<input type="text"><br>
			密码：<input type="password"><br>
			<input type="submit" value="注册">
		</form>
	</div>
</body>
</html>