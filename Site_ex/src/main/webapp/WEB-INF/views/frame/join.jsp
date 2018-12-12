<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join/try" method="post">
        <table>
            <tr>
                <td>아이디 : </td>
                <td><input type="text" name="user_id"> <button>중복확인</button><br></td>
            </tr>
            <tr>
                <td>비밀번호 : </td>
                <td><input type="text" name="user_pw"></td>
            </tr>
            <tr>
                <td>이름 : </td>
                <td><input type="text" name="user_name"><br></td>
            </tr>
            <tr>
                <td>닉네임 : </td>
                <td><input type="text" name="user_nickname"> <button>중복확인</button></td>
            </tr>
            <tr>
                <td>이메일 : </td>
                <td><input type="text" name="user_email"></td>
            </tr>
            <tr>
                <td>휴대전화 : </td>
                <td><input type="text" name="user_phone"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="회원가입 완료"></td>
            </tr>
        </table>
    </form>
</body>
</html>