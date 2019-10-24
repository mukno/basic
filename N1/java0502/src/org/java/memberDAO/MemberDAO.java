package org.java.memberDAO;

import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	public MemberDAO() {
	
		System.out.println("DAO");
	}

	
	public boolean insert(String userId, String userPw,String userName,int userAge)
	{
		boolean rs=false;
		
		ArrayList<MemberDTO> member=new ArrayList();
		member.add(new MemberDTO(userId,userPw,userName,userAge));
		if(member.get(0)!=null)
		{
			System.out.println("회원가입성공");
			rs=true;
		}else
		{
			System.out.println("회원가입실패");
			rs=false;
		}
		
		return rs;
		
	}
	//회원 수정
	public boolean update(MemberDTO member)
	{
		boolean rs=false;
		
		ArrayList<MemberDTO> memberArr=new ArrayList();
		memberArr.add(new MemberDTO(
				member.getUserId(),
				member.getUserPw(), 
				member.getUserName(), 
                member.getUserAge())
				);
		if(memberArr.get(0)!=null)
		{
			System.out.println("회원수정성공");
			rs=true;
		}else
		{
			System.out.println("회원수정실패");
			rs=false;
		}
		
		
		
		
		return rs;
		
	}
	
	
	
}
