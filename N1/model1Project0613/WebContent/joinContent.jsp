<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/joinContent.css"/> 

<div id="join">		
	<table id="tJoin">
		<form action="joinOk.jsp" method="POST" name="joinForm">
			<tr>
				<th colspan="2"><h1>회원 가입</h1></th>
			</tr>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>비빌번호:</td>
				<td><input type="password" name="userPw"></td>
			</tr>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입 ">	</td>
			</tr>
		</form>
	</table>		
</div>