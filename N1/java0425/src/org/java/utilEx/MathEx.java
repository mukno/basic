package org.java.utilEx;

public class MathEx {

	public static void main(String[] args) {
		Math.random();//����0<= <1
		System.out.println(Math.random());
		
		//1~10���� ������ �ܼ� ���
		//0~0.99999...
		
		System.out.println((int)(Math.random()*10));
		System.out.println((int)Math.random()+1);
		
		//����1~45���� ����(�迭)
		int[] lotto=new int[45];
		for(int i=0;i<45;i++)
		{
			lotto[i]=i+1;
		}
		
		int idx;//�迭�� �ε���
		int box;//������ �ε��� �� ����
		
		for(int i=0;i<100;i++)//100������
		{//0~44
			idx=(int)(Math.random()*45);
			
			box=lotto[idx];//������ �迭�ǰ��� �ڽ��� ����
			lotto[idx]=lotto[0];//�迭�� ù��° ���� ���õ� �迭
			lotto[0]=box;//box�� ���� �迭�� ù��° ��ҿ� ����
		}
		//0�������� 5������ �ֿܼ� ���

		for(int i=0;i<6;i++)
		{
			System.out.print(lotto[i]+" ");
		}
		
		
}
}
