<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/writeContent.css"/> 
<div id="bordWrite">		
	<table id="tWrite">
		<form action="writeOk.jsp" method="POST" name="writeForm">
			<tr>
				<th colspan="2"><h1>글작성</h1></th>
			</tr>
			<!-- no(auto_increment)는 자동으로 값이 설정 -->
			<tr>
				<td>아이디: </td>
				<%
					if(session.getAttribute("sessionId")!=null){
				%>						
				<td><%=session.getAttribute("sessionId")%><input type="hidden" name="userId" value="<%=session.getAttribute("sessionId")%>"></td>
				<%
					}else{
						%>
				<td><input type="text" name="userId"></td>						
						<%
					}
				
				%>
			</tr>
			<tr>
				<td>글제목:</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>글내용:</td>
				<td>
					<textarea rows="5" cols="25" name="content"></textarea>				
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글작성 ">	
				</td>
			</tr>
		</form>
	</table>		
</div>