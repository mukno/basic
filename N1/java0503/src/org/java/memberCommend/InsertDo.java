package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class InsertDo implements QueryCommend{

	
	public void excuteCommend() {


		MemberDAO dao=new MemberDAO();
		System.out.print("���̵� �Է�: ");
		String userId=in.next();
		System.out.print("��й�ȣ �Է�: ");
		String userPw=in.next();
		System.out.print("�̸� �Է�: ");
		String userName=in.next();
		System.out.print("���̵� �Է�: ");
		int userAge=in.nextInt();
		
		MemberDTO dto=new MemberDTO(userId, userPw, userName, userAge);
		
		
		
		int result=dao.insert(dto);
		//ȸ������ ����1
		//ȸ�����Խ��� ������
		
		if(result==1)
		{
			System.out.println("ȸ������ ����");
			
		}else
			System.out.println("ȸ������ ����");
		//
		
		
		
		
	}

}
