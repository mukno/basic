package shop;

public class CellPhone extends Product{
	
	private String carrier;
	
	public CellPhone(String pname,int price,String carrier) {
		this.pname=pname;
		this.price=price;
		this.carrier=carrier;
		
	}
	
	
	@Override
	public void printExtra() {
		
		System.out.println("통신사 정보:"+carrier);
		
	}
	
	

}
