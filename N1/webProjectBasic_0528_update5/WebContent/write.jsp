<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//게시글 작성.. 로그인이 된 상태에서만 게시글 작성..
	if(session.getAttribute("sessionId")==null){		
		out.print("<script>");
		out.print("alert('로그인 후에 이용하세요');");
		out.print("location.href='login.jsp';");			
		out.print("</script>");		
	}
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div id="write" style="background:#9e9e9e;width:80%;text-align:left;padding:20px 0;margin:0 auto">
	<table border="0" style="margin:0 auto;width: 500px;background:#fff;" >		
		
		<form action="bordWrite.bo" method="POST" name="writeForm">
		<tr><td>아이디:<%=session.getAttribute("sessionId")%></td></tr>
			<input type="hidden" name ="userId" value="<%=session.getAttribute("sessionId")%>"></td></tr>
			
		<tr><td>비빌번호: <input type="password" name="bordPw" id="bordPw" /></td></tr>
			
		<tr><td>제목: <input type="text" name="title"/></td></tr>
			
			
		<tr><td>글작성:</td></tr>
		<tr><td><textarea name="content" id="content" cols="50" rows="10"></textarea></td></tr>
			
			
		<tr><td><input type="submit" value="게시글 작성">
			
		</form>
		</table>
		
		</form>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


</body>
</html>