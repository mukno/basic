<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=config.getServletContext().getInitParameter("url")
%><br>
초기화 파라미터: ${initParam.url}<br>
초기화 피라미터: ${initParam.user}<br>
초기화 피라미터: ${initParam.password}<br>

userId: <%=request.getParameter("userId") %>,
userPw: <%=request.getParameter("usePw") %><br>

<h3>form의 파라미터</h3>
userId:${param.userId},userPw:${param.userPw}<!-- EL표현법 -->

<h3>form의 여러개 name같아서 배열인 파라미터</h3>
취미: <%=request.getParameterValues("hobbys") %><br>
취미: ${paramValues.hobbys[0]}

<h3>요청URL</h3>
URL: <%=request.getRequestURI() %><br>
URL: ${pageContext.request.requestURI}

</body>
</html>