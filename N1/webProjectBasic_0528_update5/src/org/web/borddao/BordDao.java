package org.web.borddao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.web.borddto.BordDto;
import org.web.dbconnect.DBConnect;

public class BordDao {

	private BordDao() {
	}

	private static class Singleton {
		private static final BordDao INSTANCE = new BordDao();
	}

	public static BordDao getInstance() {
		return Singleton.INSTANCE;
	}
	

	public int bordWrite(String userId, String bordPw, String title, String content) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into memberBord( userId,bordPw, title,content) " 
			+ " values(?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, bordPw);
			pstm.setString(3, title);
			pstm.setString(4, content);

			result = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}

		}

		return result;

	}

	// 疫뀐옙筌뤴뫖以�

	public ArrayList<BordDto> bordList() {
		
		ArrayList<BordDto> lists = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		conn = DBConnect.getConnection();
		
		query = "select * from  memberBord  order by no desc ";// no�궡由� 李⑥닚
		try {
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					int no1 = rs.getInt(1);
					String userId = rs.getString(2);
					String bordPw = rs.getString(3);
					String title = rs.getString(4);
					String content = rs.getString(5);

					BordDto dto = new BordDto(no1, userId, bordPw, title, content);
					lists.add(dto);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}

		}

		return lists;
	}
	
	public BordDto BordView(int no) {
		BordDto dto=null;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		conn=DBConnect.getConnection();
		query="select *from memeberBord where no=?;";
		try {
			pstm=conn.prepareStatement(query);
			pstm.setInt(1, no);
			
			rs=pstm.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					dto=new BordDto(rs.getInt(1),rs.getString(2),rs.getString(3),
							rs.getString(4),rs.getString(5));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
	}
	
	
	
		
		
		
		
	
	
	
	

}
