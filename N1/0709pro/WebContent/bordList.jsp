<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.abso{
position:absolute; 
left:546px;
}

</style>
</head>
<body>
<c:import url="header.jsp"/>
<table border=1>
<thead>
	
	<tr>
		<th>mId</th>
		<th>mGroup</th>
		<th>mIndent</th>
		<th>step</th>
		<th>hit</th>
		<th>nickname</th>
		<th>userId</th>
		<th>mTime</th>
		<th>글보기</th>
	</tr>
	</thead>
	<tbody id="tbd">
	
	</tbody>

</table>
<input type="button" class="abso" onclick="writego()" value="글쓰기">
	

<script>
function writego(){
	location.href="write.jsp";
}

window.onload=function(){
	BordList();
	
	
	
}
	var xhr=new XMLHttpRequest();
	
	function BordList(){
		var uri="BordList.bo";
		xhr.open("GET",uri);
		xhr.onreadystatechange=function(){
			if(xhr.status==200 && xhr.readyState==4){
				var result=JSON.parse(xhr.responseText);
				var rs="";
				var resultlen=Object.keys(result.BordView).length;
				console.log(resultlen);
				console.log(result);
				console.log(result.BordView);
				for(var i=0;i<resultlen;i++){
				rs+="<tr>";
				rs+="<td>"+result.BordView[i].mId+"</td>";
				rs+="<td>"+result.BordView[i].mGroup+"</td>";
				rs+="<td>"+result.BordView[i].mIndent+"</td>";
				rs+="<td>"+result.BordView[i].step+"</td>";
				rs+="<td>"+result.BordView[i].hit+"</td>";
				rs+="<td>"+result.BordView[i].nickname+"</td>";
				rs+="<td>"+result.BordView[i].userId+"</td>";
				rs+="<td>"+result.BordView[i].mTime+"</td>";
				rs+="<td><a href='bordListView.jsp?mId="+result.BordView[i].mId+"&userId="+result.BordView[i].userId+"'>보기</a></td>";
				rs+="</tr>";
				}
				var tbd=document.getElementById("tbd");
				tbd.innerHTML=rs;
				
			}
			
		};
		xhr.send();
		
		
		
		
	}


</script>

</body>
</html>