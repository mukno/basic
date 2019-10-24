package org.java.memberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAcion(request,response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAcion(request, response);
	}
	
	private void doAcion(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//Ŭ���̾�Ʈ request������ �޴´�
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		//�������� Ŭ���̾�Ʈ���� ����(response)
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>�α������� Ȯ��</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<�α������� Ȯ��<br>");
		out.print("���̵�: "+userId+"  " );
		out.print("��й�ȣ: "+userPw);
		out.print("</body>");
		out.print("</html>");


		
	}

}
