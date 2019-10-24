<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>
	
	function loginOk(){
		
		var loginForm=document.loginForm;
		if(loginForm.userId.value==null||loginForm.userId.value==""){
			alert("아이디 입력오류.. 다시 입력해주세요..");
			loginForm.userId.focus();
			return false;
		}
		if(loginForm.userPw.value==null||loginForm.userPw.value==""){
			alert("비밀번호 입력오류.. 다시 입력해주세요..");
			loginForm.userPw.focus();
			return false;
		}
		alert("로그인Go");
		
		loginForm.submit();//form의 정보를 서버에전송
		
	}
	


</script>
</head>
<body>

<%@include file="header.jsp" %>
<div id="login" style="background:#555;color:#fff;font-size:50px;
		 text-align:center;width:80%;line-height:500px;margin:0 auto">


		<form action="LOGIN.do" name="LoginForm" method="POST" id="LoginForm">
			아이디:<input type="text" name="userId" id="userId" ><br>
			비밀번호:<input type="password" name="userPw" id="userPw" ><br>
			 
			<input type="button" id="loginBtn" onclick="loginOk()" value="로그인실행">
		
		</form>

</div>
<%@ include file="footer.jsp" %>
</body>
</html>