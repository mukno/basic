package org.java.RamdaEx;
//�������̽��� �̿��ؼ� �߻� �޼��� ����
interface parent{
	void son();
}
class MansoMain implements parent{

	@Override
	public void son() {
		System.out.println("�������̵�");
		
	}
	
}

public class RamdaEx {
	
	
	public static void main(String[] args) {
		MansoMain mal=new MansoMain();
		mal.son();//����Ŭ������ �̿��ؼ� son����
		
		//������(�θ�Ÿ���� ��ü�������� �ڽİ�ü ����)
		parent p1=new MansoMain();
		p1.son();
		
		//�͸�Ŭ����  (AnonyMous ��ϸӽ� =�͸�)
		//new parent() = ()->
		parent p2=()-> {

				
			};
		parent p3=new parent() {

			@Override
			public void son() {
				// TODO Auto-generated method stub
				
			}
			
		};
			
			
		
	}

}
