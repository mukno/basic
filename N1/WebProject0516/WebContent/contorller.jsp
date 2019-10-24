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
	String uri=request.getRequestURI();//요청URI
	String path=request.getContextPath();//기본 path
	String basicPath=uri.substring(path.length());//기본path
	
	//uri.substring(0,uri.length()-".do".length());
	
	out.print("요청경로: "+basicPath);


%>

</body>
</html>