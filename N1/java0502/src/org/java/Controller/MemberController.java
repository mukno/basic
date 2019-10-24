package org.java.Controller;

import java.util.Scanner;

import org.java.memberCommend.MemberCommend;
import org.java.memberCommend.MemberInsertDo;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("query¹® ÀÔ·Â: ");
		String query=in.next();
		
		MemberCommend action=null;
		
		if(query.equals("insert"))
		{
			action=new MemberInsertDo();
			action.excuteQueryCommend();
			
		}
		
	}
}
