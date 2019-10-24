package org.java.collectionEx;

import java.util.ArrayList;
import java.util.Iterator;

class Sub1{
	private String userId;
	private String userPw;
	
	public Sub1() {
		super();
	}
	
	public Sub1(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}
	
	
	
	
}


public class ArrayListEx {
	
	public static void main(String[] args) {
		
		
		ArrayList<Sub1> s1=new ArrayList<Sub1>();
		s1.add(new Sub1("m1","11"));
		s1.add(new Sub1("m2","21"));
		s1.add(new Sub1("m3","31"));
		s1.add(new Sub1("m4","41"));
		s1.add(new Sub1("m5","51"));
		
		for(Sub1 s:s1) {
			String userId=s.getUserId();
			String userPw=s.getUserPw();
			System.out.print("아이디: "+userId+", ");
			System.out.println("비밀번호: "+userPw);
		}
		
		Iterator<Sub1> iterator=s1.iterator();
		while(iterator.hasNext())
		{
			Sub1 a=iterator.next();
			String userId=a.getUserId();
			String userPw=a.getUserPw();
			System.out.print("아이디: "+userId+", ");
			System.out.println("비밀번호: "+userPw);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
