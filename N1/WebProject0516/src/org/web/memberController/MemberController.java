package org.web.memberController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAcion(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAcion(request, response);
	}
	
	
	private void doAcion(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException,IOException,ServletException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userGender=request.getParameter("userGender");
		String geust=request.getParameter("geust");
				
		String[] hobbysArr=request.getParameterValues("hobbys");
		
		String hobbysStr="";
		
		for(String str:hobbysArr)	
		{
			hobbysStr+=str+",";
		
		}
		System.out.println(hobbysStr);
		hobbysStr=hobbysStr.substring(0,hobbysStr.length()-1);
		System.out.println(hobbysStr);
		
		//전화번호 (다중선택)
		
		String[] sArr=request.getParameterValues("phone");
		String stra="";
		
		for(String a:sArr)	
		{
			stra+=a+"-";
		
		}
		System.out.println(stra);
		stra=stra.substring(0,stra.length()-1);
		System.out.println(stra);
	}
}
