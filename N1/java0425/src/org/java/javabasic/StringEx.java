package org.java.javabasic;

public class StringEx {
	
	public static void main(String[] args) {
		System.out.println("String");
		//String ���� ���
		String str1="���ڿ�";
		String str2=new String("���ڿ�");
		
		char[] arrCh= {'��','��','��'};
		String str3=new String(arrCh);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2==str3);
		
		
		//cahrAt ���ڿ� Ư���ڸ� ����ȯ
		String strEx="12345 userId ";
		String strEx2="abcd";
		System.out.println(strEx.charAt(3));
		//length ���ڿ� ����
		System.out.println(strEx.length());
		//compareTo ... ���� ����(����,0,���) �������� ���� �˻��ϸ� ����
		System.out.println(strEx.compareTo(strEx2));
		//concat ...�ι��ڿ��� ��ģ��..(���� ���ڿ��� �������ʴ´�)
		System.out.println(strEx.concat(strEx2));
		
	
		String a="aaaa";
		String A="AAAA";
		System.out.println(a.toUpperCase());
		System.out.println(A.toLowerCase());
		
		String b=" ab c ";
		System.out.println(b);
		System.out.println(b.trim()+" : "+b.trim().length());
		
		//contain :������ �Ǿ� �ִ���
		String str="userId 12345";
		System.out.println(str.contains("user"));
		
		//replace() ���ڿ��� �ٲ��..
		System.out.println(str.replace("userId", "userPw"));
		System.out.println(str);
		
		//split "���ڿ��� '������'�� �������� �߶� String�迭�� ����"
		//                010-0000-1111
		String ab="111-2222-3333";
		
		System.out.println(ab.split("-"));
		String[] abb=ab.split("-");
		
		for(int i=0;i<abb.length;i++)
		{
			System.out.println(abb[i]);
		}
		
		for(String bbb:abb)
		{
			System.out.println(bbb);
		}
		
		
		String host="MemberInsert.do";
		String host2="Update.do";
		String host3="DBMemberSelect.do";
		String host4="ActionDelete.do";
		
		//subSequence(���۹������� ������ �� �հ����� �����´�.)
		System.out.print(host.subSequence(0, 10));
		System.out.print(host.subSequence(12, 15));
		
		//ó����Һ��� �����ð�� (0,�����ð���);
		System.out.print(host.subSequence(0, 5)); //5��
		
		//host~4���� ���ڿ����� .do�� ���� ������ ���ڿ��� ���
		//�ֿܼ� ����ϱ� ���ؼ� subSequence �޼��� �ϳ��� ����ϼ���
		
		String abc[]=new String[]{host,host2,host3,host4};
		for(String bbc:abc)
		{
			System.out.println(bbc.subSequence(0, bbc.length()-3));
		}
		System.out.println(host.substring(0, 3));
		System.out.println(host.substring(0, 3))
		;
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
