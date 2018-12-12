<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성일</td>
		<td>조회</td>
	<tr>
	
	<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.anony_num}</td>
		<td><a href="content_view?num=${dto.anony_num}">${dto.anony_title}</a></td>
		<td>${dto.anony_date}</td>
		<td>${dto.anony_view_count}</td>
	<tr>
	</c:forEach>
</table>



 <div id="search">
  <form id="searchForm" action="search_list" method="get" style="margin: 0;padding: 0;">
   <p style="margin:0; padding:0;">
    <input type="text" name="searchWord" size="15" maxlength="30" required>
    <input type="submit" value="제목+내용 검색">
   </p> 
  </form>
  <c:if test="${sessionScope.user ne null}"><a href="writeForm"><button>글작성</button></a></c:if>
 </div>
 
</body>
</html>