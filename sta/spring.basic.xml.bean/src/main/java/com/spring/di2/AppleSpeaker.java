package com.spring.di2;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");
		
	}
	/* (non-Javadoc)
	 * @see com.spring.di2.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker Volume Up");
		
	}
	/* (non-Javadoc)
	 * @see com.spring.di2.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker Volume Down");

	}

}
