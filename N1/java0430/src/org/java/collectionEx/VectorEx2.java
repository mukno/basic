package org.java.collectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Integer> v1=new Vector<Integer>();
		
		v1.add(new Integer(10));//박싱 Integer a=new Integer(10)
		v1.add(20);//Integer a=10 자동박싱
		v1.add(new Integer(30));
		v1.add(new Integer(40));
		v1.add(new Integer(50));

		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		for(Integer a:v1) {
			System.out.println(a);
		}
		
		//Iterator
		Iterator<Integer> iterator=v1.iterator();
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());
		}
		
		//Scanner이용 해서 1~5까지 정수를 입력해서
		//Vector에 저장을 하고 콘솔에 출력하는 프로그래밍을 해보세요
		//Scanner,Vector,Iterator,System.out.print
		//while문 사용
		Scanner in=new Scanner(System.in);

	
		Vector<Integer> v=new Vector<Integer>();
		int cot=0;
		while(true)
		{
		System.out.print("숫자입력: ");
		int a=in.nextInt();
		
		v.add(a);
		
		cot++;
		if(cot==5)
			break;
		
		}

		Iterator<Integer> iterator1=v.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		
		
		
	}
}
