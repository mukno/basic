package com.spring.persistence;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.BoardVO;

@Repository //@Component 해도되나 저장소로 할거다 라는 키워드로 정확히 repository를 사용
public class BoardDAO {
	
	@Autowired
	private DataSource ds;
	//insert
	public int insertBoard(BoardVO vo)
	{
		int result=0;
		
		 String query="insert into SPRING_BOARD(bno,title,content,writer)"+ 
				"values(seq_board.nextVal,?,?,?)";
		
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(query);) {
			
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
		}
		
		
		return result;
	}
	
	//selectAll
	
	public ArrayList<BoardVO> selectAll(){
		ArrayList<BoardVO> list=new ArrayList<BoardVO>();
		 
		ResultSet rs=null;
		String query="select *from SPRING_BOARD";
		
		
		try (Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(query); ){
			
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
		
		ResultSet rs=null;
		
		String query="select *from SPRING_BOARD where bno=?";
		
		try(Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(query);	){
			
			pstm.setInt(1, bno);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				vo=new BoardVO(rs.getInt(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getDate(5),rs.getDate(6));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return vo;
		
	}
	
	
	
	//update
	
	public int board_update(BoardVO vo) {
		
		//title,content 수정
		
		 
		int rs=0;
		String query="update spring_board set title=?,content=?"
				+ ", updatedate=sysdate where bno=?";//sysdate 현재시간 (오라클)
		
		try (Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(query);){
		
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
		}

		
		
		return rs;
		
	}
	
	//delete
	
	public int deleteBoard(int bno)
	{
		int rs=0;
		String query="delete from spring_board where bno=?";
		
		try (Connection con=ds.getConnection();
				PreparedStatement pstm=con.prepareStatement(query);	){
			
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
		}
		
		
		return rs;
	}
	
	
	

}
