package org.web.membercontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.membercommend.IdCheckedMo;
import org.web.membercommend.MemberCommend;
import org.web.membercommend.joinOk;
import org.web.membercommend.logOut;
import org.web.membercommend.login;
import org.web.membercommend.memberView;
import org.web.membercommend.memberdelete;

@WebServlet("*.mo")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI(); 
		String path = request.getContextPath();
		String basicURL = uri.substring(path.length());
		
		String url="";
		MemberCommend action=null;
		
		if(basicURL.equals("/idChecked.mo")) {
			action=new IdCheckedMo();
			action.excuteQueryCommend(request, response);
			return ;
		}
		if(basicURL.equals("/loginOk.mo")) {
			action=new login();
			action.excuteQueryCommend(request, response);
			return ;
		}
		if(basicURL.equals("/joinOk.mo")) {
			action=new joinOk();
			action.excuteQueryCommend(request, response);
			return ;
		}
		if(basicURL.equals("/logOut.mo")) {
			action=new logOut();
			action.excuteQueryCommend(request, response);
			return ;
		}
		if(basicURL.equals("/memberDeleteOk.mo")) {
			action=new memberdelete();
			action.excuteQueryCommend(request, response);
			return ;
		}
		if(basicURL.equals("/MemberView.mo")) {
			action=new memberView();
			action.excuteQueryCommend(request, response);
			return ;
		}
		
	}
	

}
