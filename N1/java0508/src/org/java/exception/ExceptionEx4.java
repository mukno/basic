package org.java.exception;

public class ExceptionEx4 {
	public static void main(String[] args) {
		

		
		
		
		try {//1.드라이버
			Class.forName("com.mysql.cj.jdfbc.Drive");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("정상 종료");
	
		
		
		
		
	}

}
