package org.java.collectionEx;

import java.util.Iterator;
import java.util.Vector;

class GenericEx<T>{
	T a;
	T b;
	public T method(T a) {
		return a;
	}
}




public class VectorEx1 {
	public static void main(String[] args) {
		//객체를 생성할 시점에서 타입을 외부에서 결정
		GenericEx<String> g1=new GenericEx();
		//요소 타입을 외부에서 결정(제네릭)
		Vector<String> v1=new Vector<String>();
		//객체를 생성 >> 저장

		//1. 벡터요소에 추가
		v1.add(new String("java"));
		v1.add(new String("SPRING"));
		v1.add(new String("javascript"));
		v1.add(new String("JSP"));
		v1.add(new String("servlet"));
		
		System.out.println(v1.size());// 벡터의 길이(요소갯수)
		
		//2. 특정인덱스에 추가
		v1.add(2,new String("MVC"));//두번째 요소에 추가
		
		System.out.println(v1.size());//벡터의 길이(요소갯수)
		
		//3.벡터를 다른 벡터에 추가
		Vector<String> v2=new Vector<String>();
		v2.add(new String("v2Vector1"));
		v2.add(new String("v2Vector2"));
		v2.add(new String("v2Vector3"));
		System.out.println(v2.size());
		
		v1.addAll(v2);//v1벡터에 v2를 추가
		System.out.println(v1.size());
		
		//4. 벡터 삭제
		//v1.clear();
		System.out.println(v1.size());
		
		//5. 객체의 요소에 포함되어있느냐
		System.out.println(v1.contains("v2Vector1"));
		
		//6. 객체요소를 get
		String s1=v1.get(0);
		System.out.println(s1);
	
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		
		//size(),get,for문을 이용 벡터v1의 모든 요소를 콘솔에 표시
		for(int i=0;i<v1.size();i++){
			System.out.print(" "+v1.get(i));
		}
		System.out.println("\n-------------------");
		for(String a:v1)
		{
			System.out.print(a);
		}
		//Iterator(객체)
        Iterator<String> iterator=v1.iterator();
		
        //hasNext:존재하면
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());//요소를 0번지 순서대로 처리
        }
        //7.isEmpty 비었느냐
        System.out.println(v1.isEmpty());
       
        ///////////////////////////////////////////////////////////
        Iterator<String> iterator2=v1.iterator();
        while(iterator2.hasNext())
        {
        	System.out.print(iterator2.next());//요소를 0번지 순서대로 처리
        }
        System.out.println("\n-------------------------");
        //8.remove "요소 삭제"
        v1.remove(0);
        
        Iterator<String> iterator3=v1.iterator();
        while(iterator3.hasNext())
        {
        	System.out.print(iterator3.next());//요소를 0번지 순서대로 처리
        }
		////////////////////////////////////////////////////////////
        //9. remove "요소 데이터 삭제"
        v1.remove("SPRING");
        Iterator<String> iterator4=v1.iterator();
        while(iterator4.hasNext())
        {
        	String str=iterator4.next();
        	System.out.println(str);
        }
        
        
        //10. toArray"전체 요소를 배열"
        System.out.println();
		
		
		
		
		
		
	}

}
