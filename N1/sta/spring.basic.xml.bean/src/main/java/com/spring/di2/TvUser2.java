package com.spring.di2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser2 {
	public static void main(String[] args) {
		
		//AppleSpeaker speaker=new AppleSpeaker();
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext3.xml");
		
		TV tv=(SamsungTv)factory.getBean("tv3");
		
		//tv.setSpeaker(speaker);
		
		//Tv tv=new SamsungTV(new AppleSpeaker());
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	
	
		factory.close();
		
		
		
	}

}
