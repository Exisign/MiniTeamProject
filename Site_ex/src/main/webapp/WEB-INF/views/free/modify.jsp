<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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


</style>

</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1" class="table">
		<form action="modify?free_num=${modify_view.free_num}" method="post">
			<input type="hidden" name="free_num" value="${modify_view.free_num}">  
			<tr>
				<td>번호</td>
				<td>${modify_view.free_num}</td>
			</tr>
			<tr>
				<td>히트</td>
				<td>${modify_view.free_hit}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="fName" value="${modify_view.free_name}"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="fTitle" value="${modify_view.free_title}">
			</tr>				
			<tr>
				<td>내용</td>
				<td><textarea rows="10" name="fContent">${modify_view.free_content}</textarea></td>
			</tr>
			<tr>
 				<td colspan="2">
					<input type="submit" value="수정"/>&nbsp;&nbsp;
						<a href="list">취소</a>&nbsp;&nbsp;
				</td> 
			</tr>
		</form>
	</table>


</body>
</html>