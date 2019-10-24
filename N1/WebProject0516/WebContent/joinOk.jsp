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
//자바코드
request.setCharacterEncoding("utf-8");
response.setContentType("text/html;charset=utf-8");
String userId=request.getParameter("userId");
String userPw=request.getParameter("userPw");
String userGender=request.getParameter("userGender");
String geust=request.getParameter("geust");

String[] hobbysArr=request.getParameterValues("hobbys");
String[] sArr=request.getParameterValues("phone");
%>

<!-- 표현식 -->
아이디: <%=userId %>,비밀번호:<%=request.getParameter("userPw") %>, 성별:<%=userGender %><br>
방명록:<%=geust %>
<%
	String hobbyStr="";
	String phoneStr="";
	
	for(String stra:hobbysArr){
		hobbyStr+=stra+",";
	}
	
	hobbyStr=hobbyStr.substring(0,hobbyStr.length()-1);
	out.print("취미: "+hobbyStr);//printWriter out//JSP 내장 객체
	


%>

</body>
</html>