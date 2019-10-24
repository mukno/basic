package org.java.MemberDTO;

public class MemberDTO {

	private String userID;
	private String userPW;
	private String userNAME;
	private int userAGE;

	public MemberDTO() {
		// 기본생성자는 자동으로 생성
		// 다른생성자가 생성될때는 생성x

	}

	public MemberDTO(String userID, String userPW, String userNAME, int userAGE) {

		this.userID = userID;
		this.userPW = userPW;
		this.userNAME = userNAME;
		this.userAGE = userAGE;
	}
	
	//setter 외부에서 맴버를 초기화 
	public void setUserID(String userID) {
		this.userID=userID;
		

	}
	//getter 외부에서 맴버를 get
	public String getUserID() {
		return userID;
	}
	public void setUserPW(String userPW) {
		this.userPW=userPW;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserNAME(String userNAME) {
		this.userNAME=userNAME;
	}
	public String getUserNAME() {
		return userNAME;
	}
	public void setUserAGE(int userAGE) {
		this.userAGE=userAGE;
	}
	public int getUserAGE() {
		return userAGE;
	}

	public static void main(String[] args) {

	}

}
