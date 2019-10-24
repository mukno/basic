<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
<%
	if(session.getAttribute("sessionId")!=null){
		session.invalidate();
	%>	
		<script>
			alert('로그아웃 성공.. index페이지로 이동');
			location.href="index.jsp";		
		</script>
	<%
	}else{
		%>
		<script>
			alert('이미 로그아웃 되었습니다... index페이지로 이동');
			location.href="index.jsp";		
		</script>
		
		<%		
	}
%>


</body>
</html>