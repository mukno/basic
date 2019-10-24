package org.web.membercommend;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberdao.MemberDAO;

public class MemberJoin implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String Nickname=request.getParameter("Nickname");
		
		MemberDAO dao=MemberDAO.getInstance();
		int result=dao.join(userId,userPw,Nickname);
		
		PrintWriter out=response.getWriter();
		out.write(result+"");
		out.flush();
		
		
		
		
		
		
		
	}
	

}
