<%@page import="org.web.borddto.BordDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String sessionId=
    		(String)session.getAttribute("sessionId");
    
    if(sessionId==null){
    	out.print("<script>");
    	out.print("alert('로그인후 이용하세요..');");
    	out.print("location.href='bordListView.bo';");
    	out.print("</script>");
    	
    }
    
    BordDto dto=(BordDto)request.getAttribute("dto");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
</head>
<body>
<%@ include file="header.jsp"%>
<div id="bordView" style="background:#9e9e9e;width:80%;text-align:left;padding:20px 0;margin:0 auto">
	<table border="0" style="margin:0 auto;width: 500px;background:#fff;" >		
		
		
		<form action="bordWrite.bo" method="POST" name="writeForm">
		<tr><td>아이디:<%=session.getAttribute("sessionId")%></td></tr>
			<input type="hidden" name ="userId" value="<%=dto.getUserId()%>"></td></tr>
			
		<tr><td>비빌번호: <input type="password" name="bordPw" value="<%=dto.getBordPw()%>" disabled="distabled" id="bordPw" /></td></tr>
			
		<tr><td>제목: <input type="text" name="title" value="<%=dto.getTitle()%>"/></td></tr>
			
			
		<tr><td>글작성:</td></tr>
		<tr><td><textarea name="content" id="content" cols="50" rows="10"><%=dto.getContent()%></textarea></td></tr>
			
			
		<tr>
			<td>
			<%
				if(sessionId.equals(dto.getUserId())){
%>					
				<input type="submit" value="게시글 수정">
				<input type="submit" value="게시글 삭제">
				<input type="submit" value="게시글 목록">
	<% 		
					
				}
			
			
			
			%>
			
			</td>
			
		</form>
		</table>
		
		</form>
	</div>

</body>
</html>