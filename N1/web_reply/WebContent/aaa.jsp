<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<button type="button" id="btn1">button1</button>
<button type="button" class="btn2" onclick="func2()">button2</button>
<button type="button" class="btn2" >button3</button>
<button type="button" name="btn" >button4</button>
<br>
검색어입력: <input type="text" onkeyUp="func3()" name="search">

<script>
//아이디 선택자
	var btn1=document.getElementById("btn1");
//클래스 선택자(배열)
	var btn21=document.getElementsByClassName("btn2")[0];
	var btn22=document.getElementsByClassName("btn2")[1];
//태그 선택자(배열)
	var btn3=document.getElementsByTagName("button")[2];
//name선택자(배열)
	var btnName=document.getElementsByName("btn")[0];
	
	
btnName.onclick=function(){
	alert("btnName클릭");
}	
	
//이벤트 click(마우스 땟을떄) addEventListener 클릭 이벤트를 발생시켜라
	btn1.addEventListener("click",func1);
	
	function func1(){
		
		alert("btn1클릭이벤트");
	}
	function func2(){
		alert("btn2클릭이벤트");
		
	}
	
	var num=0;
	function func3(){
		console.log("btn3키업이벤트: "+(num++));
		
	}
	
	var func4=function(){
		
		
		
	}
	
	
	
	
	

</script>


</body>
</html>