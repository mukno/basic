package org.java.collectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Integer> v1=new Vector<Integer>();
		
		v1.add(new Integer(10));//�ڽ� Integer a=new Integer(10)
		v1.add(20);//Integer a=10 �ڵ��ڽ�
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
		
		//Scanner�̿� �ؼ� 1~5���� ������ �Է��ؼ�
		//Vector�� ������ �ϰ� �ֿܼ� ����ϴ� ���α׷����� �غ�����
		//Scanner,Vector,Iterator,System.out.print
		//while�� ���
		Scanner in=new Scanner(System.in);

	
		Vector<Integer> v=new Vector<Integer>();
		int cot=0;
		while(true)
		{
		System.out.print("�����Է�: ");
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
