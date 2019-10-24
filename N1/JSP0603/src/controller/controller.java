package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class controller extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("최초 한번만 생성(서블릿생성)");
		super.init();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		action(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		action(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("서블릿종료");
		super.destroy();
	}

	private void action(HttpServletRequest request, HttpServletResponse response) {

		response.setContentType("text/html;charset=uft8");
		
		
		String uri=request.getRequestURI();
		String path=request.getContextPath();
		String url=uri.substring(path.length());
		
		
	}
	
	
}
