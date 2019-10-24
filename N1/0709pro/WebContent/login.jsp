<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="header.jsp"/>
    ID: <input type="text" name="userId"><br>
	Pw: <input type="password" name="userPw"><br>
	<input type="button" value="로그인" onclick="loginOk()">

<script src="js/ajaxLogin.js"></script>

</body>
</html>