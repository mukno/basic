package org.java.Ramda;

@FunctionalInterface
interface interfaceEx1{
	void abMethod(int c);
	
	
}

interface sub22{
	void son2();
}

interface sub33{
	void son3(int a,int b);
}




public class RamdaEx1 {

	public static void main(String[] args) {
		
		//�͸�Ŭ����
		interfaceEx1 a=new interfaceEx1() {

			
			public void abMethod(int r) {
			
				System.out.println("�������̵� �޼���"+r);
			}

				
		
			
			
		};
		a.abMethod(1);
		
		
		interfaceEx1 b;
		
		//���ٽ�
		b=(p)->{
			System.out.println("�������̵� �޼���"+p);
		};
		
		sub22 q;
		//�����ڵ��ϰ�� �̷��� ��������
		q=()->System.out.println("�������̵� �޼���");
		
		//���ٽ� ȣ��
		b.abMethod(3);
		q.son2();
		
		
		sub33 sub3;
		sub3=(r,e)->System.out.println(r+e);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
