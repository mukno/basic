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
		//map 키값만 >>set 저장
		Set<Integer> key=map1.keySet();
		//keySet "Map키값을 저장하는 Set" >>Iterator사용
		Iterator<Integer> iterator=key.iterator();
		//while문으로 출력
		while(iterator.hasNext()) {
			Integer a=iterator.next();
			System.out.println("=============");
			System.out.println("키값: "+a);
			System.out.println("아이디: "+map1.get(a).getUserId());
			System.out.println("비밀번호: "+map1.get(a).getUserPw());
			System.out.println("이름: "+map1.get(a).getUserName());
			System.out.println("나이: "+map1.get(a).getUserAge());
		}
		
		
		
	}

}
