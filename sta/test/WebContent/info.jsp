<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	request.setCharacterEncoding("utf-8");
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String gender=request.getParameter("gender");
	String grade=request.getParameter("grade");
	String pet[]=request.getParameterValues("pet");
	String pets=Arrays.toString(pet);
	
%>
<h3>아이디 : <%=id %></h3>
<h3>이름 : <%=name %></h3>
<h3>성별 : <%=gender %></h3>
<h3>학년 : <%=grade %></h3>
<h3>애완동물 : <%=pets.substring(1,pets.length()-1) %></h3>