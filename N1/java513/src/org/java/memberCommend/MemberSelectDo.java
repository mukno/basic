package org.java.memberCommend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class MemberSelectDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� �˻�");
		
        Scanner in=new Scanner(System.in);
		
		System.out.print("���̵� �Է�: ");
		String userId = in.next();

		MemberDAO dao=new MemberDAO();
		
	
		ArrayList<MemberDTO> lists=dao.select(userId);
		System.out.println(lists.size());
		System.out.println(lists.get(0).getUserId());
		System.out.println(lists.get(0).getUserPw());
		System.out.println(lists.get(0).getUserName());
		System.out.println(lists.get(0).getUserAge());
		
		
	}

}
