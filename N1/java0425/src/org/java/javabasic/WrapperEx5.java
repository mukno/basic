package org.java.javabasic;

import java.util.Scanner;

public class WrapperEx5 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("첫 숫자를 입력하시오: ");
		String num1=in.next();
		System.out.print("연산자를 입력하시오: ");
		String giho=in.next();
		System.out.print("두번째 숫자를 입력하시오: ");
		String num2=in.next();
		
		int nu1=Integer.parseInt(num1);
		int nu2=Integer.parseInt(num2);
		
		if(giho.equals("+"))
		{
			int dap=nu1+nu2;
			System.out.println(dap);
		}else if(giho.equals("-"))
		{
			int dap=nu1-nu2;
			System.out.println(dap);
		}else if(giho.equals("/"))
		{
			int dap=nu1/nu2;
			System.out.println(dap);
		}else if(giho.equals("*"))
		{
			int dap=nu1*nu2;
			System.out.println(dap);
		}
		
		
		
		
		
	}

}
