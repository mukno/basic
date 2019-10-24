package org.web.bordController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.bordComend.BordCommend;
import org.web.bordComend.BordListViewBo;
import org.web.bordComend.BordViewBo;
import org.web.bordComend.BordWriteBo;


@WebServlet("*.bo")
public class BordController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String uri=request.getRequestURI();
		String path=request.getContextPath();
		String basicURL=uri.substring(path.length());
		
		
		String url="";
		
		BordCommend action=null;
		
		if(basicURL.equals("/bordWrite.bo")) {
			action=new BordWriteBo();
			action.excuteQuery(request, response);
			url=(String)request.getAttribute("url");	
			
		}else if(basicURL.equals("/bordListView.bo")) {
			action=new BordListViewBo();
			action.excuteQuery(request, response);
			url=(String)request.getAttribute("url");
			
		}else if(basicURL.equals("/bordView.bo")) {
			action=new BordViewBo();
			action.excuteQuery(request, response);
			url=(String)request.getAttribute("url");
			
		}
		

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);// url(View)페이지로 request,response를 전송
		
		
		
		
		
		
	}
	
	
}
