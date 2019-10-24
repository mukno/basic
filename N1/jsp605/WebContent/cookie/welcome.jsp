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
	Cookie[] cookies=request.getCookies();//쿠기값가져온다
	for(int i=0; i<cookies.length;i++){
		String id=cookies[i].getValue();//쿠기값 가져온s다.
		if(id.equals("root"))out.println(id+"님 안녕하세요."+"<br>");
		
	}
	



%>
<a href="logout.jsp">로그아웃</a>
<a href="contest.jsp">로그아웃</a>


</body>
</html>