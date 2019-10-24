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
import org.web.memberCommend.MemberLogOutDo;
import org.web.memberCommend.MemberLoginDo;
import org.web.memberCommend.MemberModifyViewDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

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

		String uri = request.getRequestURI(); // Path/JOIN.do
		String path = request.getContextPath();// ���� �⺻ Path
		String basicURL = uri.substring(path.length());

		System.out.println(uri);
		System.out.println(path);

		String url = "";// ��Ʈ�ѷ��� View(jsp)�������� request,response�� ����

		MemberCommend action = null;

		if (basicURL.equals("/JOIN.do")) {
			action = new MemberJoinDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");// Commend���� ��ȯ ��� url

		} else if (basicURL.equals("/MemberList.do")) {
			action = new MemberListDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
			
		}else if (basicURL.equals("/MemberIdChecked.do")) {
			action = new MemberIdCheckedDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
			
		}else if (basicURL.equals("/LOGIN.do")) {
			action = new MemberLoginDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
			
			
		}else if (basicURL.equals("/LOGOUT.do")) {
			action = new MemberLogOutDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}
		else if (basicURL.equals("/MemberModifyView.do")) {
			action = new MemberModifyViewDo();
			action.excuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}
		
		
		

		

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);// url(View)�������� request,response�� ����

	}

}
