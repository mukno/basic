package org.java.memberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class SelectDo implements QueryCommend{

	@Override
	public void excuteCommend() {


		MemberDAO dao=new MemberDAO();
		
		
		ArrayList<MemberDTO> lists= dao.selcet();
		//��ȯ���� null�̸� �����ͺ��̽� ������ ����
		//��ȯ���� null�� �ƴϸ� ArrayList�� ������ Iterator�� �ܼ�ü ���
		
		if(lists==null)
		{
			
		}else
		{
			Iterator<MemberDTO> iterator1=lists.iterator();
		
			while(iterator1.hasNext())
			{
			MemberDTO a=iterator1.next();
			System.out.println("���̵�: "+a.getUserId());
			System.out.println("��й�ȣ: "+a.getUserPw());
			System.out.println("�̸�: "+a.getUserName());
			System.out.println("����: "+a.getUserAge());
			}
		
			
			
		}
		
		
		
		
		
		
	}

}
