package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.ActionDeleteDo;
import org.java.MemberCommend.ActionInsertDo;
import org.java.MemberCommend.ActionSelectDo;
import org.java.MemberCommend.ActionUpdateDo;
import org.java.MemberCommend.QueryCommend;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("쿼리문 입력: ");
		String query=in.next();
		QueryCommend a=null;
		
		boolean bool=false;
		//기존엔 데이터가 없지만 
		//while(데이타가 있으면) 실행
		while(!bool)
		{
		if(query.equals("insert"))
		{
			a=new ActionInsertDo();
			a.excuteQuery();
			
		}else if(query.equals("delete")) {
			a=new ActionDeleteDo();
			a.excuteQuery();
			
		}else if(query.equals("select")) {
			a=new ActionSelectDo();
			a.excuteQuery();
		}else if(query.equals("update")) {
			a=new ActionUpdateDo();
			a.excuteQuery();
		}else if(query.equals("exit")) {
			System.out.println("종료");
			bool=true;
		}else {
			System.out.println("쿼리문 오류");
		}
		
		}
		
	}
}
