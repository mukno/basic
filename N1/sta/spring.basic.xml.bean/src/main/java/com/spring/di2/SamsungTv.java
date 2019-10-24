package com.spring.di2;

public class SamsungTv implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTv() {
		
		System.out.println("SamsungTv 객체 생성");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV-전원On  "+price);
		
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
