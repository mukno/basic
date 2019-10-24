package com.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageBeanEx {

	public static void main(String[] args) {
		
		System.out.println("--컨테이너 구동전--");
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
				System.out.println("--컨테이너 구동 후");
		MessageBean msg=(MessageBean)factory.getBean("msg");
		msg.sayHello("spring");
		
		factory.close();

	}

}
