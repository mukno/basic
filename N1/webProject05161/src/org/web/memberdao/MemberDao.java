package org.web.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.web.dbconnect.DBConnect;
import org.web.memberDTO.memberDTO;

public class MemberDao {
	//싱글톤"한번 객체를 생성"
	private static final MemberDao dao=new MemberDao();//한번만 초기화
	
	private MemberDao() {}//생성자를 private
	public static MemberDao getInstance() {
		return MemberDao.dao;
	}
	
	public int insert(String userId,String userPw,String userName,int userAge) {
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		conn=DBConnect.getConnection();
		query="insert into member(userId,userPw,userName,userAge)"
				+ "values(?,?,?,?);";
		try {
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1,userId);
			pstm.setString(2,userPw);
			pstm.setString(3,userName);
			pstm.setInt(4,userAge);
			
			rs=pstm.executeUpdate();//회원 가입 성공 1
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		return rs;
	}
	
	public ArrayList<memberDTO> members(){
		ArrayList<memberDTO> lists=new ArrayList<memberDTO>();
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnect.getConnection();
			query="select userId,userPw,userName,userAge from member;";
			pstm=conn.prepareStatement(query);
			
			rs=pstm.executeQuery();//조회,db데이터를 get
			
			while(rs.next()) {//db데이터가 있으면..
//				String userId =rs.getString(1);
//				String userPw =rs.getString(2);
//				String userName =rs.getString(3);
//				int userAge =rs.getInt(4);
//				
//				memberDTO dto=new memberDTO(userId, userPw, userName, userAge);
//				lists.add(dto);
//				
				lists.add(new memberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
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
				
			}
		}
		
		
		
		return lists;
	}
	
	public int idChecked(String userId)
	{
		int rs1=0;
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		conn=DBConnect.getConnection();
		query="select count(*) form member userId=?";//return int
		
		try {
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1,userId);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				rs1=rs.getInt(1);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}
		
		
		
		
		return rs1;
		
	}
	
	

}
