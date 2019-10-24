package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberIdCheckDO implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ID 찾기");

		Scanner in=new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String userId = in.next();
		
		MemberDAO dao=new MemberDAO();
		int rs=dao.idcheck(userId);
		
		if(rs==1) {
			System.out.println("ID존재");
		}
		else {
			System.out.println("ID없음");
		}
		
		
	}

}
