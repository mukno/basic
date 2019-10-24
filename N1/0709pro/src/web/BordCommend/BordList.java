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
		
		PrintWriter out=response.getWriter();
		out.write(getList());
		out.flush();
		
		
		
		
	}
	
	public String getList() {
		String rs="";
		BordDAO dao=BordDAO.getInstance();
		ArrayList<BordDTO> lists=new ArrayList<BordDTO>();
		rs+="{\"BordView\":[";
		lists=dao.BordList();
		for(BordDTO dto:lists) {
		rs+="{\"mId\":\""+dto.getmId()+"\",";
		rs+="\"mGroup\":\""+dto.getmGroup()+"\",";
		rs+="\"mIndent\":\""+dto.getmIndent()+"\",";
		rs+="\"step\":\""+dto.getStep()+"\",";
		rs+="\"hit\":\""+dto.getHit()+"\",";
		rs+="\"nickname\":\""+dto.getNickname()+"\",";
		rs+="\"userId\":\""+dto.getUserId()+"\",";
		rs+="\"mTime\":\""+dto.getmTime()+"\"},";
		}
		rs=rs.substring(0,rs.length()-1);
		rs+="]}";
		
		
		
		return rs;
	}

}
