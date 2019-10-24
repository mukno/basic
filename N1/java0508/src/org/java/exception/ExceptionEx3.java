package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("입력오류");
		
		//콘솔에 정수를 입려하여 콘솔에 출력
		//입력타입과 scanner의메서드와 차이
		
		Scanner in=new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		try {
			int a=in.nextInt();
			System.out.println(a);
			
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램 정상 종료");
		
		
		
	}

}
