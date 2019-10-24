<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<c:url value='/css/reset.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/header.css'/>" media="all">
<link rel="stylesheet" href="<c:url value='/css/bordList.css'/>" media="all">

</head>
<body>
<c:import url="/header.jsp"></c:import>
<div id="bordList">
	<div id="bordListContent">
		<div class="bordItems">
			<h1>SHOPING 2019</h1>
			<div class="shopContent">
			<ul>
				<li class="con">
				
					<div class="cSon">
					
						<div id="Ajaximg">
						<!--  <img src="img/s${status.index } " alt=""></img>-->
						
						</div>
						<p>
							<span class="t"></span>		
							<span class="coin"></span>		
							<span class="s"></span>		
						</p>				
					
					
					</div>
				
				
				
				</li>
			</ul>
			
			</div>
		
		
		
		</div>


	</div>

</div>

<script>
window.onload=function(){
	bordView();
}

	function bordView(){
		var xhr=new XMLHttpRequest;
		var url="bordList.bo";
		xhr.open("GET",url,true);
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				
				var result=JSON.parse(xhr.responseText);
				//var result=JSON.pares(xhr.responseText);
				//var result=eval('('+xhr.responseText+')'); json화
				console.log(result);
				var resultlen=Object.keys(result.BordView).length;
				
				var rs="";
				for(var i=0;i<resultlen;i++){
					rs+="<tr>";
					rs+="<img src='img/s"+result.BordView[i].no+".jpg' alt=''>";
					
					}
				var Ajaximg=document.getElementById("Ajaximg");
				Ajaximg.innerHTML=rs;
				
				
				
			}
			
			
		};
		xhr.send();
		
		
		
		
	}


</script>
	

</body>
</html>