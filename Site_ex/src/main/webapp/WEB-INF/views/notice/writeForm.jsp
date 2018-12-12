<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h3>새 글쓰기</h3>
	<table cellpadding="0" cellspacing="0" border="1">
		<form action="write" method="post">

			<tr>
				<td>제목</td>
				<td><input type="text" placeholder="제목을 입력하세요. "
					name="notice_title" size="70"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea id="content" class="text" name="notice_content"
						placeholder="내용을 입력하세요. " cols="70" rows="25"></textarea></td>
			</tr>
			 
	</table>
	
	<input type="submit" value="완료" />
	<a href="list">목록보기</a>
	 
	</form>
</body>
</html>