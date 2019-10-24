package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class UpdateCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원수정");
		Scanner in=new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String userID=in.next();
		System.out.print("비밀번호 입력: ");
		String userPW=in.next();
		System.out.print("이름 입력: ");
		String userNAME=in.next();
		System.out.print("나이 입력: ");
		int userAGE=in.nextInt();
		
		MemberDTO member=new MemberDTO();
		member.setUserID(userID);
		member.setUserPW(userPW);
		member.setUserNAME(userNAME);
		member.setUserAGE(userAGE);
		
		System.out.println("아이디: "+member.getUserID()+",");
		System.out.println("비밀번호: "+member.getUserPW()+",");
		System.out.println("이름: "+member.getUserNAME()+",");
		System.out.println("나이: "+member.getUserAGE()+",");
		
		
		
		
	}

	
}
