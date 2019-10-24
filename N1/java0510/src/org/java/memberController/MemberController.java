package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.MemberDeleteDo;
import org.java.memberCommend.MemberInsertDo;
import org.java.memberCommend.MemberSelectDo;
import org.java.memberCommend.MemberUpdateDo;
import org.java.memberCommend.QueryCommend;

public class MemberController {
	
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		QueryCommend Commend=null;
		
		System.out.print("Äõ¸®¹® ÀÔ·Â: ");
		String query=in.next();
		if(query.equals("insert"))
		{
			Commend=new MemberInsertDo();
			Commend.excuteQueryCommend();
		}else if(query.equals("delete"))
		{
			Commend=new MemberDeleteDo();
			Commend.excuteQueryCommend();
		}else if(query.equals("update"))
		{
			Commend=new MemberUpdateDo();
			Commend.excuteQueryCommend();
		}else if(query.equals("select"))
		{
			Commend=new MemberSelectDo();
			Commend.excuteQueryCommend();
		}
		
		
		
	}
	
	

}
