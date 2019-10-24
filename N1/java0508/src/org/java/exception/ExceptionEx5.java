package org.java.exception;

import java.util.Scanner;

public class ExceptionEx5 {
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num=in.nextInt();
		int[] arrInt=new int[5];
		//예외를 처리하고 프로그램 정상 실행 후 종료 (코드를 계속 진행한다)
		try {
			System.out.print("나눔수 입력: ");
			int div=in.nextInt(); //0입력시 예외발생
			System.out.println(num/div);
			
			for(int i=0;i<6;i++)
			{
				arrInt[i]=i;
			}
			
				
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		catch(ArithmeticException e){ //정수를 0으로 나누었을때 예외처리
			e.printStackTrace(); //콘솔에 예외 구문 표시
			System.out.println("예외메시지: "+e.getMessage());
			System.out.println("예외 발생시 실행");
		
			
		}
		catch(Exception e) {//모든 예외를 처리한다 그러나 모든 것을 다 확인해야해서 시간증가
			e.printStackTrace();
		}
		//catch 순서도 중요하다
		//위에서 Exception으로 예외 처리 할경우 할 필요가없으니
		//Exception 아래로는 catch문으로 예외처리 작성 불가능
		
		
		finally {
			System.out.println("예외 유무와 상관없이 실행(처리)");
		}
		
		
		System.out.println("프로그램정상 종료");
		
	}

}
