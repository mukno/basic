package com.spring.transaction;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.service.SampleService;

public class SampleClient {

	public static void main(String[] args) {

		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		SampleService service=(SampleService)factory.getBean("sample");
		
		String str="Starry\r\n"+"Starry night\r\n"
		+"paint your paletter blue and grey\r\n"
		+"Look out on asummer's day";
		
		service.addData(str);
		factory.close();
		
		
	}

}
