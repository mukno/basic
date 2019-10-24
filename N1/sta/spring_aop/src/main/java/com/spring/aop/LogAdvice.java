package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("log")
public class LogAdvice {

	public void beforeLog() {
		System.out.println("[공통로그] 비지니스 로직 수행전 호출");
	}
	
	public void afterlog() {
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 후 예외 여부와 상관없이 호출");
		
	}
	

	public void afterThrowingLog() {
		
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 시 예외 발생후 호출");
	}
	
	
	public void afterReturnLog() {
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 시 정상종료 후 호출");
		
	}
	
	public void aroundLog(ProceedingJoinPoint pjp) {
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 전 호출");
		
		//비지니스 메소드 호출
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 후 호출");
		
		
		
	}
	
}
