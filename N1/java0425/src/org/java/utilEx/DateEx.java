package org.java.utilEx;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date now=new Date();
		
		System.out.println(now.getDate()); //�� ǥ��
		
		System.out.println(now.getMonth()); //0�� ����
		System.out.println(now.getYear()); //1900�� ����
		
		System.out.println(now.getTime());//1970.1.1 00:00:00
		System.out.println("���� ����: "+now.getDay());//�Ͽ��� 0 5>>�ݿ���
		
		//���� ��¥�� �̿��ؼ� ������ ������ ����غ�����.DateŬ����
		//switch������ 0�̸� �Ͽ��� 1�̸� ��
		//�������� �Է¿���
		
		switch(now.getDay())
		{
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
		default :
		    System.out.println("�Է¿���");
		    break;
		}
		
		
		
	}

}
