<%@page import="org.web.borddto.PagingClass"%>
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
					<th>보기</th>
				</tr>
				<tbody id="tb">
					<c:forEach var="list" items="${requestScope.list }">
						<tr>
							<td>${list.bNickname }</td>
							<td id="t1">${list.bTitle }</td>
							<td>${list.bMemo }</td>
							<td>
								<fmt:formatDate value="${list.bTime }" 
										pattern="yyyy-MM-dd hh:mm:ss" />
							</td>
							<td>
								<a href="bordView.bo?no=${list.no }" class='c1'>내용보기</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
				<tr>
					<td colspan="11" class="t6">
						<a href="write.jsp" class="r1">글쓰기</a>
					</td>
				</tr>
				
				
			</table>

		</div>

	</div>

</body>
</html>