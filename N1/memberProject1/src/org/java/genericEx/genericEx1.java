package org.java.genericEx;

class A{
	int a;
	int b;
	
	public int aMethod(int a) {
		return a;
	}
}

class B{
	String a;
	String b;
	
	public String aMethod(String a) {
		return a;
	}
	
}
class Generic1<T>{
	T a;
	T b;
	
	public T aMethod(T a) {
		return a;
	}
}

public class genericEx1 {
	public static void main(String[] args) {
		A a=new A();
		a.a=10;
		a.b=20;
		a.aMethod(100);
		B b=new B();
		b.a="10";
		b.b="20";
		b.aMethod("100");
		
		Generic1<String> g1=new Generic1<String>();
		g1.a="10";
		g1.b="20";
		g1.aMethod("10");
		Generic1<Integer> g2=new Generic1();
		g2.a=10;
		g2.b=20;
		g2.aMethod(100);
		
	}

}
