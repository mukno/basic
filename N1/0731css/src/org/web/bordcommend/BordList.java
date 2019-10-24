package org.web.bordcommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.borddao.BordDao;
import org.web.borddto.BordDto;

public class BordList implements BordCommend {

	@Override
	public void executeCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BordDao dao = BordDao.getInstance();

		ArrayList<BordDto> list = dao.list();

		request.setAttribute("list", list);
		request.setAttribute("url", "/list.jsp");

	}
}
