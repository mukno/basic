<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");

	String url="jdbc:mysql://localhost:3306/javaStudy?useSSL=false&serverTimezone=UTC";
	String user="root";
	String password="12345";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	RequestDispatcher dispatcher=null;
	ResultSet rs=null;
	String query="";
	int result=0;
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,user,password);
		query="select count(*) from member1 where userId=? and userPw=?;";
		
		pstm=conn.prepareStatement(query);
		
		pstm.setString(1, userId);
		pstm.setString(2, userPw);
		rs=pstm.executeQuery(query);
		while(rs.next()){
			System.out.print(rs.getInt(1));
			result=rs.getInt(1);
			
		}
		
		
	}catch(Exception e){
		
	}finally{
		
	}
	System.out.print(result);
	if(result==1){
		session.setAttribute("sessionId",userId);
		session.setMaxInactiveInterval(60*5);
		
		out.print("<script>");
		out.print("alert('로그인 성공..');");
		out.print("location.href='index.jsp';");
		out.print("</script>");
	}else{
		out.print("<script>");
		out.print("alert('로그인 실패..');");
		out.print("history.go(-1);");
		out.print("</script>");
	}
		
		



%>