package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class UpdateCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ������");
		Scanner in=new Scanner(System.in);
		System.out.print("���̵� �Է�: ");
		String userID=in.next();
		System.out.print("��й�ȣ �Է�: ");
		String userPW=in.next();
		System.out.print("�̸� �Է�: ");
		String userNAME=in.next();
		System.out.print("���� �Է�: ");
		int userAGE=in.nextInt();
		
		MemberDTO member=new MemberDTO();
		member.setUserID(userID);
		member.setUserPW(userPW);
		member.setUserNAME(userNAME);
		member.setUserAGE(userAGE);
		
		System.out.println("���̵�: "+member.getUserID()+",");
		System.out.println("��й�ȣ: "+member.getUserPW()+",");
		System.out.println("�̸�: "+member.getUserNAME()+",");
		System.out.println("����: "+member.getUserAGE()+",");
		
		
		
		
	}

	
}
