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
		//��ü�� ������ �������� Ÿ���� �ܺο��� ����
		GenericEx<String> g1=new GenericEx();
		//��� Ÿ���� �ܺο��� ����(���׸�)
		Vector<String> v1=new Vector<String>();
		//��ü�� ���� >> ����

		//1. ���Ϳ�ҿ� �߰�
		v1.add(new String("java"));
		v1.add(new String("SPRING"));
		v1.add(new String("javascript"));
		v1.add(new String("JSP"));
		v1.add(new String("servlet"));
		
		System.out.println(v1.size());// ������ ����(��Ұ���)
		
		//2. Ư���ε����� �߰�
		v1.add(2,new String("MVC"));//�ι�° ��ҿ� �߰�
		
		System.out.println(v1.size());//������ ����(��Ұ���)
		
		//3.���͸� �ٸ� ���Ϳ� �߰�
		Vector<String> v2=new Vector<String>();
		v2.add(new String("v2Vector1"));
		v2.add(new String("v2Vector2"));
		v2.add(new String("v2Vector3"));
		System.out.println(v2.size());
		
		v1.addAll(v2);//v1���Ϳ� v2�� �߰�
		System.out.println(v1.size());
		
		//4. ���� ����
		//v1.clear();
		System.out.println(v1.size());
		
		//5. ��ü�� ��ҿ� ���ԵǾ��ִ���
		System.out.println(v1.contains("v2Vector1"));
		
		//6. ��ü��Ҹ� get
		String s1=v1.get(0);
		System.out.println(s1);
	
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		
		//size(),get,for���� �̿� ����v1�� ��� ��Ҹ� �ֿܼ� ǥ��
		for(int i=0;i<v1.size();i++){
			System.out.print(" "+v1.get(i));
		}
		System.out.println("\n-------------------");
		for(String a:v1)
		{
			System.out.print(a);
		}
		//Iterator(��ü)
        Iterator<String> iterator=v1.iterator();
		
        //hasNext:�����ϸ�
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());//��Ҹ� 0���� ������� ó��
        }
        //7.isEmpty �������
        System.out.println(v1.isEmpty());
       
        ///////////////////////////////////////////////////////////
        Iterator<String> iterator2=v1.iterator();
        while(iterator2.hasNext())
        {
        	System.out.print(iterator2.next());//��Ҹ� 0���� ������� ó��
        }
        System.out.println("\n-------------------------");
        //8.remove "��� ����"
        v1.remove(0);
        
        Iterator<String> iterator3=v1.iterator();
        while(iterator3.hasNext())
        {
        	System.out.print(iterator3.next());//��Ҹ� 0���� ������� ó��
        }
		////////////////////////////////////////////////////////////
        //9. remove "��� ������ ����"
        v1.remove("SPRING");
        Iterator<String> iterator4=v1.iterator();
        while(iterator4.hasNext())
        {
        	String str=iterator4.next();
        	System.out.println(str);
        }
        
        
        //10. toArray"��ü ��Ҹ� �迭"
        System.out.println();
		
		
		
		
		
		
	}

}
