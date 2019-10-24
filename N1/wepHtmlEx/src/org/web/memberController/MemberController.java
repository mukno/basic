package org.web.memberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberJoin.do")
public class MemberController extends HttpServlet{
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		                       	throws ServletException, IOException {
		System.out.println("dopost");
		doAction(request,response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			                     throws ServletException, IOException {
		System.out.println("doget");
		doAction(request,response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");//클라이언트의 문자셋
		response.setContentType("text/html;charset=utf-8");//서버가 응답하는 타입
		String uri=request.getRequestURI();//요청URI
		System.out.println(uri);
		String path=request.getContextPath();//기본 패스
		System.out.println(path);
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userName=request.getParameter("usserName");
		String userAge=request.getParameter("userAge");
		
		System.out.println(userId);
		System.out.println(userPw);
		System.out.println(userName);
		System.out.println(userAge);
		
		
		PrintWriter out=response.getWriter();//서버에서 클라이언트 응답
		out.print("<html>");
		out.print("<head>");
		out.print("<title>서버에 의해서 응답</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("아이디: "+userId+", ");
		out.print("비밀번호: "+userPw+", ");
		out.print("이름:" +userName+", ");
		out.print("나이: "+userAge);
		
		out.print("</body>");

		
		out.print("</html>");
		
		out.close();
		
	}
	
	
}
