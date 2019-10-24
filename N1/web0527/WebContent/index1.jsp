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
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Weekly Coding Challenge #1 - Sign in/up Form</title>
  <script>

	function loginOk(){
		
		var loginForm=document.loginForm;
		
		alert("로그인 GO");
		
		loginForm.submit();//form의 정보를 서버에 전송...
		
	}

</script>
  <script>

	function joinOk(){
	
		console.log("joinOk함수 호출");
		
		//선택
		var joinForm=document.joinForm;//전체 form의 name;
		//userId
		//	document.joinForm.userId;// name값 userId;
		
		if(joinForm.idcheck.value=="unChecked"){
			
			alert("아이디 체크를 해주세요...");
			
			document.getElementById("idCheckOk").focus();
			
			return false;
		}
			alert("회원 가입 실행 ")
			
			joinForm.submit();// form의 정보를 서버에 전송...action="JOIN.do"
		}
		</script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Handlee|Josefin+Sans:300,600&amp;display=swap'>

      <link rel="stylesheet" href="css/style2.css">

  
</head>

<body>

  
<div class="container">
  <div class="card-wrap">
    <div class="card border-0 shadow card--welcome is-show" id="welcome">
      <div class="card-body">
        <h2 class="card-title">WELCOME</h2>
        <p>Welcome to the login page</p>
        <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">REGISTER</a><a class="btn btn-lg btn-login js-btn" data-target="login">LOGIN</a></div>
      </div>
    </div>
    <div class="card border-0 shadow card--register" id="register">
      <div class="card-body">
        <h2 class="card-title">Create Account</h2>
        <p class="card-text">Enter your personal details<br/>and start journey with us</p>
        <p class="badge-wrap"><a href="https://ko-kr.facebook.com/" target="_blank"class="badge"><i class="fab fa-facebook-f"></i></a><a href="https://www.google.co.kr/" target="_blank" class="badge"><i class="fab fa-google"></i></a><a href="https://twitter.com/" target="_blank" class="badge"><i class="fab fa-twitter"></i></a><a href="https://www.naver.com/" target="_blank" class="badge"><i class="fab fa-github"></i></a></p>
        <p>or use your email for registration</p>
        <form action="JOIN.do" method="POST" name="joinForm" id="frm" >
          <div class="form-group">
            <input class="form-control" type="text" placeholder="ID" value="<%=val1 %>" name="userId" required="required"/><input type="button" value="아이디체크" onclick="idChecked()" id="idCheckOk">  <br>	  			  
			  <input type="hidden" name="idcheck" value="<%=val2 %>">
          </div>
          <div class="form-group">
            <input class="form-control" type="Password" placeholder="Pw" name="userPw" required="required"/>
          </div>
          <div class="form-group">
            <input class="form-control" type="text" placeholder="name" name="userName" required="required"/>
          </div>
           <div class="form-group">
            <input class="form-control" type="text" placeholder="Age" name="userAge" required="required"/>
          </div>
          
          
          <button class="btn btn-lg" onclick="joinOk()">REGISTER</button>
        </form>
      </div>
      <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
    </div>
    <div class="card border-0 shadow card--login" id="login">
      <div class="card-body">
        <h2 class="card-title">Welcome Back!</h2>
        <p>To keep connected with us<br/>please login with your personal info</p>
        <p class="badge-wrap"><a href="https://ko-kr.facebook.com/" target="_blank" class="badge"><i class="fab fa-facebook-f"></i></a><a href="https://www.google.co.kr/" target="_blank" class="badge"><i class="fab fa-google"></i></a><a href="https://twitter.com/" target="_blank" class="badge"><i class="fab fa-twitter"></i></a><a href="https://www.naver.com/" target="_blank" class="badge"><i class="fab fa-github"></i></a></p>
        <p>or use your account</p>
        <form action="LOGIN.do" name="loginForm" method="POST" id="loginForm">
          <div class="form-group">
            <input class="form-control" type="text" placeholder="ID" name="userId" required="required"/>
          </div>
          <div class="form-group">
            <input class="form-control" type="password" placeholder="Password" name="userPw" required="required"/>
          </div>
          <p><a>Forgot your password?</a></p>
          <button class="btn btn-lg" onclick="loginOk()">LOGIN</button>
        </form>
      </div>
      <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
    </div>
  </div>
</div>
  <script>
	function idChecked(){
		
		var userId=document.joinForm.userId;// name이름  joinForm 아래 있는 userI
		
		alert("아이디체크 실행");
		
			// Controller 전송
		location.href="MemberIdChecked.do?userId="+userId.value;
		
	}

</script>	


    <script  src="js/index.js"></script>




</body>

</html>
