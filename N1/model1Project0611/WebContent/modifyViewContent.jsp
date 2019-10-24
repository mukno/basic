<%@page import="org.web.dto.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" scope="request" class="org.web.dto.MemberBean"/>
<%-- <jsp:setProperty  name="member" property="userId" value=""/>
<jsp:getProperty name="member" property="userId"/> --%>

<%
	
	//MemberBean member1=(MemberBean)request.getAttribute("member1");
	
%>

 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/modifyContent.css"/>
<div id="modifyView">		
	<table id="tModify">
		<form action="modifyOk.jsp" method="POST" name="modifyViewForm">
			<tr>
				<th><h1>회원 가입</h1></th>
			</tr>
			<tr>
				<td>아이디: <input type="text" name="userId" value='<%=member.getUserId()%>'></td>
				<td>비빌번호: <input type="text" name="userPw" value="<%=member.getUserPw()%>"></td>
				<td>이름: <input type="text" name="userName" value="<%=member.getUserName()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원 수정 "></td>
			</tr>
		</form>
	</table>		
</div>