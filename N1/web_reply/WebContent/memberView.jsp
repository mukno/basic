<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="memberView">
	
	<form>
	아이디: <input type="text" name="userId" value="${param.userId }"><br>
	비밀번호: <input type="text" name="userPw" value=""><br>
	이름: <input type="text" name="userName" value=""><br>
	
	</form>
	
	
	검색아이디: <input type="text" name="userId" value="">
	<input type="button" value="검색 " onclick="ajaxMemberView2()"><br>
	<table border="1">
	<thead>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	</thead>
	<tbody id="tBody">
	
	</tbody>
	</table>																				
																				
																																
																				
																							
	</div>										
	
	
	<script>
	window.onload=function(){
		ajaxMemberView();
	}
	
		var xhr=new XMLHttpRequest();
		
		function ajaxMemberView(){
			var userId=document.getElementsByName("userId")[0];
			
			var data="userId="+userId.value;
			var url="MemberView.mo";
			
			xhr.open("POST",url,true);
			xhr.onreadystatechange=ajaxView;
			
			xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
			xhr.send(data);
			
		}
		
		function ajaxView(){
			if(xhr.readyState==4 && xhr.status==200){
				var rs=JSON.parse(xhr.responseText); //문자열>>객체
				//var rs=eval('('+xhr.responseText+')'); 문자열>>객체 구버전 변환방식인데 호환안될수도 있음
				var userPw=document.getElementsByName("userPw")[0];
				var userName=document.getElementsByName("userName")[0];
				
				userPw.value=rs.userPw;
				userName.value=rs.userName;
				
			}
			
			
		}
		
		var xhr2=new XMLHttpRequest();
		
		function ajaxMemberView2(){
			var userId2=document.getElementsByName("userId")[1];
			
			var data2="userId="+userId2.value;
			var url2="MemberView.mo";
			
			xhr2.open("POST",url2,true);
			xhr2.onreadystatechange=ajaxView2;
			
			xhr2.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
			xhr2.send(data2);
		}
			
		
		
		function ajaxView2(){
			if(xhr2.readyState==4 && xhr2.status==200){
				var result=JSON.parse(xhr2.responseText); //문자열>>객체
				//var rs=eval('('+xhr.responseText+')'); 문자열>>객체 구버전 변환방식인데 호환안될수도 있음
				var tBody=document.getElementById("tBody");
				console.log(result.userId);
				if(result.userId=="null"){
					alert("없는 이용자입니다.");
				}else{
				var rs="";
					rs+="<tr>";
					rs+="<td>";
					rs+=result.userId;
					rs+="</td>";
					rs+="<td>";
					rs+=result.userPw;
					rs+="</td>";
					rs+="<td>";
					rs+=result.userName;
					rs+="</td>";
					rs+="</tr>";
				tBody.innerHTML=rs;
				}
				
				
			}
			
			
		}
		
	</script>
	

</body>
</html>