<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<span id="txt"></span>
<script>
	var jsonArr={
			"hobbys":["영화","축구","여행"]
			
	};

	
	console.log(jsonArr.hobbys[0]);
	//console.log(jsonArr.hobbys["여행"]); 연관배열
	
	for(var i=0;i<jsonArr.hobbys.lenght;i++){
		document.getElementById("txt").document.wirte(jsonArr.hobbys[i]+"<br>");
		
	}
</script>


</body>
</html>