package org.java.utilEx;

public class MathEx {

	public static void main(String[] args) {
		Math.random();//난수0<= <1
		System.out.println(Math.random());
		
		//1~10까지 정수만 콘솔 출력
		//0~0.99999...
		
		System.out.println((int)(Math.random()*10));
		System.out.println((int)Math.random()+1);
		
		//정수1~45까지 저장(배열)
		int[] lotto=new int[45];
		for(int i=0;i<45;i++)
		{
			lotto[i]=i+1;
		}
		
		int idx;//배열의 인덱스
		int box;//임의의 인덱스 값 저장
		
		for(int i=0;i<100;i++)//100번실행
		{//0~44
			idx=(int)(Math.random()*45);
			
			box=lotto[idx];//랜덤한 배열의값을 박스에 저장
			lotto[idx]=lotto[0];//배열의 첫번째 값을 선택된 배열
			lotto[0]=box;//box의 값을 배열의 첫번째 요소에 대입
		}
		//0번지부터 5번짂지 콘솔에 출력

		for(int i=0;i<6;i++)
		{
			System.out.print(lotto[i]+" ");
		}
		
		
}
}
