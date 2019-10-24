package web.BordCommend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;
import web.bordDTO.BordDTO;

public class BordView implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String mId=request.getParameter("mId");
		
		System.out.println(mId);
		PrintWriter out=response.getWriter();
		out.write(getListView(mId));
		out.flush();
		
		
		
		
	}
	
	public String getListView(String mId) {
		
		BordDAO dao=BordDAO.getInstance();
		BordDTO dto=dao.bordView(mId);
		String rs="{\"BordView\":[";
		rs+="{\"mId\":\""+dto.getmId()+"\",";
		rs+="\"mGroup\":\""+dto.getmGroup()+"\",";
		rs+="\"mIndent\":\""+dto.getmIndent()+"\",";
		rs+="\"step\":\""+dto.getStep()+"\",";
		rs+="\"hit\":\""+dto.getHit()+"\",";
		rs+="\"nickname\":\""+dto.getNickname()+"\",";
		rs+="\"title\":\""+dto.getTitle()+"\",";
		rs+="\"mPw\":\""+dto.getmPw()+"\",";
		rs+="\"memo\":\""+dto.getMemo()+"\",";
		rs+="\"userId\":\""+dto.getUserId()+"\",";
		rs+="\"mTime\":\""+dto.getmTime()+"\"}]}";
		
		
		
		
		return rs;
	}

}
