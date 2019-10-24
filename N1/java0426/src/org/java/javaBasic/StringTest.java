package org.java.javaBasic;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//콘솔에 입력은
		//Actioninsert.do
		//update.do
		//MemberDelete.do
		//Select.do
		
		Scanner in=new Scanner(System.in);
		
		String clientURL=in.next();
		
		//substring subSequence의 차이
		//abcd 가진 문자열에 
		//substring 메서드는 ab를 만족하지만 abd를 만족하지않는다 .(String=클래스)
		clientURL.substring(0,clientURL.length()-3);
		//subSequence 메서드는 ab를 만족하고 abd도 만족한다.(charSequence=인터페이스)
		clientURL.subSequence(0, clientURL.length()-3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
