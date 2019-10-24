package org.java.javabasic;

public class MathEx {
	public static void main(String[] args) {
		//math의 모든 메서드는 static이다 (클래스맴버)
		System.out.println(Math.max(1, 100));
		//static(클래스맴버) 클래스이름.맴버
		System.out.println(Math.min(1.1, 255.3));//최솟값
		System.out.println(Math.abs(-100));//절대값
		
		System.out.println(Math.ceil(11.2));//올림
		System.out.println(Math.floor(11.2));//내림
		
		System.out.println(Math.round(11.2));//반올림
		System.out.println(Math.round(11.5));//반올림
		
		System.out.println(Math.PI);//원주율
		
		
		
		}

}
