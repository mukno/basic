package org.web.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.web.dbconnect.DBConnect;
import org.web.memberDTO.MemberDTO;

public class MemberDao {

	//�̱��� "�ѹ� ��ü�� ����"
	private static final MemberDao dao=new MemberDao();//�ѹ��� �ʱ�ȭ
	
	private MemberDao() {}// �����ڸ� private
	
	public static MemberDao getInstance() {
		//�ܺο��� MemberDao�� ������ �� static�ż���� ����.
		return MemberDao.dao;
	}
	
	public int insert(String userId,String userPw,String userName,int userAge) {
		
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		conn=DBConnect.getConnection();
		query="insert into member(userId,userPw,userName,userAge)"
				+ " values(?,?,?,?);";
		try {
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			rs=pstm.executeUpdate();//ȸ�� ���� ���� 1
			
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
	
	public ArrayList<MemberDTO> members (){
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
	
		Connection conn = null;
		PreparedStatement pstm =null;
		ResultSet rs = null;
		String query = "";

		
		try {
		conn = DBConnect.getConnection();
		query = "select userID, userPW, userNAME, userAGE from Member;";
		pstm = conn.prepareStatement(query);
		
		rs = pstm.executeQuery();//��ȸ DB�����͸� get

		while(rs.next()) {
			/*String userID = rs.getString(1);
			String userPW = rs.getString(2);
			String userNAME = rs.getString(3);
			int userAGE = rs.getInt(4);
			
			MemberDTO  dto = new MemberDTO(userID, userPW, userNAME, userAGE);
			lists.add(dto);*/
			
			lists.add(new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));//���� ������ �ѹ��� ó��
		}
		
		}catch(SQLException e){
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
			

		
		return lists;
	}
	
	
	//���̵�üũ...	
	
		public int idChecked(String userId) {
			
			int rs1=0;
			
			Connection conn=null;
			PreparedStatement pstm=null;
			ResultSet rs=null;
			String query="";
			
			conn=DBConnect.getConnection();
			query="select count(*) from  member where userId=?";//return int
			
			try {
				pstm=conn.prepareStatement(query);
				
				pstm.setString(1,userId);
				
				rs=pstm.executeQuery();
				
				while(rs.next()) {				
					rs1=rs.getInt(1);// ���̵� ������ 1					
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
			
			return rs1;
		}
		
		public int login(String userId,String userPw) {
			int result=0;
			
			if(idChecked(userId)==0) return result;//���̵� üũ
			
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
					result=rs.getInt(1);//�α��� ���� 			
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
	
		public int MemberView(String userId,String userPw,String userName,int userAge) {
			int rs=0;
			Connection conn=null;
			PreparedStatement pstm=null;
			String query="";
			
			conn=DBConnect.getConnection();
			query = "update member set userId=?,userPw=?,userName=?,userAge=? where userId=?;";
			try {
				pstm=conn.prepareStatement(query);
				pstm.setString(1, userId);
				pstm.setString(2, userPw);
				pstm.setString(3, userName);
				pstm.setInt(4, userAge);
				pstm.setString(5, userId);

				rs=pstm.executeUpdate();
				
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
		
		
		
}
