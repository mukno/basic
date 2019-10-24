package org.java.collectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//ArrayList : 순서있고 중복가능
//Set : ArrayList 와 다르게 순서가 없고 중복 불가능
public class SetEx1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();

		list.add("11");
		list.add("11");
		list.add("21");
		list.add("31");
		list.add("41");
		list.add("51");
		System.out.println(list.size());
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		HashSet<String> set1=new HashSet<String>();
		Set<String> set2=new HashSet<String>();

		
		set1.add("11");
		set1.add("11");
		set1.add("21");
		set1.add("31");
		set1.add("41");
		set1.add("51");
		System.out.println(set1.size());
		Iterator<String> iterator2=set1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
