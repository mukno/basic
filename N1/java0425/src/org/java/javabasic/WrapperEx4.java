package org.java.javabasic;

public class WrapperEx4 {
	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		Integer I=10;
		System.out.println(Integer.bitCount(10));
		System.out.println(I.intValue());
		System.out.println(I.doubleValue());
		System.out.println(I.byteValue());
		
		//문자열 데이터를 정수형 데이터로 변환(웹 수치데이터를 처리)
		System.out.println(Integer.parseInt("111"));
		//System.out.println(Integer.parseInt("m111")); exception 예외처리
		
		//정수형 데이터를 문자열 데이터로 변환
		System.out.println(Integer.toString(10));
		
		
		
		//2진수 변환
		System.out.println(Integer.toBinaryString(10));
		
		
		
		
		
		
	}

}
