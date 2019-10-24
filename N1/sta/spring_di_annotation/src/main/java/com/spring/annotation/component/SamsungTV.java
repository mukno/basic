package com.spring.annotation.component;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements Tv {
	
//	@Autowired
//	@Qualifier("britz")
	
//	@Inject
	
	@Resource(name="britzSpeaker")//Component로 첫번째 소문자로됨
	private Speaker speaker;

	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV-전원On  ");
		
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV-전원Off");
	}
	@Override
	public void volumeUp() {
		//System.out.println("SamsungTV-volume Up");
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		//System.out.println("SamsungTV-volume down");
		speaker.volumeDown();
	}

}
