package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class UpdateDo implements QueryCommend{

	
	public void excuteCommend() {
	
		System.out.println("ȸ������");
		//�α��� ���� �����ͺ��Ӥ����� ���̵�� ��ȸ�ϰ�
		//�����͸� get�� �Ŀ� ����..
		MemberDAO dao=new MemberDAO();
		
		System.out.print("���̵� �Է�: ");
		String userId=in.next();
		MemberDTO list=dao.member(userId);
		
		if(list!=null) {
			System.out.println("ȸ�� ���� �۾� ����");
		}else
			System.out.println("ȸ�� ���� �۾� ����");
		
		
	}

}
