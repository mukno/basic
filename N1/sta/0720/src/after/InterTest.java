package after;

public interface InterTest {
	//상수만가능(final 자동으로 붙음)
	String str="dd";
	public void print();
	
	
	//java8추가된 default 메소드
	public default void print2() {
		
	}
	
	//java8추가된 static 메소드
	public static void print3() {
		
	}
	
	

}
