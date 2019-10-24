<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		var rs=confirm("로그인 후 이용하세요.. 확인을 클릭하면 로그인페이지 이동");
		if(rs==true){
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
</head>
<body>
<c:import url="header.jsp"/>
<div id="write">
	<form>
		아이디: <input type="text" name="userId" value="${sessionScope.sessionId }"disabled/><br>
		닉네임: <input type="text" name="nickname" /><br>
		글 비밀번호: <input type="password" name="mpw" /><br>
		글 제목: <input type="text" name="title" /><br>
		글 내용: <br>
		<textarea name="memo" cols="30" rows="30"></textarea><Br>
		
		<input type="button" onclick="ajaxWrite()" value="글 작성"/>
	</form>

</div>
<script>
	
	var xhr=new XMLHttpRequest();

	function ajaxWrite(){
		var nickname=document.getElementsByName("nickname")[0];
		var userId=document.getElementsByName("userId")[0];
		var mpw=document.getElementsByName("mpw")[0];
		var title=document.getElementsByName("title")[0];
		var memo=document.getElementsByName("memo")[0];
		
		if(nickname.value==null || nickname.value==""){
			alert("nickname 오류");
			nickname.focus();
			return;
			
		}
		if(userId.value==null || userId.value==""){
			alert("userId 오류");
			userId.focus();
			return;
			
		}
		if(mpw.value==null || mpw.value==""){
			alert("mpw 오류");
			mpw.focus();
			return;
			
		}
		if(title.value==null || title.value==""){
			alert("title 오류");
			title.focus();
			return;
			
		}
		if(memo.value==null || memo.value==""){
			alert("memo 오류");
			memo.focus();
			return;
			
		}
		var data="nickname="+nickname.value+"&userId="+userId.value+"&mpw="+mpw.value+"&title="+title.value+"&memo="+memo.value;
		var url="Write.bo";
		
		xhr.open("POST",url,true);
		xhr.onreadystatechange=function(){
			if(xhr.status==200 && xhr.readyState==4){
				var result=xhr.responseText;
				var writeCheck=result.substring(0,1);
				var mIdCheck=result.substring(1,result.length);
				console.log(result);
				console.log(writeCheck);
				console.log(mIdCheck);
				
				if(writeCheck==1){
					alert("글작성 성공");
					location.href="bordListView.jsp?mId="+mIdCheck+"&userId="+userId.value;
				}else{
					alert("글작성 실패");
				} 
				
			}
			
		};
		
		xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
		xhr.send(data);
		
		
		
		
	}


</script>

</body>
</html>
