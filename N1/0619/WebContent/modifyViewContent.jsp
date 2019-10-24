<%@page import="org.web.dto.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" scope="request" class="org.web.dto.MemberBean"/>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/modifyContent.css"/>
<div id="modifyView">		
	<table id="tModify">
		<form action="modifyOk.jsp" method="POST" name="modifyViewForm">
			<tr>
				<th colspan="2"><h1>회원 수정</h1></th>
			</tr>
			<tr>
				<td>아이디:</td>
				<td> <%=member.getUserId()%> <input type="hidden" name="userId" value='<%=member.getUserId()%>'></td>
			</tr>
			<tr>
				<td>비빌번호:</td>
				<td><input type="text" name="userPw" value="<%=member.getUserPw()%>"></td>
			</tr>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="userName" value="<%=member.getUserName()%>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원 수정 "></td>
			</tr>
		</form>
	</table>		
</div>