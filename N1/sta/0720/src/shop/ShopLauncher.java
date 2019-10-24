package shop;

import java.util.Scanner;

public class ShopLauncher {
	
	public static void main(String[] args) {
		MyShop shop=new MyShop();
		
		//쇼핑몰 이름 지정
		shop.setTitle("myshop");
		//쇼핑몰 사용자 생성
		shop.genUser();
		
		shop.genProduct();
		shop.start();
		
		
		
		
		
	}

}
