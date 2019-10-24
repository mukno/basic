package com.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {
	public static void main(String[] args) {
		
		//AppleSpeaker speaker=new AppleSpeaker();
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		LgTV tv=(LgTV)factory.getBean("tv");
		
		//tv.setSpeaker(speaker);
		
		//Tv tv=new SamsungTV(new AppleSpeaker());
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LgTV tv2=(LgTV)factory.getBean("tv");
		
		if(tv==tv2)
			System.out.println(tv==tv2);
		
		factory.close();
		
		
		
	}

}
