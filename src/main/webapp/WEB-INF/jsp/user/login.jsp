<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆</title>
</head>
<body>
	请登录：<br>

	<form method="POST" action="/goods/queryUserLogin.action">
		用户名：<input type="text" name="userCustom.loginname" /> 
		
		密码： <input type="password" name="userCustom.loginpass" />
		
		<input type="submit" value="提交"/>

	</form>
</body>
</html>