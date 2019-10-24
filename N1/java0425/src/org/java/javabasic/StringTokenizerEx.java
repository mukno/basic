package org.java.javabasic;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		//StringTokenizer 클래스 구분문자를 기준으로 나누는 클래스
		//구분문자(delimiter)
		//토큰(token)
		String query="userId=m1&userPw=111&userName=s1";
		//query라는 문자열을 구분문자&로 구분시키는 클래스
		StringTokenizer st=new StringTokenizer(query,"&");
		
		//countTokens 토큰의 갯수
		System.out.println(st.countTokens());
		
		//hasMoreTokens메서드 토큰의 유무
		//token이 존재하면
		while(st.hasMoreTokens())
		{
			String str=st.nextToken(); //순서대로 입력
			System.out.println(str);
		}
		
	}

}
