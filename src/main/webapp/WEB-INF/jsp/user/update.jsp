<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
</head>
<body>
	${sessionScope.uc.loginname}信息修改：&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/queryUserLogin.action">返回</a>
	<br>

	<form action="updateSubmitUser.action" method="POST">
		<input type="hidden" value="${userCustom.uid}"
			name="uid" /> <input type="hidden"
			value="status" name="${userCustom.status}" /> <input
			type="hidden" value="${userCustom.activationcode}"
			name="activationcode" />
		<table width="100%" border=1>

			<tr>
				<td>用户Id:${userCustom.uid}</td>
			</tr>
			<tr>
				<td>用户登录名:<input value="${userCustom.loginname}" type="text"
					name="loginname"></td>
			</tr>
			<tr>
				<td>用户密码:<input value="${userCustom.loginpass}" type="text"
					name="loginpass"></td>
			</tr>
			<tr>
				<td>用户Email:<input value="${userCustom.email}" type="text"
					name="email"></td>
			</tr>

		</table>
		<br> <input type="submit" value="提交">
	</form>


</body>
</html>