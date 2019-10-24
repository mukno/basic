package org.web.memberCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.web.memberdao.MemberDao;
public class MemberModifyViewDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원 조회");
		MemberDao dao = MemberDao.getInstance();
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		int userAge = 0;
		try {
			userAge = Integer.parseInt(request.getParameter("userAge"));
			
		} catch (Exception e) {
		}
	
		int result=dao.MemberView(userId, userPw, userName, userAge);
		
		String url="";
		
		if(result==1) {
			System.out.println("회원 수정 성공");
		}
		else {
			System.out.println("회원 수정 실패");
		}
		
		request.setAttribute("url", "/index.jsp");
		
	}

}
