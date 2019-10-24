package org.java.javabasic;

import java.time.LocalDateTime;

public class TimeEx3 {
	public static void main(String[] args) {
		LocalDateTime DT=LocalDateTime.now();
		System.out.println(DT.getYear());//년
		System.out.println(DT.getMonthValue());//월
		System.out.println(DT.getDayOfMonth());//일
		System.out.println(DT.getHour());//시
		System.out.println(DT.getMinute());//분
		System.out.println(DT.getSecond());//초
		
		
		
		
		}

}
