<%@page import="org.web.borddto.BordDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	//게시글 작성.. 로그인이 된 상태에서만 게시글 작성..
	/* if(session.getAttribute("sessionId")==null){		
		out.print("<script>");
		out.print("alert('로그인 후에 이용하세요');");
		out.print("location.href='login.jsp';");			
		out.print("</script>");		
	} */
%>   
<%
	ArrayList<BordDto> lists = 
	(ArrayList<BordDto>) request.getAttribute("lists");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="bordList" style="background:#9e9e9e;width:80%;text-align:center;padding:20px 0;margin:0 auto">
		<h1>게시글 목록</h1>
		<table border="1" style="margin:0 auto;width: 80%;background:#fff;" >		
			<tr>
				<th>아이디</th>
				<th>비빌번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>글보기</th>
			</tr>
			<%
				for (BordDto dto : lists) {
			%>
			<tr>
				<td class="t1"><%=dto.getUserId()%></td>
				<td><%=dto.getBordPw()%></td>
				<td class="t2"><%=dto.getTitle()%></td>
				<td class="t3"><%=dto.getContent()%></td>
				<td class="t4"><a href="bordView.bo?no=<%=dto.getNo()%>">게시글보기</a></td>
			</tr>
			<%
				}
			%>

		</table>


	</div>


</body>
</html>


















