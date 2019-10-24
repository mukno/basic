package org.java.memberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	
	private String dbURL="jdbc:mysql://localhost:3306/javastudy?useSSL=false&serverTimezone=UTC";
	private String hostId="root";
	private String hostPw="12345";
	
	public MemberDAO() {
		//1.����̹� �ε�
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� OK");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹�NO");
			e.printStackTrace();
		}
	}
	
	public int insert(String userId,String userPw,
			String userName,int userAge) 
	{
		int rs=0;
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="insert into member(userId,userPw,userName,userAge)"
					+ " values(?,?,?,?);";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			//����
			rs=pstm.executeUpdate();//��ȸ,����,Ż�� ���ϰ��� 1�̸� ����
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	
	public int delete(String userId) 
	{
		int rs=0;
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="delete from member where userId=(?)";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userId);
		
			
			//����
			rs=pstm.executeUpdate();//��ȸ,����,Ż�� ���ϰ��� 1�̸� ����
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	public int update(String userId,String userPw,
			String userName,int userAge) 
	{
		int rs=0;
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="update member set userpw=?,userName=?,userAge=? where userid=?";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userPw);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4, userId);
			
			//����
			rs=pstm.executeUpdate();//��ȸ,����,Ż�� ���ϰ��� 1�̸� ����
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	
	public ArrayList<MemberDTO> select(String userId) 
	{
		ArrayList<MemberDTO> lists=new ArrayList<MemberDTO>();
		
		ResultSet rs=null;//DB�����͸� ����
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="select * from member where userId=?";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userId);
			
			
			//����
			rs=pstm.executeQuery();//ResultSet��ü������ �����´�
			
			while(rs.next()) {
				
				String userId1=rs.getString(1);
				String userPw=rs.getString(2);
				String userName=rs.getString(3);
				int userAge=rs.getInt(4);
				
				MemberDTO dto=new MemberDTO(userId1, userPw, userName, userAge);
			
				lists.add(dto);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
					if(rs!=null) rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return lists;
	}
	
	
	
	public MemberDTO member(String userId) {
		MemberDTO dto=null;
		
		ResultSet rs=null;//DB�����͸� ����
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="select * from member where userId=?";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userId);
			
			
			//����
			rs=pstm.executeQuery();//ResultSet��ü������ �����´�
			
			while(rs.next()) {
				
				String userId1=rs.getString(1);
				String userPw=rs.getString(2);
				String userName=rs.getString(3);
				int userAge=rs.getInt(4);
				
				dto=new MemberDTO(userId1, userPw, userName, userAge);
			
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
					if(rs!=null) rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		
		
		
		
		return dto;
	}
	
	public int idcheck(String userId) 
	{
		int rs=0;
		ResultSet rset=null;
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="select count(*) from member where userId=?";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userId);
			
			
			//����
			rset=pstm.executeQuery();
			
			while(rset.next())
			{
			String i=rset.getString(1);
			if(i.equals("1"))
			{
				rs=1;
				
				
			}
			}
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	

	public int login(String userId,String userPw) {
		int rs=0;
		
		ResultSet rset=null;
		//Connect����
		Connection conn=null;
		//SQLó��
		PreparedStatement pstm=null;
		//���� ������
		String query="";

		
		try {
			//DB����
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//���� ������ �ۼ�
			query="select count(*) from member where userPw=?";
			//PreparedStatment�� ����
			pstm=conn.prepareStatement(query);
			
			//SQL ó��
			pstm.setString(1, userPw);
			
			
			//����
			rset=pstm.executeQuery();

			
			int id=idcheck(userId);
			if(id==1)
			{
				while(rset.next())
				{
				String i=rset.getString(1);
				int a=Integer.parseInt(i);
				
				if(a>=1)
				{
					rs=1;
					
					
				}
				}
			}
			
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//��������
					if(pstm!=null) pstm.close();//��������
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		
		
		
		
		return rs;
	}
	
	
	

}
