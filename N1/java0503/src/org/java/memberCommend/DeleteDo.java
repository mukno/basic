package org.java.memberCommend;

import java.util.ArrayList;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class DeleteDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		
		
		MemberDAO dao=new MemberDAO();
		System.out.println("삭제 아이디 입력: ");
		String userId=in.next();
		System.out.println("삭제 비밀번호 입력: ");
		String userPw=in.next();
		int del=dao.delete(userId, userPw);
		
		if(del==1)
		{
		ArrayList<MemberDTO>lists=new ArrayList();
		lists.remove(userId);
		lists.remove(userPw);
		
		}else
			System.out.println("아이디 비밀번호가 틀립니다.");
	}

}
