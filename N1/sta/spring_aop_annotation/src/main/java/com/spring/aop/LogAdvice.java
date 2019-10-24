package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("log")
@Aspect
public class LogAdvice {
	@Before(value="execution(* com.spring.aop.Product.getInfo())")
	public void beforeLog() {
		System.out.println("[공통로그] 비지니스 로직 수행전 호출");
	}
	@After(value="execution(* com.spring.aop.Product.getInfo())")
	public void afterlog() {
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 후 예외 여부와 상관없이 호출");
		
	}
	
	@AfterThrowing(value="execution(* com.spring.aop.Product.getInfo())")
	public void afterThrowingLog() {
		
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 시 예외 발생후 호출");
	}
	
	@AfterReturning(value="execution(* com.spring.aop.Product.getInfo())")
	public void afterReturnLog() {
		System.out.println("[공통로그] 비지니스 로직"
				+ "수행 시 정상종료 후 호출");
		
	}
	
	@Around(value="execution(* com.spring.aop.Product.getInfo())")
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
