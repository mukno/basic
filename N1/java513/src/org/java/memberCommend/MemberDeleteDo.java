package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� ����");

		Scanner in=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId = in.next();
		
		MemberDAO dao=new MemberDAO();
		int rs=dao.delete(userId);
		
		if(rs==1)
		{
			System.out.println("ȸ�� Ż�� ����");
		}
		else
		{
			System.out.println("ȸ�� Ż�� ����");
		}
		

	}

	
	
}
