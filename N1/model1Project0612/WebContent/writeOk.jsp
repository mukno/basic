<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId=request.getParameter("userId");
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	
	String url="jdbc:mysql://localhost:3306/javastudy?useSSL=false";
	String user="root";
	String password="12345";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	String query="";
	
	int result=0;
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		query="insert into mysql_bord(userId,title,content) values(?,?,?)";	

		pstm=conn.prepareStatement(query);
		
		pstm.setString(1, userId);
		pstm.setString(2, title);
		pstm.setString(3, content);
		
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
	
	
	if(result==1){		
		out.print("<script>");
		out.print("alert(\"글작성 성공..게시글 목록 페이지로 이동합니다.\");");
		out.print("location.href='bordListView.jsp';");
		out.print("</script>");		
		//path="login.jsp";
	}else{
		out.print("<script>");
		out.print("alert('글작성 실패..다시 작성해주세요');");
		out.print("history.go(-1);");//바로 직전 페이지로 이동
		out.print("</script>");		
		//path="join.jsp";		
		
	}


	
%>