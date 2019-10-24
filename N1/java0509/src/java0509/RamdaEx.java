package java0509;

interface InterEx{
	void excuteQuery();
}

class B implements InterEx{

	@Override
	public void excuteQuery() {
		System.out.println("구현객체 오버라이드");
		
	}
	
}


public class RamdaEx {
	
	public static void main(String[] args) {
		//구현객체
		InterEx i1=new B();
		i1.excuteQuery();
		//1. 익명클래스로 오버라이드
		//인터페이스 타입변수=new 인터페이스(구현클래스){//오버라이드메서드;};
		InterEx a=new InterEx() {

			@Override
			public void excuteQuery() {
			    System.out.println("익명클래스 구현");
				
			}
			
		};
		a.excuteQuery();
		
		//2.람다식으로 구현
		a=()->{
			System.out.println("람다식으로 구현");
			
		};
		InterEx c=()->{
			System.out.println("람다식으로 구현");
		};
		a.excuteQuery();
		c.excuteQuery();
		
		//3.메서드화 >>@FunctionalInterface
		in i=b->{
			System.out.println("함수적 메서드 구현"+b);
		};
	}
	@FunctionalInterface
	interface in{
		void son(int a);
	}

}
