package org.web.borddto;

import com.sun.jmx.snmp.Timestamp;

public class BordDto {
	private int mId;
	private int mGroup;
	private int mIndent;
	private int step;
	private int hit;
	private String nickname;
	private String userId;
	private String mPw;
	private String memo;
	private String title;
	private Timestamp mTime;
	
	public BordDto() {
		// TODO Auto-generated constructor stub
	}

	public BordDto(int mId, int mGroup, int mIndent, int step, int hit, String nickname, String userId, String mPw,
			String memo, String title, Timestamp mTime) {
		super();
		this.mId = mId;
		this.mGroup = mGroup;
		this.mIndent = mIndent;
		this.step = step;
		this.hit = hit;
		this.nickname = nickname;
		this.userId = userId;
		this.mPw = mPw;
		this.memo = memo;
		this.title = title;
		this.mTime = mTime;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getmGroup() {
		return mGroup;
	}

	public void setmGroup(int mGroup) {
		this.mGroup = mGroup;
	}

	public int getmIndent() {
		return mIndent;
	}

	public void setmIndent(int mIndent) {
		this.mIndent = mIndent;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getmTime() {
		return mTime;
	}

	public void setmTime(Timestamp mTime) {
		this.mTime = mTime;
	}
	
	
	
	

}
