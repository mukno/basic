package org.java.collectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Sub2{
	public String id;
	public int pw;
	public Sub2(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	                      //외부에서 비교(생성된 객체)
	public boolean equals(Object obj) {
		if(obj instanceof Sub2) {
			Sub2 setSub=(Sub2) obj;
			return setSub.id.contentEquals(id)&&setSub.pw==pw;
			
		}else
			return false;
		
	}
	public int hashCode() {
		return id.hashCode()+pw;
	}
	
	
}


public class SetEx2 {
	
	public static void main(String[] args) {
		
		Sub2 s1=new Sub2("m1",11);
		Sub2 s2=new Sub2("m1",11);
		
		System.out.println(s1.equals(s2));
	
		Set<Sub2> set1=new HashSet<Sub2>();
		set1.add(new Sub2("m1",11));
		set1.add(new Sub2("m1",21));
		set1.add(new Sub2("m1",11));
		set1.add(new Sub2("m1",11));

		
		
		System.out.println(set1);
	//set1.get() 순서를 이용하는 메서드는 사용불가 Set은 순서(인덱스)가없기때문
	
		
		Iterator<Sub2> iterator=set1.iterator();
		while(iterator.hasNext())
		{
			Sub2 a=iterator.next();
			System.out.println("아이디: " +a.id);
			System.out.println("비밀번호: "+a.pw);
			
		}
		
		set1.clear();
		if(set1.isEmpty())
		{
			System.out.println("빔");
		}
		
	}

}
