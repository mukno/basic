package org.java.javabasic;

class PointEx{
	private int num1;
	private int num2;
	public PointEx() {
		// TODO Auto-generated constructor stub
	}
	public PointEx(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return num1+num2+"";
		
	}
	
	
}

class A extends PointEx{

	public A(int a,int b){
		super(a,b);
	}
	
}

public class Object2 {

	public static void main(String[] args) {
		
		PointEx p1=new PointEx(100,200);
		System.out.println(p1.toString());
		A p2=new A(10,20);
		System.out.println(p2.toString());
	}
}
