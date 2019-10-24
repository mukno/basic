<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
in1
<jsp:forward page="footer2.jsp">
	<jsp:param name="userId" value="m1"/>
	<jsp:param name="userPw" value="11"/>
</jsp:forward>
	in2

</body>
</html>