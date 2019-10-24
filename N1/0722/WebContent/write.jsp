<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value='/css/reset.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/header.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/write.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/footer.css'/>" media="all">

</head>
<body>



<c:import url="/header.jsp"></c:import>
<div id="write">
	<div id="writeContent">
		<div id="writeForm">
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
					<textarea name="bMemo" cols="40" rows="20"></textarea>
				</li>
				<li class="s3">
					<button >글작성 실행</button>
				</li>
			</ul>
		</div>
	</div>
</div>

<c:import url="/footer.jsp"></c:import>




</body>
</html>