package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberUpdateDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원 수정");
        Scanner in=new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String userId = in.next();

		System.out.print("변경 비밀번호 입력: ");
		String userPw = in.next();
		System.out.print("변경 이름 입력: ");
		String userName = in.next();
		System.out.print("변경 나이 입력: ");
		int userAge = in.nextInt();
		
		MemberDAO dao=new MemberDAO();
		
		//싱글톤 
		
		int rs=dao.update(userId, userPw, userName, userAge);
		if(rs==1)
		{
			System.out.println("회원 수정 완료");
		}
		else
			System.out.println("회원 수정 실패");
		
		

	}

}
