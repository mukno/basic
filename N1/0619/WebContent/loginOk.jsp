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
<sql:query var="result" dataSource="${conName }">
	select * from member_mysql_1
	where userId='${param.userId }' and userPw='${param.userPw }'
</sql:query>

<c:out value="${result.rowCount }"/>
