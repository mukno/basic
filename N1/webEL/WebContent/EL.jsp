<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>표현식</th>
			<th>EL Expression</th>
			<th>결과</th>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}}</td>
			<td>${10}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10+5}</td>
			<td>${10+5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10-5}</td>
			<td>${10-5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10*5}</td>
			<td>${10*5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10/5}</td>
			<td>${10/5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10 eq 5}</td>
			<td>${10 eq 5}</td>
		</tr>
		
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10 lt 5}</td>
			<td>${10 lt 5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10 gt 5}</td>
			<td>${10 gt 5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10 le 5}</td>
			<td>${10 le 5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}10 ge 5 }</td>
			<td>${10 ge 5}</td>
		</tr>
		<tr>
			<td>표현[출력]</td>
			<td>${'${'}true or false}</td>
			<td>${ture or ture}</td>
		</tr>
	
	
	
	</table>

</body>
</html>