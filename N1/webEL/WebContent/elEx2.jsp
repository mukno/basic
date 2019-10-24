<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	
 	pageContext.setAttribute("pageContext", "pageContext");
 	request.setAttribute("request", "request Scope");
 	session.setAttribute("session", "session Scope");
 	application.setAttribute("application", "application Scope");
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>

<%=pageContext.getAttribute("pageContext")%><br>
<%=request.getAttribute("request")%><br>
<%=session.getAttribute("session")%><br>
<%=application.getAttribute("application")%><br><br>

pageContext: ${pageScope.pageContext}<br>
request: ${requestScope.request}<br>
session: ${sessionScope.session}<br>
application: ${applicationScope.application}<br>


</body>
</html>