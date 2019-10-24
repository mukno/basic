<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="login">
	<table id="tLogin">
		<form action="loginOk.jsp" method="POST" name="loginForm">
			<tr>
				<th><h1>로그인</h1></th>
			</tr>
			<tr>
				<td>아이디: <input type="text" name="userId"></td>
				<td>비빌번호: <input type="text" name="userPw"></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인 ">	</td>
			</tr>
		</form>
	</table>			
</div>