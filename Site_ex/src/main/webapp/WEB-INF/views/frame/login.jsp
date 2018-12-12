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
</style>
</head>
<body>
	<div>
		<form action="login/try" method="post">
			ID : <input type="text" name="user_id">
			Password : <input type="text" name="user_pw">
			<input type="submit" value="로그인"/>
		</form>
	</div>
	<div>
		<a href="join">회원가입</a>
	</div>
</body>
</html>