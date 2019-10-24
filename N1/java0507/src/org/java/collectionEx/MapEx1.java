package org.java.collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapSub{
	private String userId;
	private String userPw;
	public MapSub(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}
	public void subInfo() {
		System.out.print("아이디: "+userId+" ");
		System.out.println("비밀번호: "+userPw+" ");
	}
	
}

public class MapEx1 {
	
	public static void main(String[] args) {
		
		Map<String, String> map1 =new HashMap<String, String>();
		          //키     ,  값    "키는 중복이 불가능" "값은 중복이 가능"
		map1.put("java1", "JSP");
		map1.put("java2", "Servlet");
		map1.put("java3", "Spring");
		//get
		System.out.println(map1.get("java1"));
		System.out.println(map1.get("java2"));
		System.out.println(map1.get("java3"));
		
		//keySet "Map의 키값을 저장하는 Set" >>Iterator사용
		//1.키값을 keySet() -> Set
		Set<String> set1=map1.keySet();//Map의 키값만
		
		//2. Iterator에 set를 설정
		Iterator<String> iterator=set1.iterator();
		while(iterator.hasNext()) {
			String a=iterator.next();
			System.out.println(a);
			
			
		}
		
		
		
	}

}
