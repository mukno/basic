package com.spring.annotation.autowired;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SamsungTV implements Tv {
	
//	@Autowired
//	@Qualifier("britz")
	
//  @Inject
//  @Qualifier("britz")

//	@Resource(name="britz")
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
