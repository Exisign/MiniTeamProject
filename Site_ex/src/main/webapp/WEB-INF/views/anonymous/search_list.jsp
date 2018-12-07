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


</style>


</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성일</td>
		<td>조회</td>
	<tr>

	<c:forEach items="${search_list}" var="dto">
	<tr>
		<td>${dto.anony_num}</td>
		<td><a href="content_view?num=${dto.anony_num}">${dto.anony_title}</a></td>
		<td>${dto.anony_date}</td>
		<td>${dto.anony_view_count}</td>
	<tr>
	</c:forEach>
</table>

<a href="writeForm"><button>글작성</button></a>
<a href="list">이전 목록으로</a>

 <div id="search">
  <form id="searchForm" action="search_list" method="get" style="margin: 0;padding: 0;">
   <p style="margin:0; padding:0;">
    <input type="text" name="searchWord" size="15" maxlength="30">
    <input type="submit" value="제목+내용 검색">
   </p> 
  </form>
 </div>
</body>
</html>