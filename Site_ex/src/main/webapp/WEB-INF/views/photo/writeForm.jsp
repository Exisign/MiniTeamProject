<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" lorder="1">
		<form action="/d29/write" method="post">
			<tr>
				<td>이름</td>
				<td><input type="text" name="photo_user_number" size="50"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="photo_title" size="50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="photo_content" rows="10"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력">&nbsp;&nbsp;<a href="list">목록으로</a></td>
			</tr>
		</form>
	</table>
</body>
</html>