<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    String bookid=request.getParameter("bookid");
    String query="select * from orders where bookid='"+bookid+"'";
    Connection con=DriverManager.getConnection(url, "madang", "madang");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(query);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="white" text="black"link="blue" vlink="purple" alink="red">
<table borded="1" cellspaceing="0" width="400"
bordercolor="#9AD2F7" bordercolordark="white"
bordercolorlight="#B9E0FA">


			
	
				
				 <tr>
				 <td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black">orderid</font></span></p>
			 </td>
				 <%
				 if(rs!=null){
						while(rs.next()){
							String orderid=rs.getString("orderid");
				 %>
			<td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black"><%=orderid %></font></span></p>
			 </td>
			 <%
						}}
			 %>
			 </tr>
			 
			 <tr>
			  <td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black">bookname</font></span></p>
			 </td>
			 
			 <%
				 if(rs!=null){
						while(rs.next()){
							String bookname=rs.getString("bookname");
				 %>
			 <td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black"><%=bookname %></font></span></p>
			 </td>
			 <%
						}}
			 %>
			 </tr>
			 <tr>
			  <td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black">bookid</font></span></p>
			 </td>
			 <%
				 if(rs!=null){
						while(rs.next()){
							String book=rs.getString("bookid");
				 %>
			  <td width="150" height="50">
			 	<p align="center">
			 	<span style="font-size:9pt;">
				<font face="돋움체" color="black"><%=book %></font></span></p>
			 </td>
			 <%
			 }}
			 %>
			 </tr>
				
				
				
				
				
				
				
	
		
		</table>
		<table cellpadding="0" cellspacing="0" width="400" height="60">
			<tr>
				<td width="1350">
					<p align="right"><b><a href="booklist.jsp">
					<font size="1" face="돋움체" color="black">LIST</font></a></b>
				</td>
				</tr>
		</table>
			 


</body>
</html>