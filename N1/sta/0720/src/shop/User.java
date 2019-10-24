package shop;

public class User {
	
	private String name;
	private payType payType;
	public User(String name, shop.payType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public payType getPayType() {
		return payType;
	}
	public void setPayType(payType payType) {
		this.payType = payType;
	}
	
	

}
