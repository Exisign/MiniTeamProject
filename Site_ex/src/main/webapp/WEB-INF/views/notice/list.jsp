<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
   <style>
.listwrap{
 width: 800px;
 max-width: 98%;
  text-align:center;
  border-top: solid 3px #a9a9a9;
  border-bottom: solid 1px #adadad;
   height:33px;
 }
   </style>  
</head>

<body>
<h1>공지사항</h1>
<table class="listwrap" width="500" cellpadding="0" cellspacing="0" border-bottom="1">
   <tr>
      
      <td>작성자</td>
      <td>내용</td>
      <td>삭제</td>
   <tr>
    <c:forEach items="${list}" var="dto">
   
   <tr>
      
      <td>${dto.notice_title}</td>
      <td>${dto.notice_content}</td>
      <td><a href="delete?user_num=${dto.user_num}">X</a></td>
   <tr>
   </c:forEach>   
   
</table>
<p><a href="writeForm">글 작성</a></p>
</body>
</html>