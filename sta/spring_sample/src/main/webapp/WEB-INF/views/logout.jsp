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
	<form action="" method="post">

	<c:if test="${!empty loginVO.userid }">
		${loginVO.userid }님 반갑습니다.
		<button type="button">로그아웃</button>	
	</c:if>
	<c:if test="${empty loginVO.userid }">
		로그인이 필요합니다.
		<button type="button">로그인</button>
	</c:if>
	</form>
</body>
</html>