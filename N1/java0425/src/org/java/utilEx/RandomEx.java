package org.java.utilEx;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random rad=new Random();
		System.out.println(rad.nextInt());
		System.out.println(rad.nextInt(100));//0~99�� ������ ���
		System.out.println(rad.nextInt(45));//0~44�� ����
		
		
		
	}
	

}
