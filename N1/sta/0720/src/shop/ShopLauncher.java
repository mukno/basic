package shop;

import java.util.Scanner;

public class ShopLauncher {
	
	public static void main(String[] args) {
		MyShop shop=new MyShop();
		
		//���θ� �̸� ����
		shop.setTitle("myshop");
		//���θ� ����� ����
		shop.genUser();
		
		shop.genProduct();
		shop.start();
		
		
		
		
		
	}

}
