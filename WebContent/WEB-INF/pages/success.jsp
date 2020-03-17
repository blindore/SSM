<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功</h1>
	<table cellpadding="5" cellspacing="0" border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>course</th>
			<th>address</th>
		</tr>
		<c:forEach items="${info.list }" var="tea">
			<tr>
				<td>${tea.id}</td>
				<td>${tea.name }</td>
				<td>${tea.course }</td>
				<td>海淀区</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><a href="getall?pageNum=1">首页</a> <a
				href="getall?pageNum=${info.prePage }">上一页</a> <c:forEach
					items="${info.navigatepageNums }" var="num">
					<c:if test="${num==info.pageNum }">
					【${num }】</c:if>
					<c:if test="${num!=info.pageNum }">
						<a href="getall?pageNum=${num}">${num }</a>
					</c:if>
				</c:forEach> <a href="getall?pageNum=${info.nextPage }">下一页</a> <a
				href="getall?pageNum=${info.pages }">末页</a></td>
		</tr>
	</table>
</body>
</html>