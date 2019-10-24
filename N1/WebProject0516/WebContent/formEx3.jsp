<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 정리</title>
</head>
<body>

	<form action="contorller.jsp" method="post" id="frm">
		아이디:<input type="text" name="userId" id="userId" size="10" maxlength="10"><input type="button" value="아이디체크" id="idCheckOK"><br>
		비밀번호:<input type="password" name="userPw" id="userPw"><br>
		성별:<input type="radio" name="userGender" value="남자" checked>남자
		 	<input type="radio" name="userGender" value="여자">여자<br>
		방명록작성<br>
		<textarea rows="10" cols="30" name="geust"></textarea><br>
		취미<br>
		<input type="checkbox" name="hobbys" value="등신" class="hobbys" checked>등산
		<input type="checkbox" name="hobbys" value="게임"class="hobbys">게임
		<input type="checkbox" name="hobbys" value="여행"class="hobbys">여행
		<input type="checkbox" name="hobbys" value="영화감상"class="hobbys">영화감상<br>
		전화번호: <select name="phone">
					<option value=""> 전화번호선택 </option>
					<option value="010"> 010 </option>
					<option value="011"> 011 </option>
					<option value="015"> 015 </option>
					<option value="017"> 017 </option>
					<option value="019"> 019 </option>
				
		
				</select>
				<input type="text" name="phone" size="4" maxlength="4">-
				<input type="text" name="phone" size="4" maxlength="4"><br>
			<input type="reset" value="초기화">
			<input type="submit" value="회원가입">
			
	
	
	
	</form>
	
	
	
	
</body>
</html>