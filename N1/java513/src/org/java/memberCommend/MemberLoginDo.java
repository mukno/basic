package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {

		System.out.println("�α���");
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId = in.next();

		System.out.print("��й�ȣ �Է�: ");
		String userPw = in.next();
		
		MemberDAO dao=new MemberDAO();
		int rs=dao.login(userId, userPw);
		if(rs==1)
		{
			System.out.println("�α��� �Ϸ�");
		}else
			System.out.println("�α��� ����");
		


		
		
	}

}
