<%@page import="org.web.dto.MemberBean"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<jsp:useBean id="member"  scope="request" class="org.web.dto.MemberBean"/> 

<%
	String userId = request.getParameter("userId");

	String url = "jdbc:mysql://localhost:3306/javastudy?useSSL=false";
	String user = "root";
	String password = "12345";

	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	String query = "";
	//int result = 0;// SQL처리 결과 반환값

	//MemberBean member1 = null;

	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		query = "select userId,userPw,userName from member_mysql_1 where userId=?;";
		pstm = conn.prepareStatement(query);

		pstm.setString(1, userId);
		rs = pstm.executeQuery();

		while (rs.next()) {
			//member1 = new MemberBean(rs.getString(1), rs.getString(2), rs.getString(3));
			member.setUserId(rs.getString(1));
			member.setUserPw(rs.getString(2));
			member.setUserName(rs.getString(3));
		}

	} catch (Exception e) {

	} finally {
		try {
			//4. 연결 해제
			if (conn != null)
				conn.close();
			if (pstm != null)
				pstm.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	if (member != null) {

		out.print("<script>");
		out.print("alert('" + userId + "님의 회원 정보페이지로이동합니다.');");
		//out.print("location.href='modifyView.jsp';");
		out.print("</script>");

		//request.setAttribute("member1", member1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("modifyView.jsp");
		dispatcher.forward(request, response); 

	} else {
		out.print("<script>");
		out.print("alert('로그인 실패..로그인 페이지로 이동합니다.');");
		out.print("history.go(-1);");//바로 직전 페이지로 이동
		out.print("</script>");

	}
%>

