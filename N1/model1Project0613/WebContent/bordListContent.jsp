<%@page import="java.sql.DriverManager"%>
<%@page import="org.web.dto.BordBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String url = "jdbc:mysql://localhost:3306/javastudy?useSSL=false";
	String user = "root";
	String password = "12345";

	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs=null;
	String query = "";
	
	int result = 0;
	
	ArrayList<BordBean> lists=new ArrayList<BordBean>();

	try {
		//1. 드라이버연결
		Class.forName("com.mysql.jdbc.Driver");
		//2. DB연결
		conn = DriverManager.getConnection(url, user, password);
		query = "select * from mysql_bord order by no desc;";
		//3. sql처리
		pstm = conn.prepareStatement(query);

		rs = pstm.executeQuery();//게시글 get	
		
		while(rs.next()){			
			lists.add(new BordBean(rs.getInt(1),
							rs.getString(2),rs.getString(3),rs.getString(4)));
			
		}		
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
%>
 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/bordList.css"/> 
    
<div id="bordList">
	<table>
		<tr>
			<th>no</th>
			<th>글번호</th>
			<th>아이디</th>
			<th>글제목</th>
			<th>글내용</th>
			<th>글보기</th>		
		</tr>
	<%
		int i=lists.size();
		for(BordBean list: lists){
	%>		
		<tr>
			<td><%=list.getNo() %></td>
			<td><%=i--%></td>			
			<td><%=list.getUserId() %></td>
			<td><%=list.getTitle() %></td>
			<td><%=list.getContent() %></td>
			<td><a href="bordView.jsp?no=<%=list.getNo()%>">보기</a></td>
		</tr>					
	<%	
		}
	
	%>
		<tr>		
			<td colspan="5">
				<a href="bordWirte.jsp">게시글 작성</a>
			</td>		
		
		</tr>
				
	</table>

</div>