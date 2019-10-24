package com.spring.persistence;

import static com.spring.persistence.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.spring.domain.BoardVO;

@Repository //@Component 해도되나 저장소로 할거다 라는 키워드로 정확히 repository를 사용
public class BoardDAO {
	
	//insert
	public int insertBoard(BoardVO vo)
	{
		int result=0;
		Connection con=null;
		PreparedStatement pstm=null;
		String query="";
		con=getConnection();
		
		try {
			
			query="insert into SPRING_BOARD(bno,title,content,writer)"+ 
					"values(seq_board.nextVal,?,?,?)";
			pstm=con.prepareStatement(query);
			
			pstm.setString(1, vo.getTitle());
			pstm.setString(2, vo.getContent());
			pstm.setString(3, vo.getWriter());
			
			result=pstm.executeUpdate();
			if(result>0) {
				con.commit();//1이상 값 반환시 성공 후=commit
			}else {
				con.rollback();//아닐시 롤백
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close(pstm);
			close(con);
		}
		
		
		
		
		
		
		return result;
	}
	
	//selectAll
	
	public ArrayList<BoardVO> selectAll(){
		ArrayList<BoardVO> list=new ArrayList<BoardVO>();
		Connection con=null;
		PreparedStatement pstm=null;
		String query="";
		ResultSet rs=null;
		
		
		try {
			con=getConnection();
			query="select *from SPRING_BOARD";
			pstm=con.prepareStatement(query);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
			list.add(new BoardVO(rs.getInt(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getDate(5),rs.getDate(6)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return list;
		
	}
	
	//selectOne
	public BoardVO selectOne(int bno){
		BoardVO vo=null;
		Connection con=null;
		PreparedStatement pstm=null;
		String query="";
		ResultSet rs=null;
		
		
		try {
			con=getConnection();
			query="select *from SPRING_BOARD where bno=?";
			pstm=con.prepareStatement(query);
			pstm.setInt(1, bno);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				vo=new BoardVO(rs.getInt(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getDate(5),rs.getDate(6));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
			
		}
		
		
		
		
		
		return vo;
		
	}
	
	
	
	//update
	
	public int board_update(BoardVO vo) {
		
		//title,content 수정
		
		Connection con=null;
		PreparedStatement pstm=null;
		
		int rs=0;
		
		try {
			con=getConnection();
			
			String query="update spring_board set title=?,content=?"
					+ ", updatedate=sysdate where bno=?";//sysdate 현재시간 (오라클)
			pstm=con.prepareStatement(query);
			pstm.setString(1, vo.getTitle());
			pstm.setString(2, vo.getContent());
			pstm.setInt(3, vo.getBno());
			
			rs=pstm.executeUpdate();
			
			if(rs>0) {
				con.commit();
			}else {
				con.rollback();
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				close(con);
				close(pstm);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

		
		
		
		
		
		
		return rs;
		
	}
	
	//delete
	
	public int deleteBoard(int bno)
	{
		int rs=0;
		Connection con=null;
		PreparedStatement pstm=null;
		String query="";
		
		try {
			con=getConnection();
			query="delete from spring_board where bno=?";
			pstm=con.prepareStatement(query);
			pstm.setInt(1, bno);
			rs=pstm.executeUpdate();
			
			if(rs>0) {
				con.commit();
			}else{
				con.rollback();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				close(con);
				close(pstm);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		return rs;
	}
	
	
	

}
