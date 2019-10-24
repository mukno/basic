package org.java.memberDTO;

import java.util.Vector;

public class VectorEx4 {
	
	
	public static void main(String[] args) {
		
		
		Vector<MemberDTO> members=new Vector();
		
		members.add(new MemberDTO("m1","1111","s1",10));
		members.add(new MemberDTO("m2","2222","s2",20));
		members.add(new MemberDTO("m3","3333","s3",30));
		members.add(new MemberDTO("m4","4444","s4",40));
		members.add(new MemberDTO("m5","5555","s5",50));
		
		
		System.out.println(members.size());
		//members각각의 요소를 출력 for문
		for(int i=0;i<members.size();i++)
		{
			System.out.println("아이디: "+members.get(i).getUserId());
			System.out.println("비밀번호: "+members.get(i).getUserPw());
			System.out.println("이름: "+members.get(i).getUserName());
			System.out.println("나이: "+members.get(i).getUserAge());
			
		}
		//members각각의 요소를 foreach문으로 출력
		for(MemberDTO a:members)
		{
			System.out.println("아이디d: "+a.getUserId());
			System.out.println("비밀번호d: "+a.getUserPw());
			System.out.println("이름d: "+a.getUserName());
			System.out.println("나이d: "+a.getUserAge());
		}
		
		
		
		
		
	}

}
