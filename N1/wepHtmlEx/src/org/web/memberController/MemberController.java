package org.web.memberController;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberJoin.do")
public class MemberController extends HttpServlet{
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		                       	throws ServletException, IOException {
		System.out.println("dopost");
		doAction(request,response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			                     throws ServletException, IOException {
		System.out.println("doget");
		doAction(request,response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");//Ŭ���̾�Ʈ�� ���ڼ�
		response.setContentType("text/html;charset=utf-8");//������ �����ϴ� Ÿ��
		String uri=request.getRequestURI();//��ûURI
		System.out.println(uri);
		String path=request.getContextPath();//�⺻ �н�
		System.out.println(path);
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userName=request.getParameter("usserName");
		String userAge=request.getParameter("userAge");
		
		System.out.println(userId);
		System.out.println(userPw);
		System.out.println(userName);
		System.out.println(userAge);
		
		
		PrintWriter out=response.getWriter();//�������� Ŭ���̾�Ʈ ����
		out.print("<html>");
		out.print("<head>");
		out.print("<title>������ ���ؼ� ����</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("���̵�: "+userId+", ");
		out.print("��й�ȣ: "+userPw+", ");
		out.print("�̸�:" +userName+", ");
		out.print("����: "+userAge);
		
		out.print("</body>");

		
		out.print("</html>");
		
		out.close();
		
	}
	
	
}
