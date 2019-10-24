package org.java.collectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.java.memberDTO.MemberDTO;

public class VectorEx1 {
	
	public static void main(String[] args) {
		
		Vector<MemberDTO> members=new Vector();
		
		members.add(new MemberDTO("m1","11","s1",11));
		members.add(new MemberDTO("m2","22","s2",22));
		members.add(new MemberDTO("m3","33","s3",33));
		members.add(new MemberDTO("m4","44","s4",44));
		members.add(new MemberDTO());
		
		
		//Scanner�� �̿��ؼ� MemberDTO �ʵ� �ѹ��� 
		//�ֿܼ��� ���� �Է��ϰ� Vector members�� ��� ��� Iterator�� �̿��ؼ�
		//�ֿܼ� ����غ�����.
		
		Scanner in=new Scanner(System.in);
		System.out.print("ID�Է�: ");
		members.get(4).setUserId(in.next());
		System.out.print("PW�Է�: ");
		members.get(4).setUserPw(in.next());
		System.out.print("NAME�Է�: ");
		members.get(4).setUserName(in.next());
		System.out.print("AGE�Է�: ");
		members.get(4).setUserAge(in.nextInt());
		
		Iterator<MemberDTO> pu=members.iterator();
		
		//Iterator ->�÷���(List) ->Vector,ArrayList Ưȭ
		while(pu.hasNext())
		{
			MemberDTO member=pu.next();//
			System.out.println(member.getUserId());
			System.out.println(member.getUserPw());
			System.out.println(member.getUserName());
			System.out.println(member.getUserAge());
		
			
		}
		
		
	}

}
