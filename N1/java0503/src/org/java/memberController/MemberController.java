package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.DeleteDo;
import org.java.memberCommend.InsertDo;
import org.java.memberCommend.MemberLoginDo;
import org.java.memberCommend.QueryCommend;
import org.java.memberCommend.SelectDo;
import org.java.memberCommend.UpdateDo;

public class MemberController {

	
	public static void main(String[] args) {
		
		QueryCommend q=null;
		Scanner in=new Scanner(System.in);
		System.out.print("Äõ¸®¹®ÀÔ·Â: ");
		String query=in.next();
		
		
		if(query.equals("insert")) {
			q=new InsertDo();
			q.excuteCommend();
		}else if(query.equals("select")) {
			q=new SelectDo();
			q.excuteCommend();
		}else if(query.equals("delete")) {
			q=new DeleteDo();
			q.excuteCommend();
		}else if(query.equals("update")) {
			q=new UpdateDo();
			q.excuteCommend();
		}else if(query.equals("login")) {
			q=new MemberLoginDo();
			q.excuteCommend();
		}
		
		
	}
	
	
}
