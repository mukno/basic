<%@page import="org.web.borddto.BordDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
<link rel="stylesheet" href="<c:url value='/css/reset.css' />"
	media="all" />
</head>
<body>
	<div id="list">
		<div id="listContent">
			<table border="1">
				<tr>
					<th>닉네임</th>
					<th>제목</th>
					<th>내용</th>
					<th>날짜</th>
					<th>수정</th>
				</tr>
				<tbody id="tb">
					<tr>
						<td>${dto.bNickname }</td>
						<td id="t1">${dto.bTitle }</td>
						<td>${dto.bMemo }</td>
						<td><fmt:formatDate value="${dto.bTime }"
								pattern="yyyy-MM-dd hh:mm:ss" /></td>
						<td><a href="boardUpteView.bo?mId=${dto.no }" class='c1'>수정하기</a>
						<td><a href="boarDelete.jsp?mId=${dto.no }" class='c1'>삭제하기</a>
						</td>
					</tr>

				</tbody>
				<tr>
					<td colspan="11" class="t6"><a href="bordList.bo" class="r1">목록</a>
					</td>
				</tr>


			</table>

		</div>

	</div>

</body>
</html>