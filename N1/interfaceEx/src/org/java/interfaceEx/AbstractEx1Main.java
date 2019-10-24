package org.java.interfaceEx;

public class AbstractEx1Main {

	public static void main(String[] args) {
		
		//AbstractEx1 ab1=new AbstractEX1();추상클래스는 객체생성x
//		AbstractEx1Sub2Sub abSub1=new AbstractEx1Sub2Sub();
//		abSub1.excuteQuery();
//		abSub1.excuteQuery2();
		//다형성
		//부모 타입의 객체 참조 변수로 자식객체를 참조
		//부모타입의 객체참조변수는 부모클래스 멤버만 참조
		AbstractEx1 ab1=new AbstractEx1Sub2Sub();
		
		//자식타입의 객체참조변수는 부모,자식클래스 멤버만 모두 참조
		AbstractEx1Sub2Sub ab2=new AbstractEx1Sub2Sub();
		
		

	}

}
