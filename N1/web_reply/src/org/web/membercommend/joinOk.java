package org.web.membercommend;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberdao.MemberDao;

public class joinOk implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("ȸ������ ");
		
		
		String a="abc";
		if(a=="abc") {
		
		}
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userName=request.getParameter("userName");
		
		MemberDao dao =MemberDao.getInstance();
		int rs=dao.joinOk(userId, userPw, userName);
		
		PrintWriter out =response.getWriter();
		out.write(rs+"");
		out.flush();
		
		
		
	}
	

}
