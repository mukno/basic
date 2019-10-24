package com.spring.factorial;

import org.springframework.stereotype.Component;

@Component("rec")
public class RecImpl implements Calculator {

	@Override
	public long factorial(long num) {
		//for문을 이용한 factorial 구하기
		int dap=0;
		//1*2*3*4
		for(int i=1;i<num;i++) {
			
			dap*=i;
			
		}
		
		return dap;
	}

}
