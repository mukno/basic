package org.web.membercommend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberdao.MemberDao;
import org.web.memberdto.MemberDto;

public class memberView implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId=request.getParameter("userId");
		
		System.out.println("1111111");
		
		PrintWriter out=response.getWriter();
		System.out.println(getString(userId));
		out.write(getString(userId));
		System.out.println("2222222");
		out.flush();
			
		
	}
	
	public String getString(String userId) {
		
		MemberDao dao=MemberDao.getInstance();
		MemberDto dto=dao.memberView(userId);
		if(dto==null) {
			String srtqq="{ \"userId\" : \"null\" }";
			return srtqq;
 		}
		
		String str="";
		str="{\"userId\":\""+dto.getUserId()+"\","+
				"\"userPw\":\""+dto.getUserPw()+"\","+
				"\"userName\":\""+dto.getUserName()+"\"}";
		
		return str;
	}

	
}
