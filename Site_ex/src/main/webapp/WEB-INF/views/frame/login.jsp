<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

.login{
	padding: 50px 0px;
	font-size: 35px;
	height: 20% background-color:white;
	border-left: solid wihte 2px;
	color: white;
	text-align: center;
	opacity: 0.8;
	text-decoration: none;
}




</style>
</head>
<body>
	<div class="login">
		<form action="login/try" method="post">
			ID : <input type="text" name="user_id"><br>
			Password : <input type="text" name="user_pw"><br>
			<input type="submit" value="로그인"/><br>
		</form>
	</div>
	<div class="login">
		<a href="join" class="login">회원가입</a>
	</div>
</body>
</html>