package org.web.bordController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.bordCommend.BordCommend;
import org.web.bordCommend.BordDeleteBo;

@WebServlet("*.bo")
public class BordController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("uft-8");
		String uri=request.getRequestURI();
		String path=request.getContextPath();
		String basicURL=uri.substring(path.length());
		
		BordCommend Action =null;
		String url="";
		if(basicURL.equals("/BordDeleteBo.bo"))
		{
			Action=new BordDeleteBo();
			Action.executeQuery(request, response);
			url=(String)request.getAttribute(url);
		
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
		
		
	}
	

	
	
	
}
