<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="updateOk">

<table>
	<form action="updateOk.jsp">
		<tr><th clospan="2"> 글 수정 처리</th></tr>
		<tr>
		<td>No:</td>
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
		<td>
	
			
	
	
	
	</form>

</table>








</div>


</body>
</html>