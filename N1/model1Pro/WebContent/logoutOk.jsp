<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

if(session.getAttribute("sessionId")!=null){
	session.invalidate();
	%>
	<script>
	alert('로그아웃 성공 인덱스 페이지로 이동');	
	location.href="index.jsp";
	</script>

<%
}
else{
	%>
	alert('이미 로그아웃 되었습니다.');	
	location.href="index.jsp;"

<%
}
%>

    