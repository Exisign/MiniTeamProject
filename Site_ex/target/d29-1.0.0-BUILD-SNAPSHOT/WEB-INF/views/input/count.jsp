<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ��</title>
</head>
<body>
	���� �� : ${count }.<br>
	<%= new java.util.Date() %>
	${requestScope.count }
	${sessionScope.count }
	${applicationScope.count }
</body>
</html>