package org.java.javabasic;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		
		//StringTokenizer Ŭ���� ���й��ڸ� �������� ������ Ŭ����
		//���й���(delimiter)
		//��ū(token)
		String query="userId=m1&userPw=111&userName=s1";
		//query��� ���ڿ��� ���й���&�� ���н�Ű�� Ŭ����
		StringTokenizer st=new StringTokenizer(query,"&");
		
		//countTokens ��ū�� ����
		System.out.println(st.countTokens());
		
		//hasMoreTokens�޼��� ��ū�� ����
		//token�� �����ϸ�
		while(st.hasMoreTokens())
		{
			String str=st.nextToken(); //������� �Է�
			System.out.println(str);
		}
		
	}

}
