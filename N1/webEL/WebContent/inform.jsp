<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="eLResultOk.jsp" method="POST">
		Id: <input type="text" name="userId"><br>
		Pw: <input type="text" name="userPw"><br>
		취미:
		<input type="checkbox" name="hobbys" value="여행">여행
		<input type="checkbox" name="hobbys" value="영화감상">영화감상
		<input type="checkbox" name="hobbys" value="독서">독서
		<input type="checkbox" name="hobbys" value="게임">게임
		<input type="checkbox" name="hobbys" value="축구">축구<br>
		<input type="submit" value="EL실습">
		
		
	
	</form>

</body>
</html>