package org.java.interfaceEx;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class MemberDTOMain {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		MemberDTO member1=new MemberDTO();


		

		//member2 ��ü ����
		
//		MemberDTO member2=new MemberDTO();
//		member2.setUserID("m2");
//		member2.setUserPW("2222");
//		member2.setUserNAME("s2");
//		member2.setUserAGE(51);
//		
//		System.out.print("���̵�: "+member2.getUserID()+", ");
//		System.out.print("���̵�: "+member2.getUserPW()+", ");
//		System.out.print("���̵�: "+member2.getUserNAME()+", ");
//		System.out.print("���̵�: "+member2.getUserAGE()+", ");
//		
		boolean bool=false;
		while(!bool)
		{
			System.out.print("�������� �Է�: ");
			String rs=n.next();
			
			
			if(rs.contentEquals("exit")) {
				bool=true;
			}else if(rs.contentEquals("insert")) {
				System.out.print("ID�Է� : ");
				member1.setUserID(n.next());
				System.out.print("PW�Է� : ");
				member1.setUserPW(n.next());
				System.out.print("NAME�Է� : ");
				member1.setUserNAME(n.next());
				System.out.print("AGE�Է� : ");
				member1.setUserAGE(n.nextInt());
				break;
				
			}
			
			
		}

		System.out.println("���̵�: "+member1.getUserID());
		System.out.println("���̵�: "+member1.getUserPW());
		System.out.println("���̵�: "+member1.getUserNAME());
		System.out.println("���̵�: "+member1.getUserAGE());
	
	}

}
