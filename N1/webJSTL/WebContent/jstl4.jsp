<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conName"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="12345"
	url="jdbc:mysql://localhost:3306/javastudy?useSSL=false"
	/>
	
	
	
	처리결과 <c:out value="${result}"/><br>
	
	
	<sql:query var="result" dataSource="${conName }">
		select *from member_mysql_1 where userId=?
		<sql:param value="${param.userId }"/>
	</sql:query>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	
	
	
	
	
	<c:forEach var="result" items="${result.rows}">
		<tr>
			<td>${result.userId }</td>
			<td>${result.userPw }</td>
			<td>${result.userName }</td>
		</tr>
	</c:forEach>
	</table>
	
	


</body>
</html>