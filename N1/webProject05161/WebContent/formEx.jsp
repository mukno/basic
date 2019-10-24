<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String val1="";
    if(request.getParameter("userId")!=null){
    	val1=request.getParameter("userId");
    }
    String val2="unChecked";
    if(request.getParameter("OkChecked")!=null){
    	val2=request.getParameter("OkChecked");
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form정리</title>
<script>
	function joinOK(){
		
		console.log("joinOK");//팝업창
		//선택
		var joinForm=document.joinFrom; //화면에 보이는 모든 객체 전체from
		//userId
		//document.joinFrom.userId;//name값이 userId;
		
		//아이디값이 없으면 회원가입 절차를 중지//from의 input의 value
		if(joinFrom.userId.value==null||joinFrom.userId.value==""){//form의 input의 value
			alert("아이디 입력오류..다시 입력해주세요!");
			return false; //joinOk함수 종료
		}
		//이름
		//document.joinFrom.useName;
		if(joinFrom.userName.value==null||joinFrom.userPw.value==""){
			
			alert("이름 입력오류..");
			return false;
		}
		
		//나이
		if(joinFrom.userAge.value==null||joinFrom.userAge.value==""){
			
			alert("나이 입력오류..");
			return false;
		}

		alert("회원 가입 실행");
		
		joinFrom.submit();//from의 정보를 서버에전송 action="JOIN.do"
		
		
		
	}



</script>


</head>
<body>

	<%@include file ="header.jsp" %>
	
<div style="background:#9e9e9e;width:80%;padding:20px 0;margin:0 auto">
	<form action="JOIN.do" method="POST" name="joinFrom" id="frm" enctype="">

		아이디: <input type="text" name="userId" value="<%=val1 %>" id="userId" size="10" maxlength="10">
			  <input type="button" value="아이디체크" onclick="idchecked()" id="idCheckOk">  <br>
			  <input type="hidden" name ="idcheck" value="unChecked" value="<%=val2 %>" >
		비빌번호: <input type="password" name="userPw" id="userPw"  size="10" maxlength="10"><br>		
		이름:<input type="text" name="userName" id="userName"><br>
		나이:<input type="text"name="userAge" id="userAge"><br>
		
		<input type="reset" value="초기화">
		<input type="button" onclick="joinOK()"value="회원 가입">
			<!-- 버튼클릭하면 joinok함수 호출 -->
	</form>

</div>
<script>

	function idchecked(){
		var userId=document.joinForm.userId;//name이름 joinForm 아래있는 userId
		
		if(userId==null||userId==""){
			alert("아이디값 오류..다시입력갛세요.")
			userId.focus();
			return false;
			
		}
		
		//controller전송
		
		location.href="MemberIdChecked.do?userId="+userId.value;
	}


</script>


</body>
</html>