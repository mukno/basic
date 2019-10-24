package org.java.memberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class MemberController extends HttpServlet{
	
	/**
	 * 
	 */

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
		System.out.println("doGet");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
		System.out.println("doGet");
	}
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uri=request.getRequestURI();//요청URI
		String path=request.getContextPath();//기본패스
		
		String basicPath=uri.substring(path.length());
		
		System.out.println("uri="+uri);
		System.out.println("path="+path);
		System.out.println("path="+basicPath);
		
		PrintWriter out=response.getWriter();
		
		if(basicPath.equals("/login.do"))
		{
			out.print("로그인페이지 이동");
		}else if(basicPath.equals("/logOut.do"))
		{
			out.print("로그아웃페이지 이동");
		}else if(basicPath.equals("/joinMember.do"))
		{ 
			out.print("회원가입페이지 이동");
		}else if(basicPath.equals("/deleteMember.do"))
		{
			out.print("회원탈퇴페이지 이동");
		}
		out.close();
		
		
		
		
		
	}

	

}
