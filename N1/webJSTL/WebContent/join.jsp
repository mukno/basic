<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<form name="loginForm">
	
		Id: <input type="text" name="userId"><br>
		Pw: <input type="text" name="userPw"><br>
		Name: <input type="text" name="userName"><br>
	
		<input type="submit" value="회원 탈퇴" onclick="subm(1)">
		<input type="submit" value="회원 가입" onclick="subm(2)">
		<input type="submit" value="회원 수정" onclick="subm(3)">
		<input type="submit" value="로그인" onclick="subm(4)">
	
	
	
	</form>
	<script>
	function subm(su) {
		var loginForm=document.loginForm;
		if(su==1){
			loginForm.action='delete.jsp';
		}
		if(su==2){
			loginForm.action='add.jsp';
		}
		if(su==3){
			loginForm.action='update.jsp';
		}
		if(su==4){
			loginForm.action='login.jsp';
		}
		
	}
	</script>

</body>
</html>