package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	
	public static Connection getConnection() {
		
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/member?userSSL=false&serverTimezone=UTC";
		String user="root";
		String password="12345";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("DB¿¬°á OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}
}
