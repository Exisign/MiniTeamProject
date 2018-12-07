<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<td>
				<c:forEach begin="1" end="${dto.photo_indent }">-</c:forEach>
				<a href="content_view?photo_number=${dto.photo_number }">${dto.photo_title }</a></td>
			<td>${dto.photo_date }</td>
			<td>${dto.photo_hit }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"> <a href="write_view">글작성</a> </td>
		</tr>
	</table>
</body>
</html>