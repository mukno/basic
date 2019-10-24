package member.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static member.persistence.JDBCUtil.*;
import member.domain.MemberVO;

public class MemberDAO {
	private Connection conn;
	
	public MemberDAO(Connection conn) {
		super();
		this.conn=conn;
	}
	
	public MemberVO isLogin(String userid,String password) {

		//userid와 password가 일치하면
		//userid와 name을 담아 리턴하기
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		int result=0;
		MemberVO vo=null;
		
		query="select userid,name from MEMBER where userid=? and password=?";
		
		try {
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, password);
			
			rs=pstm.executeQuery();
			if(rs.next()) {
				
				vo=new MemberVO();
				vo.setUserid(rs.getString(1));
				vo.setName(rs.getString(2));
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs);
			close(pstm);
		}
				
	
				
		
		
		return vo;
	}

}
