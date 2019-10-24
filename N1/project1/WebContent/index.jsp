<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String sessionId=(String)session.getAttribute("sessionId");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#gri{
	display:grid;
	grid-template-columns:150px 1fr;	

}

h1{
	margin:0;
	text-align: center;
	border-bottom: solid 5px red;
	padding: 20px;

}
ol{
	border-right: solid 5px red;
	width: 150px;
	height: 300px;
	
}
#nus{
margin-top:30px;
margin-left: 80px;



}

</style>
</head>
<body>

<h1>INDEX</h1>


<div id="gri">
<ol>
	<a href="index.jsp"><li>홈</li></a>
	<a href="join.jsp"><li>회원가입</li></a>
	<a href="login.jsp"><li>로그인</li></a>
</ol>
<div id="nus">
				
			<%
		if(session.getAttribute("sessionId")==null){
	%>
	<p>안녕하세요</p>
	<%
		}else{
			%>
			
	<p><%=sessionId %>님 안녕하세요</p>
			
			<%			
		}
	%>
				
			</div>
</div>

</body>
</html>