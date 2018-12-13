<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

#div_root {
	width: 100%;
	padding-top:5px;
	text-align: center;
}

#div_top {
	width: 1000px;
	height: 100px;
	background-color: white;
	margin: auto;
	padding: 0px;
	opacity: 0.8;
}

#div_middle {
	width: 1000px;
	height: 1000px;
	margin: auto;
	color: grey;
	text-decoration: none;
	font-family: '맑은 고딕';
	text-align: center;
}

#div_menu {
	padding: 50px 0px;
	font-size: 35px;
	height: 20% background-color:white;
	border-left: solid wihte 2px;
	color: white;
	text-align: center;
	opacity: 0.8;
	text-decoration: none;
}

.P1 {
	font-size: 60px;
	margin:20px;
	color: white;
}

.P2 {
	font-size: 80px;
	color: white;
}

a:link {
	text-decoration: none;
	color: white;
}

a:visited {
	text-decoration: none;
	color: white;
}

a:active {
	text-decoration: none;
	color: red;
}

a:hover {
	text-decoration: none;
	color: red;
}

#mini {
	font-size: 90px;
	color: white;
	opacity: 0.8;
	font-family: '맑은 고딕';
}

#project {
	font-size: 90px;
	color: white;
	opacity: 0.8;
	font-family: '맑은 고딕';
}

#login {
	margin-top: 15px;
	border: solid white 3px;
	padding:10px;
	font-size: 30px;
	color: white;
	opacity: 0.8;
	font-family: '맑은 고딕';
}
</style>
</head>
<body>
	<div id="div_root">
		<font class="P1"><span id="mini">MINI</span> <span id="project">PROJECT</span></font><br>	
			<span><c:choose>
				<c:when test="${sessionScope.user eq null}"><br>
					<a href="/d29/login" id="login">로그인</a>
				</c:when>
				<c:when test="${sessionScope.user ne null}">${sessionScope.user}님 안녕하세요.<a
						href="logout" id="login">로그아웃</a>
				</c:when>
			</c:choose></span>
		
		<div id="div_middle">
			<div id="div_menu">
				<div>
					<a href="/d29/notice/list">공지 사항</a>
				</div><br>
				<div>
					<a href="/d29/free/list">자유 게시판</a>
				</div><br>
				<div>
					<a href="/d29/photo/list">사진 게시판</a>
				</div><br>
				<div>
					<a href="/d29/anonymous/list">익명 게시판</a>
				</div><br>
			</div>
		</div>
	</div>

	test for GIT
	test for bento
	test for junhee

	test for sunghyun

</body>
</html>