package org.web.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.DBConnect.DBConnect;

public class MemberDAO {

	private MemberDAO() {
		
	}
	private static class Singleton{
		private static final MemberDAO INSTANCE=new MemberDAO();
	}
	public static MemberDAO getInstance() {
		return Singleton.INSTANCE;
	}
	
	public int login(String userId,String userPw) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstm =null;
		ResultSet rs=null;
		
		String query="";
		
		conn=DBConnect.getConnection();
		query="select count(*) from member0722 where userId=? and userPw=?";
		
		try {
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				result=rs.getInt(1);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {}
			
		}
		
		
		return result;
	}
	
	
	public int join(String userId,String userPw,String Nickname)
	{
		int result=0;
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		String query="";
		conn=DBConnect.getConnection();
		query="insert into member0722(userId,userPw,Nickname) values(?,?,?)";
		
		try {
			
		pstm=conn.prepareStatement(query);
		
		pstm.setString(1, userId);
		pstm.setString(2, userPw);
		pstm.setString(3, Nickname);
		
		result=pstm.executeUpdate();
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {}
			
		}
		
		
		
		
		
		
		
		return result;
	}
	
	

}
