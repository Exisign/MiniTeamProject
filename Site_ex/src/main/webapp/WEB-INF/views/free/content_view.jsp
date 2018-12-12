<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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

#title{
text-align: center;
padding:3%;
margin: 50px auto;
background-color:white;
border-top: dotted black 3px;
border-bottom: dotted black 3px;
color:black;
opacity:0.8;
font-family: fantasy;
}

.table{
text-align: center;
margin: 50px auto;
height: 20%;

}

#text{
width:90%;
height:100%;
}

a.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>
</head>

<body>


	<table width="500" cellpadding="0" cellspacing="0" border="1" class="table">
		<form action="modify_view?free_num=${content_view.free_num}" method="post">
			<input type="hidden" name="free_Num" value="${content_view.free_num}">  
			<tr>
				<td>번호</td>
				<td>${content_view.free_num}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${content_view.free_hit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="fName" value="${content_view.free_name}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="fTitle" value="${content_view.free_title}">
			</tr>				
			<tr>
				<td>내용</td>
				<td><textarea rows="10" name="fContent" id="text">${content_view.free_content}</textarea></td>
			</tr>
			<tr>
 				<td colspan="2">
						<input type="submit" class="button" value="수정"/>&nbsp;&nbsp;
						<a href="list" class="button">목록</a>&nbsp;&nbsp;
						<a href="delete?free_num=${content_view.free_num}" class="button">삭제</a>&nbsp;&nbsp;
						<a href="reply_view?free_num=${content_view.free_num}" class="button">답변</a>
				</td> 
			</tr>
		</form>
	</table>
	
		
	<!-- 댓글부분시작 -->
	<table>
		<tr id="reply">
 			<td colspan="5" id="content_view">
				<form action="reply" class="button">
					<input type="hidden" name="free_num" value="${content_view.free_num}"> 
			   		<input type="hidden" name="reply_num" value="${dto.reply_num}">       
			       닉네임<input type="text" name="reply_name" ><br>
			    비밀번호<input type="text" name="reply_password"><br>
					<input type="textarea" name="reply_content" id="reply_content">
					<input type="submit" value="댓글">
				</form>
			</td> 
		</tr>		
	</table><br>
	
	
	
	<!-- <c:forEach items="${reply2}" var="dto" varStatus="status"><c:if test="${status.last}">${status.count}</c:if></c:forEach> -->
 	
  	
 	<ol>
		<c:forEach items="${reply2}" var="dto" varStatus="status"> 
			<li>
				댓글번호:${dto.reply_num}<br/>
				작성자:${dto.reply_name}<br/>
				내용:${dto.reply_content}<br/>
				작성일자:${dto.reply_date}<br/>
			</li>
			
			<!-- 작동안대 -->
			<form action="reply_delete">
				<input type="hidden" name="free_num" value="${content_view.free_num}">
				<input type="hidden" name="reply_delete" value="${dto.reply_num}">
				<input type="submit" value="삭제">
			</form>
		</c:forEach>
	</ol> 
	 
	<!-- <c:forEach items="${reply2}" var="dto" varStatus="status"><c:if test="${status.last}">${status.count}</c:if></c:forEach> -->
</body>
</html>