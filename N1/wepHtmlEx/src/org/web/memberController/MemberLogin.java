package org.web.memberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("memberLogin")
public class MemberLogin extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doAction(request,response);
		
	}
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("아이디: "+userId+"\n");
		out.print("비밀번호: " +userPw);
		out.print("</body>");
		out.print("</html>");
		out.close();
		
		
	}
	
	
	

}
