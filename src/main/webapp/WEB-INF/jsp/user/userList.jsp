<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	欢迎您：${sessionScope.uc.loginname} &nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/queryUserInfo.action">用户中心</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/tmp.jsp?loginout=true">退出</a>
	<br> 用户列表：
	<br>
	<table width="100%" border=1>
		<tr>
			<td>用户Id</td>
			<td>用户登录名</td>
			<td>用户密码</td>
			<td>用户Email</td>
			<td>用户状态</td>
			<td>用户激活码</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${userlist}" var="item">
			<tr>
				<td>${item.uid}</td>
				<td>${item.loginname}</td>
				<td>${item.loginpass}</td>
				<td>${item.email}</td>
				<td>${item.status}</td>
				<td>${item.activationcode}</td>
				<td><a
					href="${pageContext.request.contextPath}/updateUser.action?id=${item.uid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>