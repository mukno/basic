<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="join">		
	<table id="tJoin">
		<form action="joinOk.jsp" method="POST" name="joinForm">
			<tr>
				<th><h1>회원 가입</h1></th>
			</tr>
			<tr>
				<td>아이디: <input type="text" name="useId"></td>
				<td>비빌번호: <input type="text" name="usePw"></td>
				<td>이름: <input type="text" name="useName"></td>
				<td>글번호: <input type="text" name="no"></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원가입 ">	</td>
			</tr>
		</form>
	</table>		
</div>