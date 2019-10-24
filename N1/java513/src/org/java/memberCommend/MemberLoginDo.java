package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {

		System.out.println("로그인");
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String userId = in.next();

		System.out.print("비밀번호 입력: ");
		String userPw = in.next();
		
		MemberDAO dao=new MemberDAO();
		int rs=dao.login(userId, userPw);
		if(rs==1)
		{
			System.out.println("로그인 완료");
		}else
			System.out.println("로그인 실패");
		


		
		
	}

}
