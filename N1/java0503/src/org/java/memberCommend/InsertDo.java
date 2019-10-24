package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class InsertDo implements QueryCommend{

	
	public void excuteCommend() {


		MemberDAO dao=new MemberDAO();
		System.out.print("아이디 입력: ");
		String userId=in.next();
		System.out.print("비밀번호 입력: ");
		String userPw=in.next();
		System.out.print("이름 입력: ");
		String userName=in.next();
		System.out.print("아이디 입력: ");
		int userAge=in.nextInt();
		
		MemberDTO dto=new MemberDTO(userId, userPw, userName, userAge);
		
		
		
		int result=dao.insert(dto);
		//회원가입 성공1
		//회원가입실패 나머지
		
		if(result==1)
		{
			System.out.println("회원가입 성공");
			
		}else
			System.out.println("회원가입 실패");
		//
		
		
		
		
	}

}
