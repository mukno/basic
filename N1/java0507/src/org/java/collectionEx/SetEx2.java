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
	
	                      //�ܺο��� ��(������ ��ü)
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
	//set1.get() ������ �̿��ϴ� �޼���� ���Ұ� Set�� ����(�ε���)�����⶧��
	
		
		Iterator<Sub2> iterator=set1.iterator();
		while(iterator.hasNext())
		{
			Sub2 a=iterator.next();
			System.out.println("���̵�: " +a.id);
			System.out.println("��й�ȣ: "+a.pw);
			
		}
		
		set1.clear();
		if(set1.isEmpty())
		{
			System.out.println("��");
		}
		
	}

}
