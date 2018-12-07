<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
width:100%;
}

.top{
font-size:20px;
font-weight:bold;
margin: 50px auto;
padding: 10px auto;
background-color: palegreen;
}

</style>

</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1" class="table">
		<tr class="top">
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>

		<c:forEach items="${searchWord}" var="dto">
			<tr>
				<td>${dto.free_num}</td>
				<td>${dto.free_name}</td>
				<td>
					<c:forEach begin="1" end="${dto.free_indent}">-</c:forEach>
					<a href="content_view?free_num=${dto.free_num}">${dto.free_title}</a></td>
				<td>${dto.free_date}</td>
				<td>${dto.free_hit}</td>
			</tr>
		</c:forEach>	
	
		<tr>
			<td colspan="5"><a href="write_view"><button>글작성</button></a></td>
		</tr>
		<tr>
			<div id="search">
				<td colspan="5"><form id="searchForm" action="list2" method="get" style="margin: 0; padding: 0;">
					<p style="margin: 0;padding: 0;">
						<input type="text" name="searchWord" size="15" maxlength="30"/>
						<input type="submit" value="검색"/>
					</p>
				</form></td>
			</div>
		</tr>
	</table>
</body>
</html>