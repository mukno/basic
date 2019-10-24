package member.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn=null;
		
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/Oracle");
			conn = ds.getConnection();
			//etc.s
			conn.setAutoCommit(false);//디폴드값인 자동커밋기능 해제
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
		}
		
		return conn;
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
