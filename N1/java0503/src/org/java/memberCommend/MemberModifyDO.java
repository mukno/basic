package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class MemberModifyDO implements QueryCommend{

	@Override
	public void excuteCommend() {
		
		System.out.println("회원수정");
		
		//userid,userpw,username,userage
		//scanner을 이용해서 입력하고
		//memberdao에 update메서드를 구현하시오
		//memberdto이용
		//변환값1이면 회원수정 성공
		//변환값이 1이 아니면 회원 수정 실패 콘솔에 표시
		

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
		int a=dao.update(dto);
		
		if(a==1)
		{
			System.out.println("회원수정성공");
		}else
			System.out.println("회원 수정 실패");
		
	}
	

}
