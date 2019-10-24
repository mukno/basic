<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies =request.getCookies();
if(cookies !=null)
{
	for(int i=0; i<cookies.length; i++){
		if(!cookies[i].getValue().equals("root")){
			out.print("<script>");
			out.print("alert('로그인 후 이용해주세요');");
			
			
			out.print("location.href=('login.jsp');");
			out.print("</script>");
			
			
			
		}
	}
	
	
	
	
}

%>


</body>
</html>