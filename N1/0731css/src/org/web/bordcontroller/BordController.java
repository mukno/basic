package org.web.bordcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.bordcommend.BordList;
import org.web.bordcommend.BordView;
import org.web.bordcommend.WriteOk;
import org.web.bordcommend.BordCommend;

@WebServlet("*.bo")
public class BordController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		doAction(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length());

		String url = "";

		BordCommend action = null;

		if(basicURL.equals("/bordList.bo")) {
			action = new BordList();
			action.executeCommend(request, response);
			url = (String) request.getAttribute("url");
		}else if(basicURL.equals("/bordView.bo")) {
			action = new BordView();
			action.executeCommend(request, response);
			url = (String) request.getAttribute("url");
		}else if(basicURL.equals("/writeOk.bo")) {
			action = new WriteOk();
			action.executeCommend(request, response);
			url = (String) request.getAttribute("url");
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		

	}
}
