<%@page import="org.web.dto.BordBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//회원 가입 성공 ->login.jsp
	//회원 가입 실패 ->join.jsp

	String url="jdbc:mysql://localhost:3306/javastudy?userSSL=false";
	String user="root";
	String password="12345";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	String query="";
	//RequestDispatcher dispatcher=null; //자원도 같이 전달(다른 Servlet.jsp)
	String path="";
	ResultSet rs=null;
	int result=0;
	
	ArrayList<BordBean> lists=new ArrayList<BordBean>();
	
	try{
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn=DriverManager.getConnection(url, user, password);
		query="select * from mysql_bord;";	
		//3. sql처리
		pstm=conn.prepareStatement(query);
		
		
		rs=pstm.executeQuery();	
		
		while(rs.next()){
			lists.add(new BordBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		
		
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			//4. 연결 해제
			if(conn!=null) conn.close();
			if(pstm!=null) pstm.close();
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
	}







%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css"/>
 
 
 
</head>
<body>
<%@include file="header.jsp" %>
<%@include file="BordListContent.jsp" %>
<%@include file="footer.jsp" %>

<div id="bordList">
	<table>
		<tr>
			<th>no</th>
			<th>아이디</th>
			<th>글제목</th>
			<th>글내용</th>
			<th>글보기</th>
		</tr>
	<%
		for(BordBean list: lists){
	%>
		<tr>
			<td><%=list.getNo()%></td>
			<td><%=list.getTitle()%></td>
			<td><%=list.getContent()%></td>
			<td><%=list.getUserId()%></td>
			<td><a href="BordVie.bo?no=<%=list.getNo() %>">보기</a></td>
		</tr>
		location.href="stds.jsp";
	<%
	
		}
	%>
		<tr>
			<td colspan="5">
				<a href="BordWirte.jsp">게시글 작성</a>
			</td>
		</tr>
	
	
	
	</table>






</div>










</body>
</html>