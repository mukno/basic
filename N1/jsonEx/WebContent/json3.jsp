<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="list"></div>
<script>
	var members={
			"result":[
				{"userId" : "m1", "userPw": "1111", "userName" : "s1"},
				{"userId" : "m1", "userPw": "1111", "userName" : "s1"},
				{"userId" : "m1", "userPw": "1111", "userName" : "s1"},
				{"userId" : "m1", "userPw": "1111", "userName" : "s1"},
				
				]
	};
	
	var list =document.getElementById("list");
	var rs="userId:"+members.result[0].usreId+
	       "userPw:"+members.result[0].userPw+
	       "userName:"+members.result[0].userName+
	var txtNode=document.createTextNode(rs);
	       list.appendChild(txtNode);
	

</script>

</body>
</html>