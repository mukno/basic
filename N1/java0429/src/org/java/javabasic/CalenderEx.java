package org.java.javabasic;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		//get
		System.out.println(Calendar.YEAR);//�� static �ɹ� Ŭ����.�ɹ�
		System.out.println((Calendar.MONTH)+1);//�� static �ɹ� 
		System.out.println(Calendar.DATE);//�� static �ɹ� 
		System.out.println(Calendar.HOUR_OF_DAY);//�� static �ɹ� 
		System.out.println(Calendar.MINUTE);//�� static �ɹ� 
		System.out.println(Calendar.SECOND);//�� static �ɹ� 
		System.out.println(Calendar.MILLISECOND);//�и����� static �ɹ� 
		
		System.out.println(
				cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"
				+cal.get(Calendar.DATE)+"��"+cal.get(Calendar.HOUR_OF_DAY)+"��"
				+cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.SECOND)+"��"+
				cal.get(Calendar.MILLISECOND)+"�и�����"
				);
		
	}

}
