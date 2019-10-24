<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="InfoServlet" method="post">

	<div>
		<label for="id">아이디</label>
		<input type="text" name="id" />
	</div>
	<div>
		<label for="name">이름</label>
		<input type="text" name="name" />
	</div>
	<div>
		<label for="gender">성별</label>
		<input type="radio" name="gender" value="남"/>남
		<input type="radio" name="gender" value="여"/>여
	</div>
	<div>
		<label for="grade">학년</label>
		<select name="grade" id="">
			<option value="1학년">1학년</option>
			<option value="2학년">2학년</option>
			<option value="3학년">3학년</option>
			<option value="4학년">4학년</option>
		
		</select>
	</div>
	<div>
		<label for="pet">좋아하는 애완동물</label>
		<input type="checkbox" name="pet" id="" value="강아지"/>강아지
		<input type="checkbox" name="pet" id="" value="고양이"/>고양이
		<input type="checkbox" name="pet" id="" value="햄스터"/>햄스터
		<input type="checkbox" name="pet" id="" value="토끼"/>토끼
	</div>
	<div>
		<button type="submit">보내기</button>
	
	</div>


</form>




</body>
</html>