<%@page import="org.web.memberDTO.memberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- jsp 내장객체 -->
<%

	ArrayList<memberDTO> members=(ArrayList<memberDTO>)request.getAttribute("members");
	





%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>
<%@include file ="header.jsp" %>
	<h1>회원리스트</h1>
	<%
	for(memberDTO a:members){
		out.print("아이디:" +a.getUserId());
		out.print("비밀번호:" +a.getUserPw());
		out.print("이름:" +a.getUserName());
		out.print("나이:" +a.getUserAge());
		
	}
	
	
	%>
	<h1>회원리스트</h1>
	<%

		for(memberDTO a:members){
	%>
	<div>아이디:<%=a.getUserId() %>,비밀번호: <%=a.getUserPw() %>,
	이름:<%=a.getUserName() %>,나이:<%=a.getUserAge() %>
	</div>
		
	<%
		}
	%>
	<h1>테이블이용한 회원 리스트</h1>
	<table style="width:500px;text-align:center; border:1px solid #000; border-collapse: collapse;" border="1"  >
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
	<%
	for(memberDTO dto:members){
	
	%>	
	
		<tr>
			<td><%=dto.getUserId() %></td>
			<td><%=dto.getUserPw() %></td>
			<td><%=dto.getUserName() %></td>
			<td><%=dto.getUserAge() %></td>
		</tr>
	<%
	}
	%>
	    <tr>
			<td><a href="formEx.jsp">회원가입</a></td>
			<td><a href="loginView.do">로그인</a></td>
			<td><a href="logOut.do">로그아웃</a></td>
			<td><a href="index.jsp">거</a></td>
		</tr>
		
		
		
		
	
	</table>
	


</body>
</html>