<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var xhr = new XMLHttpRequest;
	
	function memberDeleteOk() {

		var memberDeleteForm = document.memberDeleteForm;
		
		var userId = memberDeleteForm.userId;
		var userPw = memberDeleteForm.userPw;
		
		var url = "memberDeleteOk.mo";
		
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
				alert("회원탈퇴 성공");
				location.href="index.jsp";				
				return;
			} else {
				alert("회원탈퇴 실패");
				return;
			}

		}else{
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
</script>



</head>
<body>
	<form action="#" method="POST" name="memberDeleteForm">
		Id: <input type="text" name="userId"><br> Pw: <input
			type="password" name="userPw"><br> <input type="button"
			onclick="memberDeleteOk()" value="회원탈퇴 ">


	</form>

</body>
</html>