<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
<script>
	var con=confirm("로그인 후 접속 가능합니다.");
	if(con==true){
		
		location.href="login.jsp";
	}else{
		history.go(-1);
	}
</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/bordView.css" />



</head>
<body>
<c:import url="header.jsp"/>
<div id="write">
	<form>
		글번호: <span id="mId" >${param.mId }</span><br>
		현재시간: <span id="mTime"></span><br>
		현재 그룹:<span id="mGroup"></span><br>
		조회:<span id="hit"></span><br>
		step:<span id="step"></span><br>
		mIndent:<span id="mIndent"></span><br>
		아이디: <input type="text" name="userId" disabled/><br>
		닉네임: <input type="text" name="nickname" disabled/><br>
		글 비밀번호: <input type="password" name="mPw" disabled/><br>
		글 제목: <input type="text" name="title" disabled/><br>
		글 내용: <br>
		<textarea name="memo" cols="30" rows="30" disabled></textarea><Br>
		
		<input type="button" onclick="bordListGo()" value="전체 글 목록"/>
		<input type="button" onclick="bordWriteGO()" value="글 쓰기"/>
		<c:choose>
			<c:when test="${sessionScope.sessionId eq param.userId }">
		<input type="button" onclick="bordDeleteView(event)" value="글 삭제"/>
		<input type="button" onclick="ajaxUpdate(event)" value="글 수정"/>
		<input type="button" onclick="replyGo()" value="덧글 달기">
			</c:when>
		
		</c:choose>
		
		
	</form>

</div>

<div id="deleteView">
	<div id="deleteCon">
			<span id="close" ><a onclick="closeFn()">X</a></span>
		<table border="1">
			<tr>
				<th>글삭제</th>
			</tr>
			<tr>
				<td>글고유번호</td>
				<td>${param.mId}</td>
			</tr>
			<tr>
				<td>글아이디</td>
				<td><input type="text" id="bId"/></td>
			</tr>
			<tr>
				<td>글비밀번호</td>
				<td><input type="password" id="bPw"/></td>
			</tr>
		
		</table>
		<div>
				<input id="checkbutton" type="button" onclick="deleteCheck()" value="글삭제"/>
	</div>
	
	
	</div>


</div>




<script>

		var mId=document.getElementById("mId").innerHTML;
var deleteView=document.getElementById("deleteView");
function bordDeleteView(event){
	event.preventDefault();
	deleteView.style.display="block";
	
}
function closeFn(){
	deleteView.style.display="none";
	
}



function deleteCheck(){
		var deletecheck=confirm("게시글을 삭제 하시겠습니까?");
		
		if(deletecheck==true){
			bordDelete();	
		
		}else{
			return false;
		}
		
	
}



function bordDelete(){
	var bId=document.getElementById("bId");
	var bPw=document.getElementById("bPw");
	var data="mId="+mId+"&userId="+bId.value+"&mPw="+bPw.value+"";
	
	var url="BordDelete.bo";
	xhr.open("POST",url,true);
	xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
		var rs=xhr.responseText;
		
		if(rs==1){
			alert("삭제 되었습니다.");
				location.href="bordList.jsp";
				
		
		}else{
			alert("에러");
		}
		
	}
	}
	xhr.send(data);
	
	
}

function bordWriteGO(){
	location.href="write.jsp";
	
}

function bordListGo(){
	location.href="bordList.jsp";
	
}


function updateGo(){
	var data="mId="+mId+"&userId="+userId.value+"&";
	data+="nickname="+nickname.value+"&mPw="+mPw.value+"&";
	data+="title="+title.value+"&memo="+memo.value;
	
	var url="BordUpdate.bo";
	xhr.open("POST",url,true);
	xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
		var rs=xhr.responseText;
		
		if(rs==1){
			alert("수정완료");
			location.href="bordListView.jsp?mId="+mId+"&userId="+userId.value;
			
		}else{
			alert("에러");
		}
		
	}
	}
	xhr.send(data);
	
	
}

var key=0;
function ajaxUpdate(event){
	
	event.preventDefault();
	if(key==0){
		nickname.disabled=false;
		mPw.disabled=false;
		title.disabled=false;
		memo.disabled=false;
		
		key=1;
		return;
	}
	if(key==1){
		updateGo();
		key=0;
		return;
		
	}
}

window.onload=function(){
	ajaxView();
}


function replyGo(){
	location.href="replyView.jsp?mId="+${param.mId};
}


var xhr=new XMLHttpRequest();

		var mGroup=document.getElementById("mGroup");
		var mTime=document.getElementById("mTime");
		var hit=document.getElementById("hit");
		var step=document.getElementById("step");
		var mIndent=document.getElementById("mIndent");
		var nickname=document.getElementsByName("nickname")[0];
		var userId=document.getElementsByName("userId")[0];
		var mPw=document.getElementsByName("mPw")[0];
		var title=document.getElementsByName("title")[0];
		var memo=document.getElementsByName("memo")[0];
	function ajaxView(){
		
		
		var data="mId="+mId;
		var url="BordView.bo";
		
		xhr.open("POST",url,true);
		xhr.onreadystatechange=function(){
			if(xhr.status==200 && xhr.readyState==4){
				var result=JSON.parse(xhr.responseText);
				
				mId=result.BordView[0].mId;
				nickname.value=result.BordView[0].nickname;
				userId.value=result.BordView[0].userId;
				mPw.value=result.BordView[0].mPw;
				title.value=result.BordView[0].title;
				memo.value=result.BordView[0].memo;
				mGroup.innerHTML=result.BordView[0].mGroup;
				mTime.innerHTML=result.BordView[0].mTime;
				hit.innerHTML=result.BordView[0].hit;
				step.innerHTML=result.BordView[0].step;
				mIndent.innerHTML=result.BordView[0].mIndent;
				
				
				
				
				
				
			}
			
		};
		
		xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
		xhr.send(data);
		
		
		
		
	}


</script>

</body>
</html>