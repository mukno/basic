package Commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import DAO.MemberDAO;

public class loginDo implements MemberCommend{
	

	
	
	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	String userId=request.getParameter("userId");
	String userPw=request.getParameter("userPw");		
	
	MemberDAO dao=MemberDAO.getInstance();
	
	int rs=dao.login(userId,userPw);//�α��� �����ϸ� 1
	
	

	HttpSession session=request.getSession();//���� ����
	
	String url="";
	
	if(rs==1) {
		
		session.setAttribute("sessionId", userId);
		session.setMaxInactiveInterval(60*10);
		
		url="/index.jsp";
		System.out.println("�α��� OK");
		
	}else {
		url="/fail.jsp";
		System.out.println("�α��� NO");
	}
	
	request.setAttribute("url", url);
	
	
	
}
	}
