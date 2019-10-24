<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="bodyload()">
	<form> 
		검색: <input type="text" name="search" onkeyUp="searchf()" id="search"><br>
		click: <input type="button" name="btn1" onclick="btn1f()" value="btn1"><br>
		mousedwon: <input type="button"name="btn2" onmousedown="btn2f()" value="btn2"><br>
		focus: <input type="text" name="focus1" onfocus="focusf()" onblur="blurf()"><br>
		
		전화번호:<select name="phone" id="phone" onchange="phoneSelect()">
					<option value="010">010</option>
					<option value="011">011</option>
					<option value="012">012</option>
				</select>
		
		<button id="b1" tpye="button" onclick="b1f()">BTN1</button>
		<button id="b2" tpye="button" onclick="b2f()">BTN2</button>
		<button id="b3" tpye="button" onclick="b3f()">BTN3</button>
		
	</form>
	<script>
	
	function b1f(){
		alert("b1f");
	}
	var b2=document.getElementById("b2");
	b2.onclick=function(){
		alert("b2f");
	}
	var b3=document.getElementById("b3");
	b3.addEventListener("click",b3f);
	function b3f(){
		alert("b3f");
	}
	
	function phoneSelect(){
		var phone=document.getElementById("phone");
		var phoneVal=phone.options[phone.selectedIndex].value;
		console.log(phoneVal);
		
	}
	function focusf(){
		
		
		
	}
	
function blurf(){
		
		alert("blur 이벤트");
		
	}
	
	
	function btn1f(){
		alert("click 이벤트");
	}
	function btn2f(){
		
		alert("mosedown 이벤트");
	}
	
	function bodyload(){
		
		
		alert("ㅇㅇㅇ");
	}
	
	function searchf(){
		
		var search=document.getElementsByName("search")[0];
		
		console.log(search.value);
		
	}
	
	</script>


</body>
</html>