package org.java.javabasic;

import java.util.Scanner;

public class WrapperEx5 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("ù ���ڸ� �Է��Ͻÿ�: ");
		String num1=in.next();
		System.out.print("�����ڸ� �Է��Ͻÿ�: ");
		String giho=in.next();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
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
