<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var xhr = new XMLHttpRequest;
	
	function loginOk() {

		console.log("aaa");
		
		var loginForm = document.loginForm;

		var userId = loginForm.userId;
		var userPw = loginForm.userPw;
		
		var url = "loginOk.mo";
		
		var data = "userId=" + userId.value + "&userPw=" + userPw.value;

		xhr.open("POST", url, true);

		xhr.setRequestHeader('Content-Type',
				'application/x-www-form-urlencoded;charset=utf8');

		xhr.onreadystatechange = func1;
		xhr.send(data);
	}

	function func1() {

		if (xhr.readyState == 4 && xhr.status == 200) {

			
			var result = xhr.responseText;

			
			if (result == 1) {
				alert("로그인 성공");
				location.href="index.jsp";				
			
				return;
			} else {
				alert("로그인 실패");
				return;
			}

		}else{
			
		}

	}
</script>



</head>
<body>
	<form action="#" method="POST" name="loginForm">
		Id: <input type="text" name="userId"><br> Pw: <input
			type="password" name="userPw"><br> <input type="button"
			onclick="loginOk()" value="로그인 ">


	</form>

</body>
</html>