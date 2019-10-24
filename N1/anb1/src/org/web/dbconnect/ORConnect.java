package org.web.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class ORConnect {

	public static Connection getConnection() {
		
		Connection conn=null;
		
		String orurl="jdbc:oracle:thin:@localhost:1521:orcl";
		String oruser="madang";
		String orpassword="madang";
		
		Statement stmt=null;
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 로드

			conn=DriverManager.getConnection(orurl, oruser, orpassword);//DB연결

			stmt=conn.createStatement();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return conn;
	}
	
}