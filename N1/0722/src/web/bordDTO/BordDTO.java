package web.bordDTO;

import java.sql.Timestamp;

public class BordDTO {
	private int no;
	private String userId;
	private String bNickname;
	private String bPw;
	private Timestamp bTime;
	private String bTitle;
	private String bMemo;
	
	
	
	public BordDTO(int no, String userId, String bNickname, String bPw, Timestamp bTime, String bTitle, String bMemo) {
		super();
		this.no = no;
		this.userId = userId;
		this.bNickname = bNickname;
		this.bPw = bPw;
		this.bTime = bTime;
		this.bTitle = bTitle;
		this.bMemo = bMemo;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getbNickname() {
		return bNickname;
	}
	public void setbNickname(String bNickname) {
		this.bNickname = bNickname;
	}
	public String getbPw() {
		return bPw;
	}
	public void setbPw(String bPw) {
		this.bPw = bPw;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbMemo() {
		return bMemo;
	}
	public void setbMemo(String bMemo) {
		this.bMemo = bMemo;
	}
	public Timestamp getbTime() {
		return bTime;
	}
	public void setbTime(Timestamp bTime) {
		this.bTime = bTime;
	}
	
	
	

}
