package org.web.memberCommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberdao.MemberDao;

public class MemberLoginCheckDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("�α��� üũ ����");
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");		
		
		MemberDao dao=MemberDao.getInstance();
		
		int rs=dao.login(userId,userPw);//�α��� �����ϸ� 1
	
		
		PrintWriter out = response.getWriter();
		
		out.write(rs+"");
		out.flush();
		
		
		
	}
	
	

}
