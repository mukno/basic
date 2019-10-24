package org.java.collectionEx;

import java.util.ArrayList;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(new Integer(10));
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);

		System.out.println(a1.size());
		a1.add(2,100);//특정 요소에 추가
		

		for(Integer a:a1)
		{
			System.out.print(a.intValue()+"\t");
		}
		a1.remove(0);
		a1.remove(new Integer(100));
		System.out.println("");
		for(int a:a1)
		{
			System.out.print(a+"\t");
		}
		
	}

}
