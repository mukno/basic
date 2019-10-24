<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="header">
	<div id="headerContent">
		<nav>
			<ul>
			<c:choose>
				<c:when test="${not empty sessionId }">
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="bordList.bo">게시판</a></li>
					<li><a href="joinView.mo">회원수정</a></li>				
					<li><a href="logout.mo">로그아웃</a></li>
				</c:when>
				<c:otherwise>				
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="bordList.bo">게시판</a></li>
					<li><a href="login.jsp">로그인</a></li>				
					<li><a href="join.jsp">회원가입</a></li>				
				</c:otherwise>
			</c:choose>
			
			</ul>
		</nav>
	</div>
</div>