package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class DeleteCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ������");
		Scanner in=new Scanner(System.in);
		System.out.println("���̵� �Է�: ");
		String userID=in.next();
		
		System.out.println("��й�ȣ �Է�: ");
		String userPW=in.next();
		
		MemberDTO member=new MemberDTO();
		member.setUserID(userID);
        member.setUserPW(userPW);
        //userID�� m1�̸鼭 userPW�� 1111�̸� ȸ��Ż�� ����
        //�ƴϸ� ȸ�� Ż�� ����
        
        if(member.getUserID().equals("m1")&&member.getUserPW().equals("1111"))
        {
        	System.out.println("ȸ�� Ż�� ����");
        	
        }else {
        	System.out.println("ȸ�� Ż�� ����");
        }
        	
        

		
	}

	
}
