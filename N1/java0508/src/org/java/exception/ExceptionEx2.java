package org.java.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int[] arrInt=new int[5];
		
		
		
		try {
			for(int i=0;i<6;i++)
			{
				arrInt[i]=i;
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			for(int i=0;i<6;i++)
			{
				System.out.println("arrInt["+i+"]="+arrInt[i]);		
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램 정상 종료");
	}

}
