package org.java.MemberCommend;

import org.java.MemberDTO.MemberDTO;

public class SelectCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		MemberDTO member=new MemberDTO("m1","1111","s1",11);
		System.out.println("아이디: "+member.getUserID());
		System.out.println("비밀번호: "+member.getUserPW());
		System.out.println("이름: "+member.getUserNAME());
		System.out.println("나이: "+member.getUserAGE());
		
	}

	
}
