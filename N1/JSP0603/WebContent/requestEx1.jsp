<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="request1Rs.jsp" method="post">
	
		아이디:<input type="text" name="userId"><br>
		비밀번호:<input type="password" name="userPw"><br>
		나이:<input type="text" name="userAge"><br>
		성별:<input type="radio" name="userGender" value="남자">남자<br>
		    <input type="radio" name="userGender" value="여자">여자<br>
		    
		취미:<input type="checkbox" name="userHobbys" value="등산">등산<br>
		<input type="checkbox" name="userHobbys" value="여행">여행<br>
		<input type="checkbox" name="userHobbys" value="바둑">바둑<br>
		<input type="checkbox" name="userHobbys" value="영화감상">영화감상<br>
		<input type="checkbox" name="userHobbys" value="게임">게임<br>
		    
		    전화번호:<select name="phone">
		    		<option value="010">010</option>
		    		<option value="011">011</option>
		    		<option value="012">012</option>
		    </select>

			<input type="text" name="phone">-		    
			<input type="text" name="phone"><br>
					    
		    
		    
		    
			<input type="submit" value="전송">
			
		
	
	
	
	
	
	</form>


</body>
</html>