<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
//클라이언트->서버 (json)
	var json={
		"userId":"m1",
		"userPw":"111"
		}
	//json객체 문자열변환
	var jsonStr=JSON.stringify(json);
	
	console.log(typeof json);
	console.log(json);
	console.log(typeof jsonStr);
	console.log(jsonStr);
	
	//서버(문자열)->VIEW 문자열->객체
	var result="{
			result:[
				{'userId':'m1','userPw':'1111','userName':'s1'}
				{'userId':'m2','userPw':'112','userName':'s22'}
				]}";
	
	var rs=JSON.parse(result);
	console.log(typeof result);
	console.log(result);
	console.log(typeof rs);
	console.log(rs);
	
	
</script>

</body>
</html>