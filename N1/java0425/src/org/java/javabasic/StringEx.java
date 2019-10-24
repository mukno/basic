package org.java.javabasic;

public class StringEx {
	
	public static void main(String[] args) {
		System.out.println("String");
		//String 생성 방법
		String str1="문자열";
		String str2=new String("문자열");
		
		char[] arrCh= {'문','자','열'};
		String str3=new String(arrCh);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2==str3);
		
		
		//cahrAt 문자열 특정자리 값반환
		String strEx="12345 userId ";
		String strEx2="abcd";
		System.out.println(strEx.charAt(3));
		//length 문자열 길이
		System.out.println(strEx.length());
		//compareTo ... 사전 순서(음수,0,양수) 사전에서 빨리 검색하면 음수
		System.out.println(strEx.compareTo(strEx2));
		//concat ...두문자열을 합친다..(기존 문자열은 변하지않는다)
		System.out.println(strEx.concat(strEx2));
		
	
		String a="aaaa";
		String A="AAAA";
		System.out.println(a.toUpperCase());
		System.out.println(A.toLowerCase());
		
		String b=" ab c ";
		System.out.println(b);
		System.out.println(b.trim()+" : "+b.trim().length());
		
		//contain :포함이 되어 있느냐
		String str="userId 12345";
		System.out.println(str.contains("user"));
		
		//replace() 문자열을 바꿔라..
		System.out.println(str.replace("userId", "userPw"));
		System.out.println(str);
		
		//split "문자열을 '구분자'를 기준으로 잘라서 String배열에 저장"
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
		
		//subSequence(시작번지부터 끝번지 값 앞값까지 가져온다.)
		System.out.print(host.subSequence(0, 10));
		System.out.print(host.subSequence(12, 15));
		
		//처음요소부터 가져올경우 (0,가져올갯수);
		System.out.print(host.subSequence(0, 5)); //5개
		
		//host~4까지 문자열에서 .do를 빼고 나머지 문자열을 출력
		//콘솔에 출력하기 위해서 subSequence 메서드 하나만 사숑하세요
		
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
