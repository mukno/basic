package java0509;

import java.sql.Connection;

public class DBConnector {

	public static void getConnection() throws ClassNotFoundException {
		
		Connection conn=null;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버로드 성공");
		
		
		
	}
}
