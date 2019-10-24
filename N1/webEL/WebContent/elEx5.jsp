<%@page import="webEL.Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Dto dto1=(Dto)request.getAttribute("dto");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${dto.userId }<br>
	${dto.userPw }<br>
	${dto.userName }<br>

</body>
</html>