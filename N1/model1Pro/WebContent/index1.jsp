<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
<jsp:include page="head.jsp">
	<jsp:param name="userId" value="12"/>
	<jsp:param name="userPw" value="12"/>
</jsp:include>
<jsp:include page="contents.jsp"/>
<jsp:include page="footer.jsp">
	<jsp:param name="addr" value="서울시 노원구"/>
	</jsp:include>
</body>
</html>