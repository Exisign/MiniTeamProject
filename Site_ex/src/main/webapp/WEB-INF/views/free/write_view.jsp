<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


<table class="table">
	<form action="write" method="post">
		<tr>
			<td>이름</td>
			<td><input type="text" name="fName" size="50"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="fTitle" size="50"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="fContent" rows="20"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="입력">&nbsp;&nbsp;<a href="write"></a></td>		
		</tr>
	</form>
</table>
</body>
</html>