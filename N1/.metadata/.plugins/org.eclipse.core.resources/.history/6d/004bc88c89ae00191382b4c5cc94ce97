<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header">
	<div id="headerContent">
	<div id="headerTop">
		<h1>JAVAPROJECT</h1>
	</div>
		<ul>
	<c:choose>
	<c:when test="${empty sessionScope.sessionId }">
			<li><a href="index.jsp">HOME</a></li>
			<li><a href="login.jsp">login</a></li>
			<li><a href="join.jsp">join</a></li>
			<li><a href="bordList.jsp">bordList</a></li>
			<li><a href="bordPaging.bo">paging</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="index.jsp">HOME</a></li>
			<li><a href="logOut.mo">logOut</a></li>
			<li><a href="write.jsp">write</a></li>
			<li><a href="bordPaging.bo">paging</a></li>
			<li><a href="bordList.jsp">bordList</a></li>
		</c:otherwise>

		</c:choose>
		</ul>
	</div>
</div>
