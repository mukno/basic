<%@page import="org.web.memberDTO.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%	
	if(session.getAttribute("sessionId")==null){
		response.sendRedirect("index.jsp");
	}
	MemberDTO member=(MemberDTO)request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회</title>
<script>

	function modifyOk(){
	
		console.log("modifyOk함수 호출");
		
		//선택
		var modifyForm=document.modifyForm;//전체 form의 name;
		//userId
		//	document.joinForm.userId;// name값 userId;
		
		
		//비빌번호값이 없으면 회원가입 절차를 중지//form의 input의 value		
		if(modifyForm.userPw.value==null || joinForm.userPw.value==""){
			alert("비빌번호 입력오류.. 다시 입력해주세요!");
			modifyForm.userPw.focus();
			return false;//joinOk함수 종료
		}
		//이름
		//비빌번호값이 없으면 회원가입 절차를 중지//form의 input의 value		
		if(modifyForm.userName.value==null || joinForm.userName.value==""){
			alert("이름 입력오류.. 다시 입력해주세요!");
			modifyForm.userName.focus();
			return false;//joinOk함수 종료
		}
		
		//나이 
		//비빌번호값이 없으면 회원가입 절차를 중지//form의 input의 value		
		if(modifyForm.userAge.value==null || joinForm.userAge.value==""){
			alert("나이 입력오류.. 다시 입력해주세요!");
			modifyForm.userAge.focus();
			return false;//joinOk함수 종료
		}
		
		
		alert("회원 수정  실행 ")
		
		modifyForm.submit();// form의 정보를 서버에 전송...action="JOIN.do"
		
	}

</script>

</head>
<body>
<%@include file="header.jsp" %>

<div style="background:#9e9e9e;width:80%;padding:20px 0;margin:0 auto">

	<form action="MemberModifyOk.do" method="POST" name="modifyForm" id="frm" 
			style="background:#fff;width:400px;margin:0 auto;line-height:50px;">

		아이디: <%=member.getUserID()%> 
				<input type="hidden" name="userId" value="<%=member.getUserID()%>" ><br>
		
		비빌번호: <input type="password" name="userPw" id="userPw" value="<%=member.getUserPW()%>"  size="10" maxlength="10"><br>
				
		이름: <input type="text" name="userName" id="userName" value="<%=member.getUserNAME()%>"><br>
		나이: <input type="text" name="userAge" id="userAge"value="<%=member.getUserAGE()%>"><br>
		
		<input type="reset" value="초기화">
		
		<input type="button" onclick="modifyOk()"  value="회원 가입">
			<!-- button클릭하면 joinOk()함수를 호출 -->
	</form>

</div>	

<%@ include file="footer.jsp" %>


</body>
</html>