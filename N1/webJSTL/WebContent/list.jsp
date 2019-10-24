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
	url="jdbc:mysql://localhost:3306/javaStudy?useSSL=false"
	/>
	
	<sql:query var="result" dataSource="${conName }">
		select *from member_mysql_1
	</sql:query>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	</table>
	
	
	
	
	<c:forEach var="result" items="${result}"><!-- 결과 다가져옴 -->
		<tr>
			<td>${result.rows.userId }</td><!-- 한 열만 가져옴, 한 열의 속성하나 가져옴 -->
			<td>${result.rows.userPw }</td><!-- 한 열만 가져옴, 한 열의 속성하나 가져옴 -->
			<td>${result.rows.userName }</td><!-- 한 열만 가져옴, 한 열의 속성하나 가져옴 -->
		</tr>
	</c:forEach>
	
	


</body>
</html>