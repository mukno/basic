package com.spring.annotation.autowired;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser2 {
	public static void main(String[] args) {
		
		//AppleSpeaker speaker=new AppleSpeaker();
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		SamsungTV tv=(SamsungTV)factory.getBean("STv");
		
		//tv.setSpeaker(speaker);
		
		//Tv tv=new SamsungTV(new AppleSpeaker());
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
		factory.close();
		
		
		
	}

}
