<%@page import="java.sql.DriverManager"%>
<%@page import="org.web.dto.BordBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	
		int no=Integer.parseInt(request.getParameter("no"));
	
	String url = "jdbc:mysql://localhost:3306/javastudy?useSSL=false";
	String user = "root";
	String password = "12345";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs=null;
	String query = "";
	
	int result = 0;
	
	BordBean list=new BordBean();
	
	try {
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn = DriverManager.getConnection(url, user, password);
		query = "select * from mysql_bord where  no=?;";
		//3. sql처리
		pstm = conn.prepareStatement(query);
		
		pstm.setInt(1, no);
	
		rs = pstm.executeQuery();//게시글 get	
		
		while(rs.next()){			
			list=new BordBean(rs.getInt(1),
							rs.getString(2),rs.getString(3),rs.getString(4));
			
		}		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			//4. 연결 해제
			if (conn != null)
				conn.close();
			if (pstm != null)
				pstm.close();
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글보기</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/> 
</head>
<body>

<%@include file="header.jsp" %>

<div id="bordView">

	<table id="tbordView">
		<form action="#" method="POST" name="bordviewForm">
			<tr>
				<th colspan="2"><h1>글보기</h1></th>
			</tr>
			<!-- no(auto_increment)는 자동으로 값이 설정 -->
			<tr>
				<td>아이디: </td>
				<%
					if(session.getAttribute("sessionId")!=null){
				%>						
				<td><%=session.getAttribute("sessionId")%><input type="hidden" name="userId" value="<%=session.getAttribute("sessionId")%>"></td>
				<%
					}else{
						%>
				<td><%=list.getUserId()%><input type="hidden" name="userId"  value="<%=list.getUserId()%>"></td>						
						<%
					}
				
				%>
			</tr>
			<tr>
				<td>글제목:</td>
				<td><input type="text" name="title" value="<%=list.getTitle()%>"></td>
			</tr>
			<tr>
				<td>글내용:</td>
				<td>
					<textarea rows="5" cols="25" name="content"><%=list.getContent()%></textarea>		
					<input type="hidden" name="no" value=<%=list.getNo() %>>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="bordDelete.jsp?no=<%=list.getNo()%>">글삭제</a>
					<span onclick="updateGo()">글수정</a>
					<a href="bordListView.jsp">글목록</a>
					<a href="index.jsp">HOME</a>
				</td>
			</tr>
		</form>
</div>
<script>
	function updateGo()
	{
		var bordViewForm=document.bordViewForm;
		var no=bordViewForm.no;
		var title=bordViewForm.title;
		var content=bordViewForm.content;
		
		alert("글 수정 페이지로 이동");
		
		location.href="bordUpdate.jsp?no="+no.value+"&title="+title.value+"&content="+content.value;
		
		
		
		
	}


</script>


<%@include file="footer.jsp" %>



</body>
</html>