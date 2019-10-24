package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;

public class replyWrite implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nickname=requset.getParameter("nickname");
		String title=requset.getParameter("title");
		String memo=requset.getParameter("memo");
		String mGroup=requset.getParameter("mGroup");
		String step=requset.getParameter("step");
		String mPw=requset.getParameter("mPw");
		int mGroupi=Integer.parseInt(mGroup);
		
		System.out.println("--"+nickname);
		System.out.println("--"+title);
		System.out.println("--"+memo);
		System.out.println("--"+mGroup);
		System.out.println("--"+step);
		System.out.println("--"+mPw);
		BordDAO dao=BordDAO.getInstance();
		int result=dao.replywrite(title, memo,mGroup,step,nickname,mPw);
		int mId=dao.mIdSelect(mGroupi, "user");
		System.out.println("result:"+result);
		PrintWriter out=response.getWriter();
		out.write(""+result+mId);
		
		out.flush();
		
		
	}
	

}
