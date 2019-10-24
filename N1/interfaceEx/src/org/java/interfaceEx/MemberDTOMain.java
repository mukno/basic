package org.java.interfaceEx;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class MemberDTOMain {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		MemberDTO member1=new MemberDTO();


		

		//member2 객체 생성
		
//		MemberDTO member2=new MemberDTO();
//		member2.setUserID("m2");
//		member2.setUserPW("2222");
//		member2.setUserNAME("s2");
//		member2.setUserAGE(51);
//		
//		System.out.print("아이디: "+member2.getUserID()+", ");
//		System.out.print("아이디: "+member2.getUserPW()+", ");
//		System.out.print("아이디: "+member2.getUserNAME()+", ");
//		System.out.print("아이디: "+member2.getUserAGE()+", ");
//		
		boolean bool=false;
		while(!bool)
		{
			System.out.print("쿼리문을 입력: ");
			String rs=n.next();
			
			
			if(rs.contentEquals("exit")) {
				bool=true;
			}else if(rs.contentEquals("insert")) {
				System.out.print("ID입력 : ");
				member1.setUserID(n.next());
				System.out.print("PW입력 : ");
				member1.setUserPW(n.next());
				System.out.print("NAME입력 : ");
				member1.setUserNAME(n.next());
				System.out.print("AGE입력 : ");
				member1.setUserAGE(n.nextInt());
				break;
				
			}
			
			
		}

		System.out.println("아이디: "+member1.getUserID());
		System.out.println("아이디: "+member1.getUserPW());
		System.out.println("아이디: "+member1.getUserNAME());
		System.out.println("아이디: "+member1.getUserAGE());
	
	}

}
