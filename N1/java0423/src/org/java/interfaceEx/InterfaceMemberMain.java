package org.java.interfaceEx;

public class InterfaceMemberMain {

	public static void main(String[] args) {
		
		
		//�������̽��� �͸�Ŭ������ ���θ޼��忡�� ������ ����
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
