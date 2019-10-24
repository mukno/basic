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
		System.out.print("���̵�: "+userId+" ");
		System.out.println("��й�ȣ: "+userPw+" ");
	}
	
}

public class MapEx1 {
	
	public static void main(String[] args) {
		
		Map<String, String> map1 =new HashMap<String, String>();
		          //Ű     ,  ��    "Ű�� �ߺ��� �Ұ���" "���� �ߺ��� ����"
		map1.put("java1", "JSP");
		map1.put("java2", "Servlet");
		map1.put("java3", "Spring");
		//get
		System.out.println(map1.get("java1"));
		System.out.println(map1.get("java2"));
		System.out.println(map1.get("java3"));
		
		//keySet "Map�� Ű���� �����ϴ� Set" >>Iterator���
		//1.Ű���� keySet() -> Set
		Set<String> set1=map1.keySet();//Map�� Ű����
		
		//2. Iterator�� set�� ����
		Iterator<String> iterator=set1.iterator();
		while(iterator.hasNext()) {
			String a=iterator.next();
			System.out.println(a);
			
			
		}
		
		
		
	}

}
