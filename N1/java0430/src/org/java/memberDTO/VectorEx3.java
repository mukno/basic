package org.java.memberDTO;

import java.util.Vector;

public class VectorEx3 {
	public static void main(String[] args) {
		
		Vector<MemberDTO> members=new Vector<MemberDTO>();
		
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		
		//�Ʒ��� ����
		//MemberDTO m1=new MemberDTO();
		//members.add(m1);
		
		
		//Vector0��° ����� �ɹ��� set
		members.get(0).setUserId("m1");
		members.get(0).setUserPw("11111");
		members.get(0).setUserName("s1");
		members.get(0).setUserAge(10);//�ڵ��ڽ�
		
		String userId=members.get(0).getUserId();
		String userPw=members.get(0).getUserPw();
		String userName=members.get(0).getUserName();
		int userAge=members.get(0).getUserAge();
		
		System.out.println("���̵�: "+userId);
		System.out.println("��й�ȣ: "+userPw);
		System.out.println("�̸�: "+userName);
		System.out.println("����: " +userAge);
		
		//members.get(1)��Ҹ� setters,getters�� �̿��ؼ�
		//�����ʵ带 ��� �ʱ�ȭ(���ǰ����� )�ϰ� �ֿܼ� ���
		members.get(1).setUserId("m2");
		members.get(1).setUserPw("2222");
		members.get(1).setUserName("s2");
		members.get(1).setUserAge(20);//�ڵ��ڽ�
		
		userId=members.get(1).getUserId();
		userPw=members.get(1).getUserPw();
		userName=members.get(1).getUserName();
		userAge=members.get(1).getUserAge();
		
		System.out.println("���̵�: "+userId);
		System.out.println("��й�ȣ: "+userPw);
		System.out.println("�̸�: "+userName);
		System.out.println("����: " +userAge);
		
		
		
		
	}

}
