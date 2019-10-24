package org.java.javabasic;

public class WrapperEx1 {
	
	public static void main(String[] args) {
		System.out.println("Wrapper");
		
		int i=10;
		Integer I=new Integer(i);
		
		byte b=10;
		Byte B=new Byte(b);
		Byte B2=new Byte((byte)b);//정수형 기본타입 int
		
		short s=10;
		Short S=new Short(s);
		Short S2=new Short((short)s);
		
		long l=10;
		Long L=new Long(l);
		Long L2=new Long((long)l);

		float f=1.1f;
		Float F=new Float(f);
		Float F2=new Float(1.1);
		
		double d=1.1;
		Double D=new Double(d);
		
		char ch='a';
		Character C=new Character(ch);
		
		boolean bool=false;
		Boolean Bool=new Boolean(bool);
		
		
		
		
		
		
	}

}
