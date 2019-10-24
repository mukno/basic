<%@page import="java.util.Enumeration"%>
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
//한글깨짐처리
request.setCharacterEncoding("utf-8");

//네임이 하나
String userId=request.getParameter("userId");
String userPw=request.getParameter("userPw");
String userAge=request.getParameter("userAge");
String userGender=request.getParameter("userGender");
//네임이 다중
	String[] userHobbys=request.getParameterValues("userHobbys");
	String[] phone=request.getParameterValues("phone");
	

Enumeration en=request.getParameterNames();
while(en.hasMoreElements()){
	String name=en.nextElement().toString();
	out.print(name);
}


%>
아이디:<%=userId %><br>
비밀번호:<%=userPw %><br>
나이:<%=userId %><br>
성별:<%=userPw %><br>

<%
	if(userHobbys!=null){
		for(int i =0;i<userHobbys.length;i++){
			if(i==userHobbys.length-1){
				
			out.print(userHobbys[i]);
			break;
			}
			out.print(userHobbys[i]+",");
		}
		
	}

%>
<%
	if(phone!=null){
		for(int i =0;i<phone.length;i++){
			if(i==phone.length-1){
				
			out.print(phone[i]);
			break;
			}
			out.print(phone[i]+",");
		}
		
	}

%>


</body>
</html>