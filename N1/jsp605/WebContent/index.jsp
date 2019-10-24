<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("sessionId")==null){
%>
	<a href="join.jsp">회원가입</a>
	<a href="login.jsp">로그인</a>
<%
}else{
%>
	<a href="modify.jsp">게시글수정</a>
	<a href="memberDelete.jsp">게시글삭제</a>
<%
}
%>

</body>
</html>