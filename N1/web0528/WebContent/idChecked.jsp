<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 
 String rs=(String)request.getAttribute("rs");
 String userId=(String)	request.getAttribute("userId");
 String OkChecked=(String)request.getAttribute("OkChecked");
 
 %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if(rs.equals("1")){
	%>
	<script type="text/javascript">
		alert("중복아이디 입니다.");
		
	</script>
	<%	
	}else if(rs.equals("0")){
		%>
	<script>
		alert("사용할 수 있는 아이디 입니다.");
		location.href="index1.jsp?data-target='register'&userId=<%=userId%>&OkChecked=<%=OkChecked%>";
	</script>	
		
		<%
	}
%>

</body>
</html>