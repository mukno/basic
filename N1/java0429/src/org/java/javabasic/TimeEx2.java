package org.java.javabasic;

import java.time.LocalTime;

public class TimeEx2 {
	
	public static void main(String[] args) {
		
	//시간만
	LocalTime time=LocalTime.now();//현재시간 get
	System.out.println(time);

	System.out.println(time.getHour());//시
	System.out.println(time.getMinute());//분
	System.out.println(time.getSecond());//초
	System.out.println(time.getNano());//초
	
	LocalTime time2=LocalTime.of(10,20,15);//시간 set
	System.out.println(time2);
	
	}
}
