package org.java.memberCommend;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class MemberModifyDO implements QueryCommend{

	@Override
	public void excuteCommend() {
		
		System.out.println("ȸ������");
		
		//userid,userpw,username,userage
		//scanner�� �̿��ؼ� �Է��ϰ�
		//memberdao�� update�޼��带 �����Ͻÿ�
		//memberdto�̿�
		//��ȯ��1�̸� ȸ������ ����
		//��ȯ���� 1�� �ƴϸ� ȸ�� ���� ���� �ֿܼ� ǥ��
		

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
		int a=dao.update(dto);
		
		if(a==1)
		{
			System.out.println("ȸ����������");
		}else
			System.out.println("ȸ�� ���� ����");
		
	}
	

}
