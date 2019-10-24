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
	String userId=request.getParameter("userId");
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	
	String url = "jdbc:mysql://localhost:3306/javastudy?useSSL=false";
	String user = "root";
	String password = "12345";

	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs=null;
	String query = "";
	
	int result = 0;
	

	try {
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn = DriverManager.getConnection(url, user, password);
		query = "update mysql_bord set title=?,content=? where userId=? and no=?";
		//3. sql처리
		pstm = conn.prepareStatement(query);

		pstm.setString(1, title);
		pstm.setString(2, content);
		pstm.setString(3, userId);
		pstm.setInt(4, no);
		
		result = pstm.executeUpdate();
		
				
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

	if(result==1){		
		out.print("<script>");
		out.print("alert(\"글수정 성공...\");");
		out.print("location.href='bordListView.jsp';");
		out.print("</script>");		
		//path="login.jsp";
	}else{
		out.print("<script>");
		out.print("alert('글수정 실패.');");
		out.print("history.go(-1);");//바로 직전 페이지로 이동
		out.print("</script>");	
	}

%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


</body>
</html>