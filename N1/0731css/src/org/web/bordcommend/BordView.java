package org.web.bordcommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.borddao.BordDao;
import org.web.borddto.BordDto;

public class BordView implements BordCommend {

	@Override
	public void executeCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		BordDao dao = BordDao.getInstance();
		
		BordDto dto=dao.bordView(request.getParameter("no"));		

		request.setAttribute("dto", dto);
		request.setAttribute("url", "/bordView.jsp");
	}

}
