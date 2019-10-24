package com.spring.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="javaDB";
			String password="12345";
			con=DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);//디폴드값인 자동커밋기능 해제
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstm) {
		try {
			pstm.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
