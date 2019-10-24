package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.DBConnect;


public class MemberDAO {
		private static final MemberDAO dao=new MemberDAO();//한번만 초기화
		
		private MemberDAO() {}// 생성자를 private
		
		public static MemberDAO getInstance() {
			//외부에서 MemberDao에 접근할 때 static매서드로 접근.
			return MemberDAO.dao;
		}
		

		public int insert(String userId,String userPw,String userName,int userAge) {
			
			int rs=0;
			
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			
			conn=DBConnect.getConnection();
			query="insert into member(userId,userPw,userName,userAge)  "
					+ " values(?,?,?,?);";
			try {
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1, userId);
				pstm.setString(2, userPw);
				pstm.setString(3, userName);
				pstm.setInt(4, userAge);
				
				rs=pstm.executeUpdate();//회원 가입 성공 1
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {				
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {}
			}
			
			return rs;
		}
		
		
		public int login(String userId,String userPw) {
			int result=0;
			
			
			Connection conn=null;
			PreparedStatement pstm=null;
			ResultSet rs=null;
			String query="";
			
			conn=DBConnect.getConnection();
			query="select count(*) from  member where userId=? and userPw=?";//return int
			
			try {
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1,userId);
				pstm.setString(2,userPw);
				
				rs=pstm.executeQuery();
				
				while(rs.next()) {				
					result=rs.getInt(1);//로그인 성공 			
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();
					if(rs!=null) rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					
				}
			}				
			
			
			
			
			return result;
		}
}
