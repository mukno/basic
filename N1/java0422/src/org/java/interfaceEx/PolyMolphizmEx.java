package org.java.interfaceEx;

class A{
	public int a;
	public int b;
}
class B extends A{
	public int c;
	public int d;
}
class C extends B{
	public int e;
	public int f;
	
}

public class PolyMolphizmEx {

	public static void main(String[] args) {
		//�θ�͸� ���δ�
		A a=new A();
		a.a=10;
		a.b=20;
		//��ӹ��� �θ���̶� ���̺��δ�
		B b=new B();
		b.a=10;
		b.b=20;
		b.c=30;
		b.d=40;
		//�ٺ��δ�.
		C c=new C();
		c.a=10;
		c.b=20;
		c.c=30;
		c.d=40;
		c.e=50;
		c.f=60;
		//A�����δ�.
		A a1=new B();
		a1.a=10;
		a1.b=20;
		//A�����δ�.
		A a2=new C();
		a2.a=10;
		a2.b=20;
		
		
		
		
		
	}
	
}
