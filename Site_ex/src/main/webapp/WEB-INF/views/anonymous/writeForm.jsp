<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기</title>
<script type="text/javascript">
	function move(url) {
		location.href = url;
	}
</script>
</head>
<body>

	<form name="BoardWriteForm" method="post"
		action="write">
<input type="hidden" name="user_id" value="${sessionScope.user }">
		<colgroup>
			<col width="20%">
			<col width="80%">
		</colgroup>


		<table summary="테이블 구성">
			<caption>익명글쓰기</caption>
			<tr>
				<td>제 목</td>
				<td><input type=text name=title></td>
			</tr>
			<tr>
				<td>내 용</td>
				<td><textarea name=content rows="10" cols="100"></textarea></td>
			</tr>
			<tr>
				<td colspan=2><hr size=1></td>
			</tr>
			<tr>
				<td colspan="2"><div align="center">
						<input type="submit" value="등록">&nbsp;&nbsp; <input
							type="button" value="뒤로" onclick="move('list');">
					</div></td>
			</tr>
		</table>
	</form>

</body>
</html>