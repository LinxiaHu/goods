<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询订单列表</title>
</head>
<body>
	订单：&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/queryUserLogin.action">返回</a>
	<br>
	<table width="100%" border=1>
		<tr>
			<td>订单号</td>
			<td>订单所属用户</td>
			<td>订单条目名称</td>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.oid }</td>
				<td>${item.uid }</td>
				<td><c:forEach items="${item.orderitems}" var="i">
						${i.bname}<br>
					</c:forEach></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>