package webEL;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.bo")
public class ServletEx2 extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		//this.getServletConfig();
		ServletConfig config=getServletConfig();
		String url=config.getServletContext().getInitParameter("url");
		String user=config.getServletContext().getInitParameter("user");
		String password=config.getServletContext().getInitParameter("password");
		System.out.println("url: "+url);
		System.out.println("user: "+user);
		System.out.println("password: "+password);

	}
	
	
}
