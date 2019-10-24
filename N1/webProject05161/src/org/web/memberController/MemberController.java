package org.web.memberController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberCommend.MemberCommend;
import org.web.memberCommend.MemberIdCheckedDo;
import org.web.memberCommend.MemberJoinDo;
import org.web.memberCommend.MemberListDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		String uri=request.getRequestURI();
		String path=request.getContextPath();
		
		String basicURL=uri.substring(path.length());
		
		
		System.out.println(uri);
		System.out.println(path);
		
		String url=""; //컨트롤러가view(jsp)페이지로 request,response를 전송
		
		
		MemberCommend action=null;
		
		if(basicURL.equals("/JOIN.do"))
		{
			action=new MemberJoinDo();
			action.excuteQueryCommend(request, response);
			url=(String)request.getAttribute("url");//commend에서 반환되는 url
	
		}else if(basicURL.equals("/MemberList.do")) {
			action=new MemberListDo();
			action.excuteQueryCommend(request, response);
			url=(String)request.getAttribute("url");
			
		}else if(basicURL.equals("/MemberIdChecked.do")) {
			action=new MemberIdCheckedDo();
			action.excuteQueryCommend(request, response);
			url=(String)request.getAttribute("url");
			
		}
		
		
			RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response); //url(view)페이지로 request,response를 전송
		
		
	}
	
	
}
