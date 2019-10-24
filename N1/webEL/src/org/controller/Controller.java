package org.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		ServletConfig config=this.getServletConfig();
		
		//단일 서블릿의 초기화 피라미터값을 get
		String userId=config.getInitParameter("userId");
		String userPw=config.getInitParameter("userPw");
		System.out.println("userId: "+userId);
		System.out.println("userPw: "+userPw);
		
		//모든 서블릿의 초기화 피라미터값을 get
		String url=config.getServletContext().getInitParameter("url");
		String user=config.getServletContext().getInitParameter("user");
		String password=config.getServletContext().getInitParameter("password");
		System.out.println("url: "+url);
		System.out.println("user: "+user);
		System.out.println("password: "+password);
		
		

	}
	
	
}
