package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int num=in.nextInt();
		
		//���ܸ� ó���ϰ� ���α׷� ���� ���� �� ���� (�ڵ带 ��� �����Ѵ�)
		try {
			System.out.print("������ �Է�: ");
			int div=in.nextInt(); //0�Է½� ���ܹ߻�
			System.out.println(num/div);
				
		}catch(ArithmeticException e){ //������ 0���� ���������� ����ó��
			e.printStackTrace(); //�ֿܼ� ���� ���� ǥ��
			System.out.println("���ܸ޽���: "+e.getMessage());
			System.out.println("���� �߻��� ����");
			
			
		}finally {
			System.out.println("���� ������ ������� ����(ó��)");
		}
		
		
		System.out.println("���α׷����� ����");
		
	}

}
