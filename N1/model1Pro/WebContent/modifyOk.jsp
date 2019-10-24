<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<%
	String userId=request.getParameter("userId");
	String userPw=request.getParameter("userPw");
	String userName=request.getParameter("userName");
	
	String url="jdbc:mysql://localhost:3306/javastudy?userSSL=false";
	String user="root";
	String password="12345";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	String query="";
	//RequestDispatcher dispatcher=null; //자원도 같이 전달(다른 Servlet.jsp)
	String path="";
	
	int result=0;
	
	try{
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn=DriverManager.getConnection(url, user, password);
		query="update member_mysql_1 set userPw=?,userName=? where userId=?";	
		//3. sql처리
		pstm=conn.prepareStatement(query);
		
		pstm.setString(1, userPw);
		pstm.setString(2, userName);
		pstm.setString(3, userId);
		
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
	
	if(result==1)
	{
		out.print("<script>");
		out.print("alert(\"회원수정 성공 index 페이지로 이동\");");	
		out.print("location.href='index.jsp';");
		out.print("</script>");
		//path="login.jsp";
	}
	else
	{
		out.print("<script>");
		out.print("alert(\"회원수정 실패 회원수정 페이지로 이동\");");	
		out.print("history.go(-1);"); //바로직전 페이지로 이동
		out.print("</script>");
		//path="join.jsp";
	}
	
	//회원 가입 성공 ->login.jsp, 회원 가입 실패 ->join.jsp
	//dispatcher=request.getRequestDispatcher(path);
	//dispatcher.forward(request, response);//성공하면 result ->1 









%>