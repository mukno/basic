package org.java.memberController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("MemberJoin.do")
public class MemberJoin extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("º≠∫Ì∏¥ Ω√¿€");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	
	@Override
	public void destroy() {
		
		System.out.println("º≠∫Ì∏¥ ¡æ∑·");
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) {
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userName=request.getParameter("userName");
		String userAge=request.getParameter("userAge");
		
		String[] userGender=request.getParameterValues("userGender");
		
	}
	
}
