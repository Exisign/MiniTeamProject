<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

<div class="container">
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify_view" method="post">
			<input type="hidden" name="num" value="${content_view.anony_num}">
			<tr>
				<td>번호</td>
				<td>${content_view.anony_num}</td>
			</tr>

			<tr>
				<td>히트</td>
				<td>${content_view.anony_view_count}</td>
			</tr>
			
			<tr>
				<td>제목</td>
				<td>${content_view.anony_title}</td>
			</tr>
			
			<tr>
				<td>내용</td>
				<td>${content_view.anony_content}</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<a href="list">목록보기</a>&nbsp;&nbsp; 
					
					<c:if test="${sessionScope.user eq content_view.user_id}">
					<input type="submit" value="수정">&nbsp;&nbsp;
					<a href="delete?num=${content_view.anony_num}">삭제</a>
					</c:if>
					</td>
			</tr>
		
			
		</form>
		</table>
		<!-- 게시물 끝 -->
 <!--  댓글  -->
    <div class="container">
        <label for="content">comment</label>
        <form action="stranger">
            <div class="input-group">
               <input type="hidden" name="anony_num" value="${content_view.anony_num}"/>
               <input type="text" class="form-control" id="content" name="content" placeholder="내용을 입력하세요.">
               <span class="input-group-btn">
                    <input type="submit" value="등록">
               </span>
              </div>
        </form>
    </div>
	<ol>
	<c:forEach items="${reply}" var="dto">
		
		<li>작성날짜:${dto.reply_date}<br/>
		내용:${dto.reply_content}</li>
	<br/>
	</c:forEach>
	<ol>
</div>
  <script>

 </script> 



</body>
</html>
