package org.java.memberDTO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	
	public static void main(String[] args) {
		
		Map<Integer,memberDTO> map1=new HashMap<Integer, memberDTO>();
		
		//put
		map1.put(1, new memberDTO("m1","11","s1",11));
		map1.put(2, new memberDTO("m1","11","s1",11));
		map1.put(3, new memberDTO("m1","11","s1",11));
		map1.put(4, new memberDTO("m1","11","s1",11));
		map1.put(5, new memberDTO("m1","11","s1",11));
		//map Ű���� >>set ����
		Set<Integer> key=map1.keySet();
		//keySet "MapŰ���� �����ϴ� Set" >>Iterator���
		Iterator<Integer> iterator=key.iterator();
		//while������ ���
		while(iterator.hasNext()) {
			Integer a=iterator.next();
			System.out.println("=============");
			System.out.println("Ű��: "+a);
			System.out.println("���̵�: "+map1.get(a).getUserId());
			System.out.println("��й�ȣ: "+map1.get(a).getUserPw());
			System.out.println("�̸�: "+map1.get(a).getUserName());
			System.out.println("����: "+map1.get(a).getUserAge());
		}
		
		
		
	}

}
