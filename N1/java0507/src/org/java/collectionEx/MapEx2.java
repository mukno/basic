package org.java.collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.java.collectionEx.MapSub;


public class MapEx2 {
	public static void main(String[] args) {
		Map<Integer,MapSub> map1=new HashMap<Integer, MapSub>();
		
		map1.put(1, new MapSub("m1", "11"));
		map1.put(2, new MapSub("m1", "11"));
		map1.put(2, new MapSub("m1", "11"));
		map1.put(3, new MapSub("m3", "31"));
		map1.put(4, new MapSub("m4", "41"));
		map1.put(5, new MapSub("m5", "51"));
		
		System.out.println(map1.size());
		

		//map Ű���� >>set
		Set<Integer> set1=map1.keySet();
		//KeySet "MapŰ���� �����ϴ� Set" >> Iterator���
		Iterator<Integer> iterator=set1.iterator();
		//while������ ���...
		while(iterator.hasNext()) {
			Integer a=iterator.next();
			map1.get(a).subInfo();
			
			
		}
		
		
		
	}

}
