package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{


	public void excuteCommend() {

		System.out.println("�α���");
		MemberDAO dao=new MemberDAO();
		System.out.print("���̵� �Է�: ");
		String userId=in.next();
		System.out.print("��й�ȣ �Է�: ");
		String userPw=in.next();
		
		int result=dao.memberLogin(userId, userPw);
		
		if(result==1) {
			System.out.println("�α��� ����");
		}else
			System.out.println("�α��� ����");
		
		
	}

	

}
