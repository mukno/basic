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
		//1.드라이버 로드
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 OK");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버NO");
			e.printStackTrace();
		}
	}
	
	public int insert(String userId,String userPw,
			String userName,int userAge) 
	{
		int rs=0;
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="insert into member(userId,userPw,userName,userAge)"
					+ " values(?,?,?,?);";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			//실행
			rs=pstm.executeUpdate();//조회,수정,탈퇴 리턴값이 1이면 성공
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	
	public int delete(String userId) 
	{
		int rs=0;
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="delete from member where userId=(?)";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userId);
		
			
			//실행
			rs=pstm.executeUpdate();//조회,수정,탈퇴 리턴값이 1이면 성공
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
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
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="update member set userpw=?,userName=?,userAge=? where userid=?";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userPw);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4, userId);
			
			//실행
			rs=pstm.executeUpdate();//조회,수정,탈퇴 리턴값이 1이면 성공
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	
	public ArrayList<MemberDTO> select(String userId) 
	{
		ArrayList<MemberDTO> lists=new ArrayList<MemberDTO>();
		
		ResultSet rs=null;//DB데이터를 저장
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="select * from member where userId=?";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userId);
			
			
			//실행
			rs=pstm.executeQuery();//ResultSet객체값으로 가져온다
			
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
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
					if(rs!=null) rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return lists;
	}
	
	
	
	public MemberDTO member(String userId) {
		MemberDTO dto=null;
		
		ResultSet rs=null;//DB데이터를 저장
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="select * from member where userId=?";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userId);
			
			
			//실행
			rs=pstm.executeQuery();//ResultSet객체값으로 가져온다
			
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
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
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
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="select count(*) from member where userId=?";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userId);
			
			
			//실행
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
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		

		return rs;
	}
	

	public int login(String userId,String userPw) {
		int rs=0;
		
		ResultSet rset=null;
		//Connect생성
		Connection conn=null;
		//SQL처리
		PreparedStatement pstm=null;
		//실제 쿼리문
		String query="";

		
		try {
			//DB연동
			conn=DriverManager.getConnection(dbURL, hostId, hostPw);
			//실제 쿼리문 작성
			query="select count(*) from member where userPw=?";
			//PreparedStatment에 저장
			pstm=conn.prepareStatement(query);
			
			//SQL 처리
			pstm.setString(1, userPw);
			
			
			//실행
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
					if(conn!=null) conn.close();//연결해제
					if(pstm!=null) pstm.close();//연결해제
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			
			
		}
		
		
		
		
		return rs;
	}
	
	
	

}
