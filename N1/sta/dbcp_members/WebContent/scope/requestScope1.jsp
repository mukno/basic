<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//post 방식이었기 때문에 한글처리 필요
	request.setCharacterEncoding("utf-8");
	//scope1.jsp가 보낸값 가져오기
	String userid=(String)session.getAttribute("userid");
	String username=(String)session.getAttribute("username");
	String userid1=request.getParameter("userid");
	String username1=request.getParameter("username");
	out.print("<h3>userid: "+userid+"</h3>");
	
%>
<h3>username: <%=username %></h3>
<h3><a href="requestScope2.jsp"></a></h3>
<jsp:forward page="requestScope2.jsp"></jsp:forward>