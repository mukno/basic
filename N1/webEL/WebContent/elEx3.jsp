<%@page import="webEL.Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<jsp:useBean id="dto" class="webEL.Dto"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("dto", dto);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("");
	dispatcher.forward(request, response);	

	Dto dto11=(Dto)request.getAttribute("dto");
	
%>
<%=dto11.getUserId() %>

</body>
</html>