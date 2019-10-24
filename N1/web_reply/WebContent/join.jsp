<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
//window.onload=function(){} 먼저읽는다.
	

		function idChecked(){
		var joinForm=document.joinForm;
		var xhr=new XMLHttpRequest();
			
			var userId=joinForm.userId;
			var idCheck=joinForm.idCheck;
			var data="userId="+userId.value;
			var url="idChecked.mo";
			
			xhr.open("POST",url,true);
			xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
			xhr.send(data);
			xhr.onreadystatechange=function(){
				if(xhr.readyState == 4 && xhr.status == 200)
				{
					var result=xhr.responseText;//문자열..
					if(result==1){
						alert("중복아이디 입니다 ");
						userId.focus();
						return;
					}else{
						alert("아이디 사용 가능합니다.");
						idCheck.value="idCheckedOk";
						return;
					}
				
				
			}
		
			
		};
		
	}
	
	
		
		
		
	
	</script>
</head>
<body>
<script>

/* 		window.onload=function(){
			
			
		}
 */
		
		function checkDown(){
		
		var userId=document.getElementById("userId");
		var idcheck = document.getElementById("idcheck");
		if(idcheck.value!="idCheckedOk")
			{
			alert("아이디를 체크해주세요.");
			return;
			}
		
	}
	</script>
	
	<form action="#" method="POST" name="joinForm">
		Id: <input type="text" name="userId" id="userId">
		
			<input type="button" value="아이디 체크 " onclick="idChecked()" >
			<input type="hidden" name="idCheck" id="idcheck" value="unChecked"><br>
		Pw: <input type="password" name="userPw"  ><br>
		nickname: <input type="text" name="userName"  ><br>
		
			<input type="button" onclick="joinOk()"value="회원가입 ">
		
		
	</form>
	<script>
	
	//회원가입 성공시 login.jsp
	//실패시 회원가입 처리
	//controller,commend,dao,결과가 성공1,실패 나머지
	
	var xhr2=new XMLHttpRequest();
	
	function joinOk(){
		
		var userId=document.getElementsByName("userId")[0];
		var userPw=document.getElementsByName("userPw")[0];
		var userName=document.getElementsByName("userName")[0];
		
		
		
		if (userId.value=="" || userId.value==null){
			alert("아이디 입력 오류");
			userId.focus();
			return false;
		}
		if (userPw.value=="" || userPw.value==null){
			alert("비밀번호 입력 오류");
			userPw.focus();
			return false;
		}
		if (userName.value=="" || userName.value==null){
			alert("이름 입력 오류");
			userName.focus();
			return false;
		}
		
		var url="joinOk.mo";
		var data="userId="+userId.value+"&userPw="+userPw.value+"&userName="+userName.value;
		
		xhr2.open("POST",url,true);
		xhr2.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
		xhr2.send(data);
		
		xhr2.onreadystatechange=function(){
			if(xhr2.readyState == 4 && xhr2.status == 200){
				var rs=xhr2.responseText;
				
				if(rs==1){
					alert("회원가입성공");
					location.href="login.jsp";
					return;
				}else{
					alert("회원가입실패");
					return;
				}
				
				
			}
			
			
		};
		

		
		
		
		
	}
	
	</script>
	
	

</body>
</html>
