package org.java.collectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.java.memberDTO.MemberDTO;

public class VectorEx1 {
	
	public static void main(String[] args) {
		
		Vector<MemberDTO> members=new Vector();
		
		members.add(new MemberDTO("m1","11","s1",11));
		members.add(new MemberDTO("m2","22","s2",22));
		members.add(new MemberDTO("m3","33","s3",33));
		members.add(new MemberDTO("m4","44","s4",44));
		members.add(new MemberDTO());
		
		
		//Scanner를 이용해서 MemberDTO 필드 한번만 
		//콘솔에서 각각 입력하고 Vector members의 모든 요소 Iterator를 이용해서
		//콘솔에 출력해보세요.
		
		Scanner in=new Scanner(System.in);
		System.out.print("ID입력: ");
		members.get(4).setUserId(in.next());
		System.out.print("PW입력: ");
		members.get(4).setUserPw(in.next());
		System.out.print("NAME입력: ");
		members.get(4).setUserName(in.next());
		System.out.print("AGE입력: ");
		members.get(4).setUserAge(in.nextInt());
		
		Iterator<MemberDTO> pu=members.iterator();
		
		//Iterator ->컬렉션(List) ->Vector,ArrayList 특화
		while(pu.hasNext())
		{
			MemberDTO member=pu.next();//
			System.out.println(member.getUserId());
			System.out.println(member.getUserPw());
			System.out.println(member.getUserName());
			System.out.println(member.getUserAge());
		
			
		}
		
		
	}

}
