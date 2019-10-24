package com.spring.factorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ExeTimeAspect {
	//factorial()를 실행하기 전후로 동작
	//실해시간을 재기 위한 메소드
	@Around(value="execution(* com.spring.factorial..*(..))")
	public Object measure(ProceedingJoinPoint pjp) {
		long start=System.nanoTime();
		Object obj=null;
		try {
			obj=pjp.proceed();//factorial 구하기
			return obj;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			long end=System.nanoTime();
			System.out.println("걸린시간 : "+(end-start));
		}
		
		return obj;
		
	}

}
