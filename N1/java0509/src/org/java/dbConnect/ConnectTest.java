package org.java.dbConnect;

public class ConnectTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버OK");
			
		} catch (ClassNotFoundException e) {
 
			System.out.println("드라이버NO");
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
	}

}
