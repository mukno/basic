package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("�Է¿���");
		
		//�ֿܼ� ������ �Է��Ͽ� �ֿܼ� ���
		//�Է�Ÿ�԰� scanner�Ǹ޼���� ����
		
		Scanner in=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		
		try {
			int a=in.nextInt();
			System.out.println(a);
			
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("���α׷� ���� ����");
		
		
		
	}

}
