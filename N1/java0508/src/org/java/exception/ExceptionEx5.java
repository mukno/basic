package org.java.exception;

import java.util.Scanner;

public class ExceptionEx5 {
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int num=in.nextInt();
		int[] arrInt=new int[5];
		//���ܸ� ó���ϰ� ���α׷� ���� ���� �� ���� (�ڵ带 ��� �����Ѵ�)
		try {
			System.out.print("������ �Է�: ");
			int div=in.nextInt(); //0�Է½� ���ܹ߻�
			System.out.println(num/div);
			
			for(int i=0;i<6;i++)
			{
				arrInt[i]=i;
			}
			
				
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		catch(ArithmeticException e){ //������ 0���� ���������� ����ó��
			e.printStackTrace(); //�ֿܼ� ���� ���� ǥ��
			System.out.println("���ܸ޽���: "+e.getMessage());
			System.out.println("���� �߻��� ����");
		
			
		}
		catch(Exception e) {//��� ���ܸ� ó���Ѵ� �׷��� ��� ���� �� Ȯ���ؾ��ؼ� �ð�����
			e.printStackTrace();
		}
		//catch ������ �߿��ϴ�
		//������ Exception���� ���� ó�� �Ұ�� �� �ʿ䰡������
		//Exception �Ʒ��δ� catch������ ����ó�� �ۼ� �Ұ���
		
		
		finally {
			System.out.println("���� ������ ������� ����(ó��)");
		}
		
		
		System.out.println("���α׷����� ����");
		
	}

}
