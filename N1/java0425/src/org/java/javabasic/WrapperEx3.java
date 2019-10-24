package org.java.javabasic;

public class WrapperEx3 {
	
	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		
		//ÀÚµ¿¹Ú½Ì
		int i=10;
		Integer I=i; //= Integer I=new Integer(i);
		Integer I2=100;
		
		Byte b=(byte)10;
		Short s=(short)10;
		
		//ÀÚµ¿ ¾ð¹Ú½Ì
		Integer i5=new Integer(10);
		int i6=i5.intValue();
		int i7=i5;
		
		Byte b3=(byte)10;
		Short s3=(short)10;
		Long l3=(long)10;
		Float f3=(float)10;
		Double d3=(double)10;
		Character ch3=(char)'a';
		Boolean bool3=(boolean)false;
		
	}

}
