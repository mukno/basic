package shop;

public class SmartTV extends Product{
	


	private String resolution;
	
	public SmartTV(String pname,int price,String resolution) {
		this.pname=pname;
		this.price=price;
		this.resolution=resolution;
	}
	
	@Override
	public void printExtra() {
		System.out.println("해상도 정보:"+resolution);		
	}
	
	

}
