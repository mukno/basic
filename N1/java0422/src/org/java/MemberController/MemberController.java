package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.ActionQueryCommend;
import org.java.MemberCommend.DeleteCommend;
import org.java.MemberCommend.InsertCommend;
import org.java.MemberCommend.SelectCommend;
import org.java.MemberCommend.UpdateCommend;

public class MemberController {

	public static void main(String[] args) {
		
		boolean bool=false;
		
		while(!bool)
		{
			
		Scanner abc=new Scanner(System.in);
		System.out.print("������ �Է�: ");
		String st=abc.next();
		
		
		if(st.equals("insert"))
		{
			//InsertCommend action=new InsertCommend();
			//action.excuteQueryCommend();
			
			//������"�θ�Ÿ���� ��ü ����>>�ڽİ�ü ����"
			//>>�θ�Ÿ�� ��ü���������� �θ�Ŭ������ �ɹ��� ����
			ActionQueryCommend action=new InsertCommend();
			action.excuteQueryCommend();
		}else if(st.equals("update")) {
			UpdateCommend action=new UpdateCommend();
			action.excuteQueryCommend();
			
		}else if(st.equals("delete")) {
			DeleteCommend action=new DeleteCommend();
			action.excuteQueryCommend();
		}else if(st.equals("select")) {
			SelectCommend action=new SelectCommend();
			action.excuteQueryCommend();
		}
		else if(st.equals("exit")) {
			System.out.println("���α׷� ����");
		}else {
			System.out.println("������ �Է� ����");
		}
		}
		
	}

}
