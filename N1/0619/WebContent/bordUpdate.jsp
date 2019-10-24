<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정처리</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/> 

</head>
<body>
<%@include file="header.jsp" %>

<div id="udpateOk">
	<table>
		<form action="bordUpdateOk.jsp">
		<tr><th colspan="2">글 수정 처리</th></tr>
		<tr>
			<td>NO:</td>
			<td>
				<%=request.getParameter("no") %>
				<input type="hidden" name="no" value="<%=request.getParameter("no") %>">
				<input type="hidden" name="content" value="<%=request.getParameter("content") %>">
				<input type="hidden" name="title" value="<%=request.getParameter("title") %>">
			</td>
		</tr>
		<tr>
			<td>아이디입력:</td>
			<td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원 수정 처리"></td>
		</tr>	
		</form>
	</table>
	 <br>
</div>

<%@include file="footer.jsp" %>
	
</body>
</html>