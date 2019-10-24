<%@page import="org.web.dto.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="member" scope = "request" class = "org.web.dto.MemberBean"/>
	<%-- <jsp:setProperty property="userId" name="member" value=""/>
	<jsp:getProperty property="userId" name="member"/> --%>

<%

/* MemberBean member1 =(MemberBean)request.getAttribute("member");
 */
%>	

<div id="modifyView">		
	<table id="tmodify">
		<form action="modifyOk.jsp" method="POST" name="modifyForm">
			<tr>
				<th><h1>회원 수정</h1></th>
			</tr>
			<tr>
				<td>아이디: <%=member.getUserId()%><input type="hidden" name="userId" value ="<%=member.getUserId()%>"></td>
				<td>비빌번호: <input type="text" name="userPw" value ="<%=member.getUserPw()%>"></td>
				<td>이름: <input type="text" name="userName" value ="<%=member.getUserName()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원수정 ">	</td>
			</tr>
		</form>
	</table>		
</div>