package com.spring.factorial;

import org.springframework.stereotype.Component;

@Component("fact")
public class FactImpl implements Calculator {

	
	@Override
	public long factorial(long num) {
		//재귀 호출 이용한 factorial 구하기
		
		if(num==0) {
			return 1;
		}else {
			
			return num*factorial(num-1);
			
		}
	}
	
	
	

}
