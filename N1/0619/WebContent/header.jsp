<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/header.css"/>
    <div id="header">
    	<ul>
    		<li><a href="index.jsp">HOME</a></li>
		<% 
			if(session.getAttribute("sessionId")!=null){
			%>	
    		<li><a href="modifyViewOk.jsp?userId=<%=session.getAttribute("sessionId")%>">MODIFY</a></li>
    		<li><a href="bordListView.jsp">BORDLIST</a></li>
    		<li><a href="logoutOk.jsp">LOGOUT</a></li>
    		<span id="user"><%=session.getAttribute("sessionId") %>님</span>				
			<%
			}else{
			 %>
    		<li><a href="bordListView.jsp">BORDLIST</a></li>
    		<li><a href="join.jsp">join</a></li>				
    		<li><a href="login.jsp">login</a></li>				
			<%
			}
		
		%>
		</ul>
	</div>