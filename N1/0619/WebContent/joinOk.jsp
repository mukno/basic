<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
	var="conName"
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/javastudy?userSSL=false"
	user="root"
	password="12345"
/>
<sql:update var="result" dataSource=${conName }>
	insert into member_mysql_1(userId,userPw,userName)
	values (${param.userId },${param.userPw },${param.userName })
</sql:update>

<c:choose>
	<c:when test="${result==1 }">
		<script>
			alert("회원 가입성공.. ");
			location.href="login.jssp";
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("회원 가입실패.. ");
			history.go(-1);
		</script>
	</c:otherwise>
	
</c:choose>
