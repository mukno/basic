package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;

public class BordDelete implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		String userId=requset.getParameter("userId");
		String mPw=requset.getParameter("mPw");
		String mId=requset.getParameter("mId");
		System.out.println(userId);
		System.out.println(mId);
		System.out.println(mPw);
		BordDAO dao=BordDAO.getInstance();
		int result=dao.delete(mId,userId,mPw);
		PrintWriter out=response.getWriter();
		out.write(result+"");
		out.flush();
		
		
	}
	

}
;