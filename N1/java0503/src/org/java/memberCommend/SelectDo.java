package org.java.memberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class SelectDo implements QueryCommend{

	@Override
	public void excuteCommend() {


		MemberDAO dao=new MemberDAO();
		
		
		ArrayList<MemberDTO> lists= dao.selcet();
		//반환값이 null이면 데이터베이스 정보가 없고
		//반환값이 null이 아니면 ArrayList의 정보를 Iterator로 콘솔체 출력
		
		if(lists==null)
		{
			
		}else
		{
			Iterator<MemberDTO> iterator1=lists.iterator();
		
			while(iterator1.hasNext())
			{
			MemberDTO a=iterator1.next();
			System.out.println("아이디: "+a.getUserId());
			System.out.println("비밀번호: "+a.getUserPw());
			System.out.println("이름: "+a.getUserName());
			System.out.println("나이: "+a.getUserAge());
			}
		
			
			
		}
		
		
		
		
		
		
	}

}
