<%@page import="java.util.Enumeration"%>
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
Enumeration header=request.getHeaderNames();

while(header.hasMoreElements()){
	
	String headerName=(String)header.nextElement();
	
	out.print("Name: "+headerName+": ");
	out.print("Value: "+request.getHeader(headerName)+"<br>");
}







%>






</body>
</html>