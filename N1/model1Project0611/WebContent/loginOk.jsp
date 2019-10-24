<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String userId=request.getParameter("userId");
	String userPw=request.getParameter("userPw");

    String url="jdbc:mysql://localhost:3306/javastudy?useSSL=false&serverTimezone=UTC";
	String user="root";
	String password="12345";
	
	Connection conn=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;
	String query="";
	int result=0;// SQL처리 결과 반환값
	
	try{
		Class.forName("com.mysql.jdbc.Driver");		
		conn=DriverManager.getConnection(url, user, password);
		query="select count(*) from member_mysql_1 where userId=? and userPw=?;";
		pstm=conn.prepareStatement(query);
		
		pstm.setString(1, userId);
		pstm.setString(2, userPw);
		rs=pstm.executeQuery();
		
		while(rs.next()){
			result=rs.getInt(1);// 로그인 정보가 있으면 1
		}				
		
	}catch(Exception e){
		
	}finally{
		try{
			//4. 연결 해제
			if(conn!=null) conn.close();
			if(pstm!=null) pstm.close();
			if(rs!=null) rs.close();				
		}catch(Exception e){
			e.printStackTrace();
		}finally{}
	}	

	if(result==1){		
		//세션설정..
		session.setAttribute("sessionId", userId);
		session.setMaxInactiveInterval(60*5);//세션 유지 시간 
		
		out.print("<script>");
		out.print("alert(\"로그인 성공..index 페이지로 이동합니다.\");");
		out.print("location.href='index.jsp';");
		out.print("</script>");		
		//path="login.jsp";
	}else{
		out.print("<script>");
		out.print("alert('로그인 실패..로그인 페이지로 이동합니다.');");
		out.print("history.go(-1);");//바로 직전 페이지로 이동
		out.print("</script>");		
		//path="join.jsp";		
		
	}
	
	
	
	
	
	

%>