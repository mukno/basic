package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberIdCheckDO implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ID ã��");

		Scanner in=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId = in.next();
		
		MemberDAO dao=new MemberDAO();
		int rs=dao.idcheck(userId);
		
		if(rs==1) {
			System.out.println("ID����");
		}
		else {
			System.out.println("ID����");
		}
		
		
	}

}
