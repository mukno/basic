package org.web.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect2 {
	
	public static Connection getConnection() {
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/javaStudy?useSSL=false&serverTimezone=UTC";
		String user="root";
		String password="12345";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//����̹��ε�
			System.out.println("����̹�ok");
			conn=DriverManager.getConnection(url,user,password);//DB����
			System.out.println("DB����");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
	}

}
