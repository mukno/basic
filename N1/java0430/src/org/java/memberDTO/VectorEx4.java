package org.java.memberDTO;

import java.util.Vector;

public class VectorEx4 {
	
	
	public static void main(String[] args) {
		
		
		Vector<MemberDTO> members=new Vector();
		
		members.add(new MemberDTO("m1","1111","s1",10));
		members.add(new MemberDTO("m2","2222","s2",20));
		members.add(new MemberDTO("m3","3333","s3",30));
		members.add(new MemberDTO("m4","4444","s4",40));
		members.add(new MemberDTO("m5","5555","s5",50));
		
		
		System.out.println(members.size());
		//members������ ��Ҹ� ��� for��
		for(int i=0;i<members.size();i++)
		{
			System.out.println("���̵�: "+members.get(i).getUserId());
			System.out.println("��й�ȣ: "+members.get(i).getUserPw());
			System.out.println("�̸�: "+members.get(i).getUserName());
			System.out.println("����: "+members.get(i).getUserAge());
			
		}
		//members������ ��Ҹ� foreach������ ���
		for(MemberDTO a:members)
		{
			System.out.println("���̵�d: "+a.getUserId());
			System.out.println("��й�ȣd: "+a.getUserPw());
			System.out.println("�̸�d: "+a.getUserName());
			System.out.println("����d: "+a.getUserAge());
		}
		
		
		
		
		
	}

}
