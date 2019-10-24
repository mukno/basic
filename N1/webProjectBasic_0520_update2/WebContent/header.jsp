<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<div style="background:#ff0;text-align:center;width:80%;line-height:50px;margin:0 auto">
	<%
		if(session.getAttribute("sessionId")!=null){
%>
			<a href="join.jsp">회원가입</a>
			<a href="login.jsp">로그인</a>
			<% 
		}else{
			%>
	
	<a href="MemberModifyView.do?userId=<%=session.getAttribute("sessionId")%>">회원수정</a>   
	<a href="MemberDeleteView.do">회원탈퇴</a>   
	<a href="LOGOUT.do">로그아웃</a>   
	<%
		}	
	%>
	
	<a href="MemberList.do">회원목록</a>
	<a href="bord.jsp">게시판</a>
	<a href="index.jsp">HOME</a>    


	 
	
</div>