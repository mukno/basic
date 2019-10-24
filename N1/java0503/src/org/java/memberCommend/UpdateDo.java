package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class UpdateDo implements QueryCommend{

	
	public void excuteCommend() {
	
		System.out.println("회원수정");
		//로그인 이후 데이터베ㅣㅇ스의 아이디로 조회하고
		//데이터를 get한 후에 수정..
		MemberDAO dao=new MemberDAO();
		
		System.out.print("아이디 입력: ");
		String userId=in.next();
		MemberDTO list=dao.member(userId);
		
		if(list!=null) {
			System.out.println("회원 수정 작업 진행");
		}else
			System.out.println("회원 수정 작업 실패");
		
		
	}

}
