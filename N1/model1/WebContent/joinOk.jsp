<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//회원 가입 성공 ->login.jsp
	//회원 가입 실패 ->join.jsp
	String userId=request.getParameter("userId");
	String userPw=request.getParameter("userPw");
	String userName=request.getParameter("userName");
	int no=Integer.parseInt(request.getParameter("no"));
	
	String url="";
	String user="";
	String password="";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	String query="";
	RequestDispatcher dispatcher=null;
	String path="";
	
	int result=0;
	
	try{
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn=DriverManager.getConnection(url, user, password);
		query="insert into member_mysql_1(no,userId,userPw,userName) values(?,?,?,?)";	
		//3. sql처리
		pstm=conn.prepareStatement(query);
		
		pstm.setInt(1, no);
		pstm.setString(2, userId);
		pstm.setString(3, user);
		pstm.setString(4, userId);
		
		result=pstm.executeUpdate();//회원 가입 성공 1		
	
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
	
	
	//회원 가입 성공 ->login.jsp, 회원 가입 실패 ->join.jsp
	dispatcher=request.getRequestDispatcher(path);
	dispatcher.forward(request, response);//성공하면 result ->1 









%>