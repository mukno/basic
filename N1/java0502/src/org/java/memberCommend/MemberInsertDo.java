package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberInsertDo implements MemberCommend{

	
	public void excuteQueryCommend() {
		System.out.println("ȸ������");
		
		Scanner in=new Scanner(System.in);
		System.out.print("���̵� �Է�: ");
		String userId=in.next();
		System.out.print("��й�ȣ �Է�: ");
		String userPw=in.next();
		System.out.print("�̸� �Է�: ");
		String userName=in.next();
		System.out.print("���� �Է�: ");
		int userAge=in.nextInt();
		
		MemberDAO dao=new MemberDAO();
		boolean rs=dao.insert(userId, userPw, userName, userAge);
		
		
		
		String url="";
		if(rs==true)
		{
			System.out.println("ȸ������ ���� �������� �̵�");
		}else
			System.out.println("ȸ������ ���� �������� �̵�");
	}

}
