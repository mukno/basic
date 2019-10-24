package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{


	public void excuteCommend() {

		System.out.println("로그인");
		MemberDAO dao=new MemberDAO();
		System.out.print("아이디 입력: ");
		String userId=in.next();
		System.out.print("비밀번호 입력: ");
		String userPw=in.next();
		
		int result=dao.memberLogin(userId, userPw);
		
		if(result==1) {
			System.out.println("로그인 성공");
		}else
			System.out.println("로그인 실패");
		
		
	}

	

}
