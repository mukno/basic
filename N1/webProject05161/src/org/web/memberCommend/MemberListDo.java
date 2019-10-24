package org.web.memberCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberDTO.memberDTO;
import org.web.memberdao.MemberDao;

public class MemberListDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원조회");
		
		MemberDao dao=MemberDao.getInstance();
		ArrayList<memberDTO> members=dao.members();
		
		request.setAttribute("members", members);
		
		request.setAttribute("url", "/MemberList.jsp");
	}
	

}
