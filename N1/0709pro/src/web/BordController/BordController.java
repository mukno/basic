package web.BordController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordCommend.BordCommend;
import web.BordCommend.BordDelete;
import web.BordCommend.BordList;
import web.BordCommend.BordUpdate;
import web.BordCommend.BordView;
import web.BordCommend.BordWrite;
import web.BordCommend.replyView;
import web.BordCommend.replyWrite;

@WebServlet("*.bo")
public class BordController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		String basicURL=uri.substring(path.length());
		
		String url="";
		BordCommend action=null;
		if(basicURL.equals("/Write.bo")) {
			action=new BordWrite();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/BordList.bo")) {
			action=new BordList();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/BordView.bo")) {
			action=new BordView();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/BordUpdate.bo")) {
			action=new BordUpdate();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/BordDelete.bo")) {
			action=new BordDelete();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/replyView.bo")) {
			action=new replyView();
			action.excuteQueryCommend(request, response);
			return;
		}
		if(basicURL.equals("/replyWrite.bo")) {
			action=new replyWrite();
			action.excuteQueryCommend(request, response);
			return;
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}
	
}
