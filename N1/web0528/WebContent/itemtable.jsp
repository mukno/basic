<%@page import="org.web.memberDTO.ChartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


ArrayList<ChartDTO> chart = (ArrayList<ChartDTO>) request.getAttribute("chart");



String img=(String)request.getAttribute("img");

    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  
</head>
<body>
<div id="bord" style="text-align:center;background:#eee;width:80%;padding:20px 0;margin:0 auto">
		<h1 style="">물품</h1>
		
		<img src="<%=img %>">
		
		<table style="width: 100%" border="1">
			<tr>
				<th>물품명</th>
				<th>날짜</th>
				<th>지점</th>
				<th>가격</th>
				<th>변동</th>
			</tr>
			<%
				int b=0;
			
				for (ChartDTO dto : chart) {
			%>
	
			<tr>
				<td><%=dto.getItem()%></td>
				<td><%=dto.getDate()%></td>
				<td><%=dto.getShop()%></td>
				<td><%=dto.getPrice()%></td>
				<%
				b=Integer.parseInt(dto.getPrice());
				
				%>
				<td><%=Integer.parseInt(dto.getPrice())-b%></td>
				<%
				
			
				
				%>
				
				<%
				
				
				
				
				%>
	
			</tr>
			<%
				}
			%>
		</table>
	
	</div>


</body>
</html>