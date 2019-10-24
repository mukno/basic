package org.java.javabasic;

import java.util.Scanner;

public class StringBufferTest {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요");
		//문자열을 입력해서 역순으로 출력
		//StringBuufer 이용
		
		Scanner in=new Scanner(System.in);
		
		
		StringBuffer inp=new StringBuffer(in.next());
		inp.reverse();
		System.out.println(inp);
		
		
		
	
		
		
		
		

		
	}

}
