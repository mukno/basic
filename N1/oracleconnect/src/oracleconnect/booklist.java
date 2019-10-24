package oracleconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class booklist {
	

			Connection con;
				
			public booklist(){
				String url="jdbc:oracle:thin:@localhost:1521:orcl";
				String userid="madang";
				String pwd="madang";
				
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 로드
					System.out.println("드라이버로드 성공");
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				try {
					System.out.println("데이터베이스 연결 준비");
					con=DriverManager.getConnection(url, userid, pwd);//DB연결
					System.out.println("데이터베이스 연결 성공");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
			}
			
			private void sqlRun() {
				String query="select *from book";
				try {
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next()) {
					System.out.println("\t"+rs.getInt(1));
					System.out.println("\t"+rs.getString(2));
					System.out.println("\t"+rs.getString(3));
					System.out.println("\t"+rs.getString(4));
				}
				con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
			}
			
			public static void main(String[] args) {
				booklist so =new booklist();
				so.sqlRun();
			}
			
			
			
			
			
}
