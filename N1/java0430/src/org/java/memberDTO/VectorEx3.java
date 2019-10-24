package org.java.memberDTO;

import java.util.Vector;

public class VectorEx3 {
	public static void main(String[] args) {
		
		Vector<MemberDTO> members=new Vector<MemberDTO>();
		
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		
		//아래와 같다
		//MemberDTO m1=new MemberDTO();
		//members.add(m1);
		
		
		//Vector0번째 요소의 맴버를 set
		members.get(0).setUserId("m1");
		members.get(0).setUserPw("11111");
		members.get(0).setUserName("s1");
		members.get(0).setUserAge(10);//자동박싱
		
		String userId=members.get(0).getUserId();
		String userPw=members.get(0).getUserPw();
		String userName=members.get(0).getUserName();
		int userAge=members.get(0).getUserAge();
		
		System.out.println("아이디: "+userId);
		System.out.println("비밀번호: "+userPw);
		System.out.println("이름: "+userName);
		System.out.println("나이: " +userAge);
		
		//members.get(1)요소를 setters,getters를 이용해서
		//각각필드를 모두 초기화(임의값으로 )하고 콘솔에 출력
		members.get(1).setUserId("m2");
		members.get(1).setUserPw("2222");
		members.get(1).setUserName("s2");
		members.get(1).setUserAge(20);//자동박싱
		
		userId=members.get(1).getUserId();
		userPw=members.get(1).getUserPw();
		userName=members.get(1).getUserName();
		userAge=members.get(1).getUserAge();
		
		System.out.println("아이디: "+userId);
		System.out.println("비밀번호: "+userPw);
		System.out.println("이름: "+userName);
		System.out.println("나이: " +userAge);
		
		
		
		
	}

}
