package shop;

public abstract class Product {

	String pname;
	int price;
	
	
	
	public void printDetail() {
		System.out.println("��ǰ�̸�: "+pname);
		System.out.println("��ǰ����: "+price);

		printExtra();
	}
	public abstract void printExtra();
		
	
}
