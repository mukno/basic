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
	<sql:query var="rs" dataSource="jdbc/mysqlDB">
	select * from member
	</sql:query>
	
	<!-- 필드명 가져오기 -->
	<c:forEach var="columnName" items="${rs.columnNames }">
		${columnName }
	</c:forEach>
	<br>
	<!-- 필드값 가져오기 -->
	<c:forEach var="row" items="${rs.rowsByIndex}">
	
		<c:forEach var="col" items="${row }">
			${col }
		</c:forEach>
	<br>
	</c:forEach>
	

</body>
</html>