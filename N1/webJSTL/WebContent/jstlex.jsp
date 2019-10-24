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
<!--  예외처리 ..예외에 관한 변수를 설정 -->
<c:catch var="ex1">
	<%=10/0 %>
</c:catch>
예외발생 :${ex1 }
<br>
	<%
		int i;
	%>
<c:catch var="ex2">
	${i }
</c:catch>
</body>
</html>