<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성 페이지</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
</head>
<body>
<%@include file="header.jsp" %>

	<div id="BordWrite">		
	<table id="tWrite">
		<form action="writeOk.jsp" method="POST" name="writeForm">
			<tr>
				<th><h1>글작성</h1></th>
			</tr>
			<tr><!-- no 인 auto_increment 는 자동으로 같이 설정됨 -->
				<td>아이디: <input type="text" name="userId"></td>
				</tr>
				<tr>
				<td>글제목: <input type="text" name="title"></td>
				</tr>
				<tr>
				
				<td>
					글내용:<textarea rows="5" cols="30" name="content"></textarea>

</td>
			</tr>
			<tr>
				<td clospan="2">
				<td><input type="submit" value="글 작성 ">	</td>
			</tr>
		</form>
	</table>		
</div>
	
	
	
	
	
	
	
	
	<%@include file="footer.jsp" %>


</body>
</html>
