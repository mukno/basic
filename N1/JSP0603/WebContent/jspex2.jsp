<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

클라이언트IP<%=request.getRemoteAddr() %><br>
요청정보길이:<%=request.getContentLength() %><br>
요청정보인코딩:<%=request.getCharacterEncoding() %><br>
요청정보타입:<%=request.getContentType() %><br>
요청정보:<%=request.getRequestURI() %><br>
컨텍스트 경로:<%=request.getContextPath() %><br>
서버 이름:<%=request.getServerName() %><br>



</body>
</html>