package org.java.javaBasic;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//�ֿܼ� �Է���
		//Actioninsert.do
		//update.do
		//MemberDelete.do
		//Select.do
		
		Scanner in=new Scanner(System.in);
		
		String clientURL=in.next();
		
		//substring subSequence�� ����
		//abcd ���� ���ڿ��� 
		//substring �޼���� ab�� ���������� abd�� ���������ʴ´� .(String=Ŭ����)
		clientURL.substring(0,clientURL.length()-3);
		//subSequence �޼���� ab�� �����ϰ� abd�� �����Ѵ�.(charSequence=�������̽�)
		clientURL.subSequence(0, clientURL.length()-3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
