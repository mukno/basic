package org.web.bordComend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.borddao.BordDao;
import org.web.borddto.BordDto;

public class BordViewBo implements BordCommend{

	@Override
	public void excuteQuery(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("게시글 조회");
		BordDao dao=BordDao.getInstance();

		int no= Integer.parseInt(request.getParameter("no"));
		BordDto dto=dao.BordView(no);	

		String url="";
		if(dto==null) {
			url="/index.jsp";
		}else {
			url="/bordView.jsp";
		}
		

		request.setAttribute("dto", dto);
		request.setAttribute("url", url);
		
		
		
		
	}
	
	

}
