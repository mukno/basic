package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class InsertCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ������");
		
		Scanner p=new Scanner(System.in);
		System.out.print("���̵��Է�: ");
		String userID=p.next();

		System.out.print("��й�ȣ�Է�: ");
		String userPW=p.next();
		
        System.out.print("�̸��Է�: ");
		String userNAME=p.next();
		
		System.out.print("�����Է�: ");
		int userAGE=p.nextInt();
		
		
		MemberDTO member=new MemberDTO(userID, userPW, userNAME, userAGE);
		
		System.out.print("���̵�: "+member.getUserID()+",");
		System.out.print("��й�ȣ: "+member.getUserPW()+",");
		System.out.print("�̸�: "+member.getUserNAME()+",");
		System.out.print("����: "+member.getUserAGE()+",");
		
				
				
	}

	
}
