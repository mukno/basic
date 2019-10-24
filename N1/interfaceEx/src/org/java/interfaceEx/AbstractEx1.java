package org.java.interfaceEx;

public abstract class AbstractEx1 {

	public String name;
	private String id;
	
	public void instancMethod() {
		System.out.println("인스턴스 메서드");
	}
	//추상메서드가 있는 클래스
	//선언부만 있고 구현부가 없는 메서드
	public abstract void excuteQuery();

}
