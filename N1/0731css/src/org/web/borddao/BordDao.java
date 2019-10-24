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

	public ArrayList<BordDto> list() {

		ArrayList<BordDto> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from bord0730  order by no desc";

			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			while (rs.next()) {
				result.add(new BordDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getTimestamp(7)));
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

		return result;
	}

	
	public BordDto bordView(String no) {
		
		BordDto dto = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnection();
			query = "select * from bord0730 where no=?";

			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, no);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				dto = new BordDto(rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getTimestamp(7));
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

		return dto;
	}

	public int write(String userId, String bNickname, String bPw,
			String bTitle, String bMemo) {

		int rs=0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into bord0730(userId,bNickname,bPw,bTitle,bMemo) "
					+ " values(?,?,?,?,?)";

			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, bNickname);
			pstm.setString(3, bPw);
			pstm.setString(4, bTitle);
			pstm.setString(5, bMemo);

			rs = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
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

		
		return rs;
		
	}
	
	
	
	
	
	
	
	
	
	

}
