package org.java.Ramda;

@FunctionalInterface
interface interfaceEx1{
	void abMethod(int c);
	
	
}

interface sub22{
	void son2();
}

interface sub33{
	void son3(int a,int b);
}




public class RamdaEx1 {

	public static void main(String[] args) {
		
		//익명클래스
		interfaceEx1 a=new interfaceEx1() {

			
			public void abMethod(int r) {
			
				System.out.println("오버라이드 메서드"+r);
			}

				
		
			
			
		};
		a.abMethod(1);
		
		
		interfaceEx1 b;
		
		//람다식
		b=(p)->{
			System.out.println("오버라이드 메서드"+p);
		};
		
		sub22 q;
		//한줄코드일경우 이렇게 생략가능
		q=()->System.out.println("오버라이드 메서드");
		
		//람다식 호출
		b.abMethod(3);
		q.son2();
		
		
		sub33 sub3;
		sub3=(r,e)->System.out.println(r+e);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
