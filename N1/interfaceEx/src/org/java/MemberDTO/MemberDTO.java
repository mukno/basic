package org.java.MemberDTO;

public class MemberDTO {

	private String userID;
	private String userPW;
	private String userNAME;
	private int userAGE;

	public MemberDTO() {
		// �⺻�����ڴ� �ڵ����� ����
		// �ٸ������ڰ� �����ɶ��� ����x

	}

	public MemberDTO(String userID, String userPW, String userNAME, int userAGE) {

		this.userID = userID;
		this.userPW = userPW;
		this.userNAME = userNAME;
		this.userAGE = userAGE;
	}
	
	//setter �ܺο��� �ɹ��� �ʱ�ȭ 
	public void setUserID(String userID) {
		this.userID=userID;
		

	}
	//getter �ܺο��� �ɹ��� get
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
