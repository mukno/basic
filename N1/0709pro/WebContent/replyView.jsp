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
	<form>
		<input type="hidden" name="mGroup"value="">
		<input type="hidden" name="step"value="">
		<input type="hidden" name="userId" value="">
		<ul>
			<li>답변글</li>
			<li>
				<label>NICKNAME</label>
				<input type="text" name="nickname" value="">
			</li>
			<li>
				<label>게시글 제목</label>
				<input type="text" name="title" value="">
			</li>
			<li>
				<label>게시글 비밀번호</label>
				<input type="password" name="mPw" value="">
			</li>
				<li>
				<label>게시글 내용:</label>
			</li>
			<li>
				<textarea rows="10" name="memo"></textarea>
			</li>
				<li>
				<input type="button" onclick="replyWirte()" value="답변"/>
				<input type="button" onclick="bordListGo()" value="목록"/>
			</li>
			
			
		</ul>
	</form>

<script>
		var xhr=new XMLHttpRequest();
		var mId=${param.mId};
		var nickname=document.getElementsByName("nickname")[0];
		var title=document.getElementsByName("title")[0];
		var memo=document.getElementsByName("memo")[0];
		var mGroup=document.getElementsByName("mGroup")[0];
		var step=document.getElementsByName("step")[0];
		var mPw=document.getElementsByName("mPw")[0];
		var userId=document.getElementsByName("userId")[0];
		
		window.onload=function(){
			ajaxView();
		}
		function bordListGo(){
			location.href="bordList.jsp";
		}
		
		function replyWirte(){
			console.log("1");
			var xhr2=new XMLHttpRequest();
			var data="mId="+mId+"&title="+title.value+"&memo="+memo.value+"&step="+step.value+"&mGroup="+mGroup.value+"&nickname="+nickname.value+"&mPw="+mPw.value;
			var url="replyWrite.bo";
			
			xhr2.open("POST",url,true);
			xhr2.onreadystatechange=function(){
				if(xhr2.status==200 && xhr2.readyState==4){
					var rs=xhr2.responseText;
					var writeCheck=rs.substring(0,1);
					var mIdCheck=rs.substring(1,rs.length);
					if(writeCheck==1){
						alert("성공");
						location.href="bordListView.jsp?mId="+mIdCheck;
						
					}else{
						alert("실패");
						
					}
					
					
					
					
					
					
					
				}
				
			};
			
			xhr2.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
			xhr2.send(data);
			
			
			
			
		}
		
	function ajaxView(){
		
		var data="mId="+mId;
		var url="replyView.bo";
		
		xhr.open("POST",url,true);
		xhr.onreadystatechange=function(){
			if(xhr.status==200 && xhr.readyState==4){
				var result=JSON.parse(xhr.responseText);
				
				
				console.log(result);
				nickname.value=result.BordView[0].nickname;
				mGroup.value=result.BordView[0].mGroup;
				step.value=result.BordView[0].step;
				userId.value=result.BordView[0].userId;
				
				
				
				
				
				
			}
			
		};
		
		xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded;charset=utf8');
		xhr.send(data);
		
		
		
		
	}


</script>

</body>
</html>