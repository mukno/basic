package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;

public class BordWrite implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		String nickname=requset.getParameter("nickname");
		String userId=requset.getParameter("userId");
		String mpw=requset.getParameter("mpw");
		String title=requset.getParameter("title");
		String memo=requset.getParameter("memo");
		
		BordDAO dao=BordDAO.getInstance();
		int mGroup=dao.mGroupSelect();
		int result=dao.write(nickname, userId, mpw, title, memo);
		int mId=dao.mIdSelect(mGroup, userId);
		System.out.println("mid:"+mId);
		PrintWriter out=response.getWriter();
		out.write(""+result+mId);
		
		out.flush();
		
		
	}
	

}
