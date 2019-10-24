<%@page import="webEL.Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	Dto dto=new Dto();
 request.setAttribute("dto1", dto);
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${requestScope.dto1 }<br>
${dto1 }<br>
${dto1.setUserId("m1") }
${dto1.setUserPw("11") }
${dto1.setUserName("s1") }
${dto1.userId }<br>
${dto1.userPw }<br>
${dto1.userName }<br>

</body>
</html>