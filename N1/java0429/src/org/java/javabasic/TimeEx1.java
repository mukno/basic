package org.java.javabasic;

import java.time.LocalDate;
import java.util.Date;

public class TimeEx1 {

	public static void main(String[] args) {
		
		LocalDate now=LocalDate.now();//���糯¥�� get 
		
		System.out.println(now);
		System.out.println(new Date());
		System.out.println(new Date().getMonth());//0������
		
		System.out.println(now);
		System.out.println(now.getYear());//��
		System.out.println(now.getMonth());//�� ����
		System.out.println(now.getMonthValue());//�� ����
		System.out.println(now.getDayOfYear());//�� (�⵵����)
		System.out.println(now.getDayOfMonth());//�� (�̹� ��)
		System.out.println(now.getDayOfWeek());//����
	
		LocalDate ofDay=LocalDate.of(2019, 04, 29);//��¥set
		
		
	}
}
