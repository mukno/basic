package org.java.dbConnect;

public class ConnectTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹�OK");
			
		} catch (ClassNotFoundException e) {
 
			System.out.println("����̹�NO");
			e.printStackTrace();
		}
		
		System.out.println("����");
		
		
	}

}
