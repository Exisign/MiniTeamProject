<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" cellpadding="0" cellspacing="0" lorder="1">
		<form action="write" method="post">
			<tr>
				<td>이름</td>
				<td>${photoContent.photo_user_number}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${photoContent.photo_title}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea readonly>${photoContent.photo_content}</textarea></td>
			</tr>
			<tr>
				<c:if test="${sessionScope.user ne null }">
				<input type="hidden" name="photo_number" value=${photoContent.photo_number }"/>
				<td colspan="3">
					<input type="submit" value="수정">&nbsp;&nbsp;
					<input type="submit" value="삭제">&nbsp;&nbsp;
					<a href="list">목록으로</a>
					</td>
				</c:if>
			</tr>
		</form>
	</table>
	<c:if test="${sessionScope.user ne null }">
	<script>
        var forms;
        window.onload = function(){
            forms = document.forms;
            forms[0][1].addEventListener("click", check, false);
            forms[0][2].addEventListener("click", check, false);
        }
        function check(){
            if(this.value==="수정"){
                forms[0].action = "modify"
            }else if(this.value==="삭제"){
                forms[0].action = "delete"
            }
        }
	</script></c:if>
</body>
</html>