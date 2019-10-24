<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/css/reset.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/footer.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/join.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/header.css'/>" media="all">

</head>
<body>
<c:import url="/header.jsp"></c:import>
<div id="join">
	<div id="joinContent">
		<div id="joinForm" class="round">
			<ul>
				<li class="s0" ><h1  class="round">로그인</h1></li>
				<li class="s1" >
					<span >아이디</span>
					<input type="text" name="userId"/>
				</li>
				<li class="s1">
					<span>비밀번호</span>
					<input type="password" name="userPw"/>
				</li>
				
				<li class="s3">
					<button onclick="login()">로그인 실행</button>
				</li>
			</ul>
		</div>
	</div>
</div>
<c:import url="/footer.jsp"></c:import>
<script>
	
	
	
	var xhr=new XMLHttpRequest;
	
	function login(){
		
		var userId=document.getElementsByName("userId")[0];
		var userPw=document.getElementsByName("userPw")[0];
		
		var url="login.mo";
		var data="userId="+userId.value+"&userPw="+userPw.value;
		
		xhr.open("POST",url,true);
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				var result=xhr.responseText;
				
				if(result==1)
					{
						alert("로그인 성공");
					}
				else{
					alert("로그인 실패");
				}
				
				
				
				
			}
			
			
		}
		xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
		xhr.send(data);
		
		
		
		
		
	} 



</script>





</body>
</html>