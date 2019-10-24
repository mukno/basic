package org.web.memberCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberDTO.MemberDTO;
import org.web.memberdao.MemberDao;

public class MemberModifyViewDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원 조회");
		
		
		String userId=request.getParameter("userId");
		
		System.out.println(userId);
		
		MemberDao dao=MemberDao.getInstance();		
		
		MemberDTO member=dao.memberView(userId);
		
		String url="";
		
		if(member==null) {
			System.out.println("조회 데이터가 없다.");
			url="/index.jsp";
			
		}else {			
			System.out.println("조회 데이터가 있다.");
			request.setAttribute("member", member);
			url="/memberView.jsp";
		}
		
		request.setAttribute("url", url);
		
		
		
		
		
		
	}
}
