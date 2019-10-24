<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	if(request.getAttribute("sessionId")==null){
%>
<a href="insert.jsp">회원가입</a>

<%
	}else{
%>
<a href="join.jsp">회원목록</a>
<a href="delete.jsp">회원탈퇴</a>
<a href="update.jsp">회원갱신</a>
<a href="select.jsp">회원조회</a>


<%
	}
%>