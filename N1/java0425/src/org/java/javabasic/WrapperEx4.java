package org.java.javabasic;

public class WrapperEx4 {
	public static void main(String[] args) {
		
		System.out.println("Wrapper");
		Integer I=10;
		System.out.println(Integer.bitCount(10));
		System.out.println(I.intValue());
		System.out.println(I.doubleValue());
		System.out.println(I.byteValue());
		
		//���ڿ� �����͸� ������ �����ͷ� ��ȯ(�� ��ġ�����͸� ó��)
		System.out.println(Integer.parseInt("111"));
		//System.out.println(Integer.parseInt("m111")); exception ����ó��
		
		//������ �����͸� ���ڿ� �����ͷ� ��ȯ
		System.out.println(Integer.toString(10));
		
		
		
		//2���� ��ȯ
		System.out.println(Integer.toBinaryString(10));
		
		
		
		
		
		
	}

}
