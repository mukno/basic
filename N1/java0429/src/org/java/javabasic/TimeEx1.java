package org.java.javabasic;

import java.time.LocalDate;
import java.util.Date;

public class TimeEx1 {

	public static void main(String[] args) {
		
		LocalDate now=LocalDate.now();//현재날짜만 get 
		
		System.out.println(now);
		System.out.println(new Date());
		System.out.println(new Date().getMonth());//0월기준
		
		System.out.println(now);
		System.out.println(now.getYear());//년
		System.out.println(now.getMonth());//월 영문
		System.out.println(now.getMonthValue());//월 숫자
		System.out.println(now.getDayOfYear());//일 (년도에서)
		System.out.println(now.getDayOfMonth());//일 (이번 달)
		System.out.println(now.getDayOfWeek());//요일
	
		LocalDate ofDay=LocalDate.of(2019, 04, 29);//날짜set
		
		
	}
}
