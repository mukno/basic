package org.java.memberDAO;

import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {

	public MemberDAO() {


		System.out.println("DAO");
	}
	
	public int insert(MemberDTO dto)
	{

		int result=1;
		
		return result;
		
	}
	
	public ArrayList<MemberDTO> selcet(){
		ArrayList<MemberDTO>lists=new ArrayList();
		//데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "21", "s2", 22));
		lists.add(new MemberDTO("m3", "31", "s3", 33));
		lists.add(new MemberDTO("m4", "41", "s4", 44));
		lists.add(new MemberDTO("m5", "51", "s5", 55));
		
		
		return lists;
	}
	
	public int delete(String userId,String userPw)
	{
		int result=0;
		//userId,userPw동시에 일치하면 회원탈퇴 성공(1)실패면 (나머지)
		ArrayList<MemberDTO>lists=new ArrayList();
		//데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "21", "s2", 22));
		lists.add(new MemberDTO("m3", "31", "s3", 33));
		lists.add(new MemberDTO("m4", "41", "s4", 44));
		lists.add(new MemberDTO("m5", "51", "s5", 55));
		
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getUserId().equals(userId))
			{
				if(lists.get(i).getUserPw().equals(userPw))
				{
					result=1;
					break;
				}
			}
		}
		
		
		return result;
	}
	
	public MemberDTO member(String userId) {
		int result=0;
		MemberDTO list=null;
		ArrayList<MemberDTO>lists=new ArrayList();
		//데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "21", "s2", 22));
		lists.add(new MemberDTO("m3", "31", "s3", 33));
		lists.add(new MemberDTO("m4", "41", "s4", 44));
		lists.add(new MemberDTO("m5", "51", "s5", 55));
		
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getUserId().equals(userId))
			{
					list=new MemberDTO(lists.get(i).getUserId(),
							lists.get(i).getUserPw(),
							lists.get(i).getUserName(),
							lists.get(i).getUserAge());
					return list;
					
			}else {
				System.out.println("일치하는 멤버가없습니다.");
			}
		}
		
		return list;
	}
	
	
	public int memberLogin(String userId,String userPw)
	{
		int result = 0;
		ArrayList<MemberDTO>lists=new ArrayList();
		//데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "21", "s2", 22));
		lists.add(new MemberDTO("m3", "31", "s3", 33));
		lists.add(new MemberDTO("m4", "41", "s4", 44));
		lists.add(new MemberDTO("m5", "51", "s5", 55));
		
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getUserId().equals(userId))
			{
				if(lists.get(i).getUserPw().equals(userPw))
				{
					result=1;
					
					return result;
				}else
					result=0;
			}
		}
		return result;
		
	}
	
	public int update(MemberDTO dto)
	{
		int result=0;
		ArrayList<MemberDTO>member=new ArrayList();
		member.add(dto);
		if(member!=null)
		{
			result=1;
			return result;
		}else
		{
			
		
		}
		
		
		return result;
		
	}
	
	
	
	
	
	
	
	
}
