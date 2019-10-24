package org.java.javabasic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest1 {
	
	public static void main(String[] args) {
		
		LocalDateTime time1=LocalDateTime.now();
		System.out.println(time1);
		
		System.out.println(time1.plusDays(10));//��¥���߰� �ʰ��Ǹ� �� �̿�
		System.out.println(time1.plusMonths(10));//�� ���ϱ� �ʰ��Ǹ� �� �̿�
		System.out.println(time1.plusYears(10));//�� ���ϱ�
		
		
		//���ú��� 8�� 5���� 20�� ���� ��¥�� ���Ͻÿ�.
		LocalDateTime time2=LocalDateTime.now();
		System.out.println(time2);
		
		System.out.println((time2.plusYears(8).plusMonths(10).plusDays(20)));
		
		System.out.println(time1.minusYears(10));
		System.out.println(time1.minusMonths(10));
		System.out.println(time1.minusDays(35));
		
		//�ɸ� �ð�
		LocalTime startTime=LocalTime.now();
		LocalTime endTime=LocalTime.of(13,40,10);
		//Duration ~����
		Duration duration=Duration.between(startTime, endTime);
		System.out.println(duration.getSeconds());
		System.out.println(duration.toDays());
		
		
		
		
	}

}
