package org.java.MemberCommend;

import org.java.MemberDTO.MemberDTO;

public class SelectCommend extends ActionQueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ����ȸ");
		
		MemberDTO member=new MemberDTO("m1","1111","s1",11);
		System.out.println("���̵�: "+member.getUserID());
		System.out.println("��й�ȣ: "+member.getUserPW());
		System.out.println("�̸�: "+member.getUserNAME());
		System.out.println("����: "+member.getUserAGE());
		
	}

	
}
