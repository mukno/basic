package org.java.javabasic;

class ObSub{
	int a;
	int b;
	public void method() {
		System.out.println("ObSub method");
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}


public class ObjectEx {
	public static void main(String[] args) {
		ObSub o1=new ObSub();
		ObSub o2=new ObSub();
		
		System.out.println(o1.getClass());
		System.out.println(o2.getClass());
		
		System.out.println(o2.getClass().getName());//클래스의 패키지 경로
	
		System.out.println(o2.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println(o2.toString());
		System.out.println(o2.toString());
		
		
		
	}
		

}
