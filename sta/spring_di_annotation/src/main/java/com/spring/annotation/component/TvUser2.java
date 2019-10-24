package com.spring.annotation.component;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser2 {
	public static void main(String[] args) {
		
		//AppleSpeaker speaker=new AppleSpeaker();
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext2.xml");
		
		SamsungTV tv=(SamsungTV)factory.getBean("samsungTV");//Component해놓은걸 bean객체로 되어 SamsungTv가 첫번째문자가 소문자로됨
		//아니면 @Component에 이름붙여준다 ex)@Component("")
		
		//tv.setSpeaker(speaker);
		
		//Tv tv=new SamsungTV(new AppleSpeaker());
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
		factory.close();
		
		
		
	}

}
