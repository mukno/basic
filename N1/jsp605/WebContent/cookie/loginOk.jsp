<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String userId,userPw; %>
<%

	userId=request.getParameter("userId");
	userPw=request.getParameter("userPw");
	
	if(userId.equals("root") && userPw.equals("12345")){
		//로그인 정보가 일치하면
		//쿠키객체를 생성
		Cookie cookie =new Cookie("userId",userId);
		
		cookie.setMaxAge(60);//쿠키 유지시간
		response.addCookie(cookie);//response객체에 추가
		response.sendRedirect("welcome.jsp");//제어권넘기고 이동
		
		
		
	}else{
		response.sendRedirect("login.jsp");
	}




%>



</body>
</html>