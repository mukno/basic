package org.web.bordcommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.borddao.BordDao;
import org.web.borddto.BordDto;

public class WriteOk implements BordCommend {

	@Override
	public void executeCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		BordDao dao=BordDao.getInstance();
		
		int rs=dao.write(request.getParameter("userId"),
				request.getParameter("bNickname"),
				request.getParameter("bPw"),
				request.getParameter("bTitle"),
				request.getParameter("bMemo")
				);		
		
		request.setAttribute("url","/bordList.bo");

	}

}