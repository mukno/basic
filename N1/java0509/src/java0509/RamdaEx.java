package java0509;

interface InterEx{
	void excuteQuery();
}

class B implements InterEx{

	@Override
	public void excuteQuery() {
		System.out.println("������ü �������̵�");
		
	}
	
}


public class RamdaEx {
	
	public static void main(String[] args) {
		//������ü
		InterEx i1=new B();
		i1.excuteQuery();
		//1. �͸�Ŭ������ �������̵�
		//�������̽� Ÿ�Ժ���=new �������̽�(����Ŭ����){//�������̵�޼���;};
		InterEx a=new InterEx() {

			@Override
			public void excuteQuery() {
			    System.out.println("�͸�Ŭ���� ����");
				
			}
			
		};
		a.excuteQuery();
		
		//2.���ٽ����� ����
		a=()->{
			System.out.println("���ٽ����� ����");
			
		};
		InterEx c=()->{
			System.out.println("���ٽ����� ����");
		};
		a.excuteQuery();
		c.excuteQuery();
		
		//3.�޼���ȭ >>@FunctionalInterface
		in i=b->{
			System.out.println("�Լ��� �޼��� ����"+b);
		};
	}
	@FunctionalInterface
	interface in{
		void son(int a);
	}

}
