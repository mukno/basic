package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Commend.MemberCommend;
import Commend.joinDo;
import Commend.loginDo;


@WebServlet("*.do")
public class controller extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		

		String uri = request.getRequestURI(); 
		String path = request.getContextPath();
		String basicURL = uri.substring(path.length());
		MemberCommend action = null;
		String url="";
		
		if (basicURL.equals("/JOIN.do")) {
			action = new joinDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");//

		}else if (basicURL.equals("/LOGIN.do")) {
			action = new loginDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");//

		}
		
		
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);// 

}
	
}

