package shop;

public abstract class Product {

	String pname;
	int price;
	
	
	
	public void printDetail() {
		System.out.println("상품이름: "+pname);
		System.out.println("상품가격: "+price);

		printExtra();
	}
	public abstract void printExtra();
		
	
}
