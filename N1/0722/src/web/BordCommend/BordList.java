package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;
import web.bordDTO.BordDTO;

public class BordList implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		
		BordDAO dao=BordDAO.getInstance();
		ArrayList<BordDTO> lists=new ArrayList<BordDTO>();
		lists=dao.BordList();
		
		request.setAttribute("url", "/");
		
	}
	
	/*
	 * public String getList() { String rs=""; rs+="{\"BordView\":["; for(BordDTO
	 * dto:lists) { rs+="{\"no\":\""+dto.getNo()+"\",";
	 * rs+="\"userId\":\""+dto.getUserId()+"\",";
	 * rs+="\"getbNickname\":\""+dto.getbNickname()+"\",";
	 * rs+="\"getbPw\":\""+dto.getbPw()+"\",";
	 * rs+="\"getbTime\":\""+dto.getbTime()+"\",";
	 * rs+="\"getbTitle\":\""+dto.getbTitle()+"\",";
	 * rs+="\"getbMemo\":\""+dto.getbMemo()+"\"},"; }
	 * rs=rs.substring(0,rs.length()-1); rs+="]}";
	 * 
	 * System.out.println(rs);
	 * 
	 * return rs; }
	 */

}
