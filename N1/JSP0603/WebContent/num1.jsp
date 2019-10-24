<%@page import="java.util.ArrayList"%>
<%@page import="controller.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"
    beffer="8kb"
    %>
    
    <%!//선언문 (맴버선언) <<스크립트릿으로 대체하는 경우가 많음
    
    int num1;
    int num2;
     public int methode(){
    
    	 return 19;
     }
    
    %>
    <%//스크립트릿
    ArrayList<MemberDto> lists=new ArrayList<MemberDto>();

    lists.add(new MemberDto("m1","11","11",11));
    lists.add(new MemberDto("m2","22","11",11));
    lists.add(new MemberDto("m3","33","11",11));
    lists.add(new MemberDto("m4","44","11",11));
    
    session.setAttribute("sessionId", "m1");
    %>
    
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

num1=<%=//표현식  <<간단한 데이터출력이나 메서드 호출 ;을 사용안한다

num1

    %>
    
    
 <%
 
 	for(MemberDto dto : lists){
 		out.print(dto.getUserId());
 		out.print(dto.getUserAge());
 		out.print(dto.getUserPw());
 		out.print(dto.getUserName()+"<br>");
 		
 		
 		
 	}
 
 
 %>
 
	세션:<%=session.getAttribute("sessionId")%>
 
 
 
        
    
 <%
 
 	for(MemberDto dto : lists){
 		%>
 		아이디:<%=dto.getUserId() %>);
 		아이디:<%=dto.getUserAge() %>
 		아이디:<%=dto.getUserPw() %>
 		아이디:<%=dto.getUserName() %>
 		<%
 		
 		
 	}
 %>
   
   
  지시어 .. jsp설정
  
  페이지
 <%@page%>jsp페이지에 대한 정보를 입력하기 위해서 사용한다.
 language향후 확장될 가능성을 고려
 기본값java
 session 기본값ture
 MIME 파일변환
 이메일과 함께 동봉할 파일을 텍스트문자로 전환해서 이메일 시스템을 통해전달하기위해개발
 contentType="text/html; charset=UTF-8"
 text/html 모든 html컨튼체는 기본
 text/plain 테스트파일에대한기본값
 multipart/from-
   pageEncoding="UTF-8"
   contenttype 의 캐릭셋설정과 같은기능을하나
   최신서버에서는 pageencoding을사용하고 호환성을 유지하려면 두개다 병행해서 사용
 buffer  버퍼설정 곧바로 서버에 출력을 요청하지않고 버퍼로 데이터를 모아 보냄
 autoflush 버퍼가 다찼을때 버퍼에 쌓인 데이터를 실제로 전소오디어야할곳에 전송하고 버퍼를 비운다
 true,false값으로 true일경우 플러스 진행 false이면 예외를 발생후 작업중지
  1.예외가 발생 시 처리할 예외페이지
 errorpage="error.jsp"
 2.예외페이지에 추가될 속성
 isErrorpage="true" error.jsp현제에러페이지 추가
 
 
 
 include(파일등 포함)
 
 
 태그라이브러리->JSTL(외부라이브러리)
 
 
    
    
    
    
    

</body>
</html>