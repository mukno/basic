<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>

<link rel="stylesheet" href="<c:url value='/css/reset.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/header.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/bordList2.css'/>" media="all">
</head>
<body>
	
<c:import url="/header.jsp"></c:import>

	<div id="bordList2">
		<div id="bordList2Content">
			<table>
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
							<fmt:formatDate value="${list.bTime }" pattern="yyyy-MM-dd hh:mm:ss"/>
						</td>
						<td>
							<a href="bordView.bo?mId=${list.no }" class='c1'>내용보기</a>
						</td>
					</tr>
					
					
					
					</c:forEach>
					
				</tbody>
				<tr>
					<td colspan="11" class="t6">
						<a href="write.jsp" class="r1">글쓰기</a>
					</td>
				</tr>
					<tr>
					<td align="center" colspan="10">
						<c:if test="${pagingList.total==0 }">
						<table>
							<tr align="center" bgcolor="#fff" height="30">
								<td colspan="6">등록된 글이 없습니다.</td>
							</tr>
						</table>
						</c:if>
						<c:if test="${pagingList.pNum>pagingList.block }">
							<a href="bordPaging.bo?pNum=1">◀◀</a>
							<a href="bordPaging.bo?pNum=${pagingList.startPage-1 }">◀</a>
						</c:if>
						<c:forEach var="i" begin="${pagingList.startPage }" end="${pagingList.endPage }">
						
							<c:if test="${pagingList.pNum==i }">
								<span style="font.weight:bold">(${i })</span>
								
							</c:if>
							<c:if test="${pagingList.pNum!=i }">
								<a href="bordPaging.bo?pNum=${i }">${i }</a>
								</c:if>
								</c:forEach>
								<c:if test="${pagingList.endPage <pagingList.allPage }">
									<a href="bordPaging.bo?pNum=${pagingList.endPage+1 }">▶</a>
									<a href="bordPaging.bo?pNum=${pagingList.allPage }">▶▶</a>
									
								
								</c:if>
								
								
							
						
						
						
						</td>
				</tr>

			</table>

		</div>

	</div>

</body>
</html>