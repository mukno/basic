package web.BordCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.BordDAO.BordDAO;
import web.bordDTO.BordDTO;
import web.bordDTO.PagingClass;

public class BordPaging implements BordCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("들");
		int pNum;//페이지번호
		if(request.getParameter("pNum")==null) {
			pNum=1;
			
		}else {
			pNum=Integer.parseInt(request.getParameter("pNum"));
		}
		
		BordDAO dao=BordDAO.getInstance();
		
		PagingClass pagingList=dao.paging1(pNum);
		ArrayList<BordDTO> list=dao.list2(pagingList.getStartNum(), pagingList.getEndNum());
		
		request.setAttribute("list", list);
		request.setAttribute("pagingList", pagingList);
		request.setAttribute("url", "/pagingList.jsp");
		
		
		
		
	}
	

}
