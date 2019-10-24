package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;

public class BordUpdate implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		String nickname=requset.getParameter("nickname");
		String userId=requset.getParameter("userId");
		String mPw=requset.getParameter("mPw");
		String mId=requset.getParameter("mId");
		String title=requset.getParameter("title");
		String memo=requset.getParameter("memo");
		System.out.println(nickname+userId+mPw+mId+title+memo);
		BordDAO dao=BordDAO.getInstance();
		int result=dao.update(nickname, userId, mPw, title, memo,mId);
		System.out.println(result);
		PrintWriter out=response.getWriter();
		out.write(result+"");
		out.flush();
		
		
	}
	

}
