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
	//내장객체 ServletConfig config=this.getServletConfig(); 

	String url=config.getServletContext().getInitParameter("url");
	String user=config.getServletContext().getInitParameter("user");
	String password=config.getServletContext().getInitParameter("password");
	
%>
url: <%=url %><br>
user: <%=user %><br>
password: <%=password %><br>

</body>
</html>