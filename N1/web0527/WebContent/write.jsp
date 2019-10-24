<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

	if(session.getAttribute("sessionId")==null){
		//로그인이 된 상태에서만 게시글 작성.
		
		out.print("<script>");
		out.print("alert('로그인후에 이용하시오');");
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
	<div id="write">
		<form action="BordWrite.bo"method="POST" name="writeForm">
			아이디:<%=session.getAttribute("sessionId")%>
			<input type="hidden" name="userId" value="<%=session.getAttribute("sessionId") %>">
			
			비밀번호:<input type="password" name="bordPw" id="bordPw"/><br>
			제목:<input type="text" name="title"/><br>
			글작성:<textarea name="context" id="content" cols="50" rows="10"></textarea><br>
			<input type="submit" value="게시글 작성">
			
		
		
		
		</form>
		
	
	
		</div>

</body>
</html>