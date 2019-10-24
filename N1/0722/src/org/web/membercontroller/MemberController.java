package org.web.membercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.membercommend.MemberCommend;
import org.web.membercommend.MemberJoin;
import org.web.membercommend.login;
@WebServlet("*.mo")
public class MemberController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		String path=request.getContextPath();
		String basicURL=uri.substring(path.length());
		
		MemberCommend action=null;
		
		if(basicURL.equals("/join.mo")) {
			action=new MemberJoin();
			action.excuteQueryCommend(request, response);
			return;
			
			
		}
		if(basicURL.equals("/login.mo")) {
			action=new login();
			action.excuteQueryCommend(request, response);
			return;
			
			
		}
		
		
		
		
		
		
		
	}
	

}
