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
			System.out.println("ȸ�����Լ���");
			rs=true;
		}else
		{
			System.out.println("ȸ�����Խ���");
			rs=false;
		}
		
		return rs;
		
	}
	//ȸ�� ����
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
			System.out.println("ȸ����������");
			rs=true;
		}else
		{
			System.out.println("ȸ����������");
			rs=false;
		}
		
		
		
		
		return rs;
		
	}
	
	
	
}
