<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ID:<%=request.getParameter("userId") %>
PW:<%=request.getParameter("userPw") %>
주소:<%=request.getParameter("addr") %>
</body>
</html>