<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 바인딩 객체에 담은 내용은 return 되는 페이지에서 호출 가능 
	=>자동으로 request객체에 담고 forward시키는것
-->
	<h3>num1:${numVO.num1 }</h3>
	<h3>num2:${numVO.num2 }</h3>
<!-- request.parameter() 형태로 가져오는 데이터 경우
	값을 유지시켜주지 못함
 -->
	<h3>page:${page }</h3>

	<h3>num1:${vo.num1 }</h3>
	<h3>num2:${vo.num2 }</h3>
</body>
</html>