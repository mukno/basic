package org.java.utilEx;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date now=new Date();
		
		System.out.println(now.getDate()); //일 표시
		
		System.out.println(now.getMonth()); //0월 기준
		System.out.println(now.getYear()); //1900년 기준
		
		System.out.println(now.getTime());//1970.1.1 00:00:00
		System.out.println("오늘 요일: "+now.getDay());//일요일 0 5>>금요일
		
		//오늘 날짜를 이용해서 오늘의 요일을 출력해보세요.Date클래스
		//switch문으로 0이면 일요일 1이면 월
		//나머지는 입력오류
		
		switch(now.getDay())
		{
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default :
		    System.out.println("입력오류");
		    break;
		}
		
		
		
	}

}
