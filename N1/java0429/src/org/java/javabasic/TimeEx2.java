package org.java.javabasic;

import java.time.LocalTime;

public class TimeEx2 {
	
	public static void main(String[] args) {
		
	//�ð���
	LocalTime time=LocalTime.now();//����ð� get
	System.out.println(time);

	System.out.println(time.getHour());//��
	System.out.println(time.getMinute());//��
	System.out.println(time.getSecond());//��
	System.out.println(time.getNano());//��
	
	LocalTime time2=LocalTime.of(10,20,15);//�ð� set
	System.out.println(time2);
	
	}
}
