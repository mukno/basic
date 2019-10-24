package com.spring.di;

public class LgTV implements Tv{
//	private AppleSpeaker speaker;
//	
//	
//	
//	
//	public void setSpeaker(AppleSpeaker speaker) {
//		this.speaker = speaker;
//	}
//	
	
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV-전원On");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV-전원Off");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LGTV-Sound Up");
		//speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LGTV-Sound down");
		//speaker.volumeDown();
	}
	
}
