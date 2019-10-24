package after;

public class PolyEx2 {
	
	public static void main(String[] args) {
		
	//부모 타입=new 자식()
	//부모 타입으로 선언된 변수가 접근할 수 있는 범위는
	//부모 타입이 가지고 이는 맴버 변수나 메소드로 제한됨
	//단,오버라이딩이 디어 있다면 자식 메소드가 수행됨.
		
		Parent p1=new Child();
		
		System.out.println(p1.x);
		p1.method();
		Child c1=(Child) p1;
		System.out.println(c1.y);
		c1.method2();
		
		//java.lang.ClassCastException
		Child c2=(Child)new Parent();
		
		
		
		
	}

}
