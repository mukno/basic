package org.web.memberCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberDTO.ChartDTO;
import org.web.memberDTO.MemberDTO;
import org.web.memberdao.MemberDao;

public class itemDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String item=request.getParameter("item");
		String shop=request.getParameter("shop");
		String img=request.getParameter("img");
		String id=request.getParameter("id");
	
		MemberDao dao=MemberDao.getInstance();
		ArrayList<ChartDTO> chart=dao.chart(item,shop);
		
		request.setAttribute("chart", chart);//DB������ ó��
		request.setAttribute("img", img);//DB������ ó��
		
		request.setAttribute("url","/"+id+"itemtable.jsp");//URL
	}
	
	

}
