package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num=in.nextInt();
		
		//예외를 처리하고 프로그램 정상 실행 후 종료 (코드를 계속 진행한다)
		try {
			System.out.print("나눔수 입력: ");
			int div=in.nextInt(); //0입력시 예외발생
			System.out.println(num/div);
				
		}catch(ArithmeticException e){ //정수를 0으로 나누었을때 예외처리
			e.printStackTrace(); //콘솔에 예외 구문 표시
			System.out.println("예외메시지: "+e.getMessage());
			System.out.println("예외 발생시 실행");
			
			
		}finally {
			System.out.println("예외 유무와 상관없이 실행(처리)");
		}
		
		
		System.out.println("프로그램정상 종료");
		
	}

}
