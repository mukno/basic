package org.java.interfaceEx;

public class interfaceEx1 {

	
	public static void main(String[] args) {
		//구현클래스를 통해서 인터페이스를 구현
		interfaceSubClass iClass1=new interfaceSubClass();
		iClass1.excuteQuery();
		iClass1.excuteQuery2();
		
	
		//추상클래스화 시킨 후에 구현클래스를 이용해서 구현
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
