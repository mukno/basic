package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberUpdateDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� ����");
        Scanner in=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId = in.next();

		System.out.print("���� ��й�ȣ �Է�: ");
		String userPw = in.next();
		System.out.print("���� �̸� �Է�: ");
		String userName = in.next();
		System.out.print("���� ���� �Է�: ");
		int userAge = in.nextInt();
		
		MemberDAO dao=new MemberDAO();
		
		//�̱��� 
		
		int rs=dao.update(userId, userPw, userName, userAge);
		if(rs==1)
		{
			System.out.println("ȸ�� ���� �Ϸ�");
		}
		else
			System.out.println("ȸ�� ���� ����");
		
		

	}

}
