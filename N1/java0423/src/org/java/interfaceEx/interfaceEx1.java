package org.java.interfaceEx;

public class interfaceEx1 {

	
	public static void main(String[] args) {
		//����Ŭ������ ���ؼ� �������̽��� ����
		interfaceSubClass iClass1=new interfaceSubClass();
		iClass1.excuteQuery();
		iClass1.excuteQuery2();
		
	
		//�߻�Ŭ����ȭ ��Ų �Ŀ� ����Ŭ������ �̿��ؼ� ����
		interfaceSubClass2Sub iClass2=new interfaceSubClass2Sub();
		iClass2.excuteQuery();
		iClass2.excuteQuery2();
		iClass2.excuteQuery3();
		iClass2.instanceEx();
		
		
		interfaceSub2 in=new interfaceSub2() {

			
			public void excuteQuery2() {
				// TODO Auto-generated method stub
				
			}

		
			public void excuteQuery() {
				// TODO Auto-generated method stub
				
			}
			
		};
	
	}
}
