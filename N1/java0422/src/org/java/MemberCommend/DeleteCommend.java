package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class DeleteCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원삭제");
		Scanner in=new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String userID=in.next();
		
		System.out.println("비밀번호 입력: ");
		String userPW=in.next();
		
		MemberDTO member=new MemberDTO();
		member.setUserID(userID);
        member.setUserPW(userPW);
        //userID가 m1이면서 userPW가 1111이면 회원탈퇴 성공
        //아니면 회원 탈퇴 실패
        
        if(member.getUserID().equals("m1")&&member.getUserPW().equals("1111"))
        {
        	System.out.println("회원 탈퇴 성공");
        	
        }else {
        	System.out.println("회원 탈퇴 실패");
        }
        	
        

		
	}

	
}
