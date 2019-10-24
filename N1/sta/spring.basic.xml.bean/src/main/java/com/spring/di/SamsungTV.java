package com.spring.di;

public class SamsungTV implements Tv {
	
	
	private AppleSpeaker speaker;
	private int price;
	
	public SamsungTV(AppleSpeaker speaker,int price) {
		super();
		this.speaker = speaker;
		this.price=price;
	}
	/* (non-Javadoc)
	 * @see sample.Tv#powerOn()
	 */
	@Override
	public void powerOn() {
		System.out.println("SamsungTV-전원On  "+price);
		
	}
	/* (non-Javadoc)
	 * @see sample.Tv#powerOff()
	 */
	@Override
	public void powerOff() {
		System.out.println("SamsungTV-전원Off");
	}
	/* (non-Javadoc)
	 * @see sample.Tv#volumeOn()
	 */
	@Override
	public void volumeUp() {
		//System.out.println("SamsungTV-volume Up");
		speaker.volumeUp();
	}
	/* (non-Javadoc)
	 * @see sample.Tv#volumeOff()
	 */
	@Override
	public void volumeDown() {
		//System.out.println("SamsungTV-volume down");
		speaker.volumeDown();
	}

}
