package org.java.javabasic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest1 {
	
	public static void main(String[] args) {
		
		LocalDateTime time1=LocalDateTime.now();
		System.out.println(time1);
		
		System.out.println(time1.plusDays(10));//날짜를추가 초과되면 달 이월
		System.out.println(time1.plusMonths(10));//월 더하기 초과되면 년 이월
		System.out.println(time1.plusYears(10));//년 더하기
		
		
		//오늘부터 8년 5개월 20일 후의 날짜를 구하시오.
		LocalDateTime time2=LocalDateTime.now();
		System.out.println(time2);
		
		System.out.println((time2.plusYears(8).plusMonths(10).plusDays(20)));
		
		System.out.println(time1.minusYears(10));
		System.out.println(time1.minusMonths(10));
		System.out.println(time1.minusDays(35));
		
		//걸린 시간
		LocalTime startTime=LocalTime.now();
		LocalTime endTime=LocalTime.of(13,40,10);
		//Duration ~동안
		Duration duration=Duration.between(startTime, endTime);
		System.out.println(duration.getSeconds());
		System.out.println(duration.toDays());
		
		
		
		
	}

}
