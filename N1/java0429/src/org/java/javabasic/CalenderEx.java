package org.java.javabasic;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		//get
		System.out.println(Calendar.YEAR);//년 static 맴버 클래스.맴버
		System.out.println((Calendar.MONTH)+1);//월 static 맴버 
		System.out.println(Calendar.DATE);//일 static 맴버 
		System.out.println(Calendar.HOUR_OF_DAY);//시 static 맴버 
		System.out.println(Calendar.MINUTE);//분 static 맴버 
		System.out.println(Calendar.SECOND);//초 static 맴버 
		System.out.println(Calendar.MILLISECOND);//밀리세컨 static 맴버 
		
		System.out.println(
				cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"
				+cal.get(Calendar.DATE)+"일"+cal.get(Calendar.HOUR_OF_DAY)+"시"
				+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초"+
				cal.get(Calendar.MILLISECOND)+"밀리세컨"
				);
		
	}

}
