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
		System.out.print("쿼리문 입력: ");
		String st=abc.next();
		
		
		if(st.equals("insert"))
		{
			//InsertCommend action=new InsertCommend();
			//action.excuteQueryCommend();
			
			//다형성"부모타입의 객체 참조>>자식객체 참조"
			//>>부모타입 객체참조변수는 부모클래스의 맴버만 참조
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
			System.out.println("프로그램 종료");
		}else {
			System.out.println("쿼리문 입력 오류");
		}
		}
		
	}

}
