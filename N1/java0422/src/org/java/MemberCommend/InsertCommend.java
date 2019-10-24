package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class InsertCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner p=new Scanner(System.in);
		System.out.print("아이디입력: ");
		String userID=p.next();

		System.out.print("비밀번호입력: ");
		String userPW=p.next();
		
        System.out.print("이름입력: ");
		String userNAME=p.next();
		
		System.out.print("나이입력: ");
		int userAGE=p.nextInt();
		
		
		MemberDTO member=new MemberDTO(userID, userPW, userNAME, userAGE);
		
		System.out.print("아이디: "+member.getUserID()+",");
		System.out.print("비밀번호: "+member.getUserPW()+",");
		System.out.print("이름: "+member.getUserNAME()+",");
		System.out.print("나이: "+member.getUserAGE()+",");
		
				
				
	}

	
}
