package org.web.memberCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogOutDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("·Î±×¾Æ¿ô ");
		
		HttpSession session=request.getSession();
		if(session!=null)
			session.invalidate();
		
		
		
	}
	
	

}
