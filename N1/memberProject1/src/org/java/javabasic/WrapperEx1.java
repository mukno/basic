package org.java.javabasic;

public class WrapperEx1 {
	public static void main(String[] args) {
		
		//Wrapper
		//기본타입 값을 직접대입한다.          -직접
		//객체타입은 객체의 주소값을 대입한다.   -간접
		
		//int >> Integer
		//기본타입에서 객체(Wrapper)타입으로 변환
		//"박싱"
		int i=10;
		Integer i2=new Integer(i);//박싱(Wrapper클래스화)
		
		byte b=10;
		Byte b2=new Byte(b);
	}

}
