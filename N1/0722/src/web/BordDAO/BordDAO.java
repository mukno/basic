package web.BordDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import web.DBConnect.DBConnect;
import web.bordDTO.BordDTO;
import web.bordDTO.PagingClass;

public class BordDAO {

private BordDAO() {
		
	}
	private static class Singleton{
		private static final BordDAO INSTANCE=new BordDAO();
	}
	public static BordDAO getInstance() {
		return Singleton.INSTANCE;
	}
	
	
	public ArrayList<BordDTO> BordList(){
		ArrayList<BordDTO> lists=new ArrayList<BordDTO>();
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		
		conn=DBConnect.getConnection();
		
		String query="select *from bord0722";
		
		try {
			pstm=conn.prepareStatement(query);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				
				lists.add(new BordDTO(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getTimestamp(5),rs.getString(6),rs.getString(7)));
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				
			}
			
		}
		
		
		
		
		return lists;
	}

	public PagingClass paging1(int pNum) {
	//���� ���ڵ�ó��
		
	PagingClass pagingLists=null;	
	
	Connection conn=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;
	
	
	int rowSize=5;//�� ������ �� ���ڵ� ��
	int block=2;//�� �������� ���� ������ ��
	int startNum=(pNum-1)*rowSize;//������ ���ڵ� ù��°
	int endNum=rowSize;//������ ���ڵ� ����
	
	//ȭ�� ����ǥ��
	int allPage=0;//��ü ������
	int startPage=((pNum-1)/block)*block+1;
	//int endPage((pNum-1)/block)*block+block;
	int endPage=startPage+block-1;
	int total=0;//��ü ���ڵ�
	
	conn=DBConnect.getConnection();
	try {
		String query="select count(*) from bord0722";
		
		pstm=conn.prepareStatement(query);
		
		rs=pstm.executeQuery();
		
		while(rs.next()) {
			total=rs.getInt(1);
			
		}
		allPage=(int)Math.ceil(total/(double)rowSize);
		if(endPage>allPage) {
			endPage=allPage;
		}
		pagingLists=new PagingClass(pNum, rowSize, block, startNum, endNum, total, allPage, startPage, endPage);
		
		
	}catch(SQLException e){
		e.printStackTrace();
		
	}finally {
		try {
			if(conn!=null)conn.close();
			if(pstm!=null)pstm.close();
			if(rs!=null)rs.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			
		}
		
	}
	
	
	
	return pagingLists;
	
	
	}
	
	public ArrayList<BordDTO> list2(int startNum,int endNum){
		ArrayList<BordDTO> lists=new ArrayList<BordDTO>();
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		
		conn=DBConnect.getConnection();
		
		String query="select *from bord0722 order by no desc limit ? , ?";
		
		try {
			pstm=conn.prepareStatement(query);
			
			pstm.setInt(1, startNum);
			pstm.setInt(2, endNum);
			
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				
				lists.add(new BordDTO(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getTimestamp(5),rs.getString(6),rs.getString(7)));
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				
			}
			
		}
		
		
		
		
		return lists;
	}
	
	
	
	
	
	
	
	
	
	
}
