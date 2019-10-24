package org.java.RamdaEx;
//인터페이스를 이용해서 추상 메서드 구현
interface parent{
	void son();
}
class MansoMain implements parent{

	@Override
	public void son() {
		System.out.println("오버라이딩");
		
	}
	
}

public class RamdaEx {
	
	
	public static void main(String[] args) {
		MansoMain mal=new MansoMain();
		mal.son();//구현클래스를 이용해서 son구현
		
		//다형성(부모타입의 객체참조변수 자식객체 참조)
		parent p1=new MansoMain();
		p1.son();
		
		//익명클래스  (AnonyMous 어나니머스 =익명)
		//new parent() = ()->
		parent p2=()-> {

				
			};
		parent p3=new parent() {

			@Override
			public void son() {
				// TODO Auto-generated method stub
				
			}
			
		};
			
			
		
	}

}
