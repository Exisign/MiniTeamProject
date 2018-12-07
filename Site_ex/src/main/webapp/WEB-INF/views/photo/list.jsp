<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

body {
	background:
		url(https://images.pexels.com/photos/1366870/pexels-photo-1366870.jpeg?cs=srgb&dl=airplane-backlit-dawn-1366870.jpg&fm=jpg)
		no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}



</style>


</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
		<c:forEach items="${photoBoardList}" var="dto">
		<tr>
			<td>${dto.photo_number }</td>
			<td>${dto.photo_user_number }</td>
			<td><c:forEach begin="1" end="${dto.photo_indent }">-</c:forEach>
				<a href="contentView?photo_number=${dto.photo_number }">${dto.photo_title }</a></td>
			<td>${dto.photo_date }</td>
			<td>${dto.photo_view_count }</td>
		</tr>
		</c:forEach>
		<tr>
			<c:if test="${sessionScope.user ne null }"><td colspan="5"><a href="writeForm">글작성</a></td></c:if>
		</tr>
	</table>
</body>
</html>