package org.java.interfaceEx;

public class InterfaceMemberMain {

	public static void main(String[] args) {
		
		
		//인터페이스를 익명클래스로 메인메서드에서 구현한 상태
		interfaceMember i1=new interfaceMember() {
			
			@Override
			public void excuteSelect() {
				System.out.println("excuteSelect");
			}
			
			@Override
			public void excuteInsert() {
				System.out.println("excuteInsert");				
			}
			
			@Override
			public void excuteDelete() {
				System.out.println("excuteDelete");				
			}
			
			@Override
			public void excute() {
				System.out.println("excute");				
			}
		};
		
		i1.excute();

	}

}
