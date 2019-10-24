<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/css/reset.css'/>" media="all">

</head>
<body>
<c:import url="header.jsp"/>
<div id="write">
	<div id="writeContent">
		<div id="wirtefrom">
			<ul>
				<li class="s0"><h1>게시글 작성</h1></li>
				<li class="s1">
					<span>아이디</span>
					<input type="text" name="userId"/>
				</li>
				<li class="s1">
					<span>닉네임</span>
					<input type="text" name="Nickname"/>
				</li>
				<li class="s1">
					<span>글비밀번호</span>
					<input type="text" name="bPw"/>
				</li>
				<li class="s1">
					<span>글제목</span>
					<input type="text" name="bTitle"/>
				</li>
				<li class="s2">
					<span>글내용</span>
					<textarea name="bMemo" cols="30" rows="30"></textarea>
				</li>
			</ul>
		</div>
	</div>
</div>
</body>
</html>