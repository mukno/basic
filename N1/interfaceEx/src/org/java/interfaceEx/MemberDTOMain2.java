package org.java.interfaceEx;

import java.util.Scanner;

import org.java.MemberDTO.MemberDTO;

public class MemberDTOMain2 {

	public static void main(String[] args) {
		MemberDTO member1=new MemberDTO("m1", "1111", "s1", 22);

		
		//Scanner클래스 이용해서 쿼리문이 insert면 회원 가입 실행
		//Scanner클래스 이용해서 쿼리문이 update면 회원 갱신 실행
		//Scanner클래스 이용해서 쿼리문이 delete면 회원 삭제 실행
		//Scanner클래스 이용해서 쿼리문이 select면 회원 조회 실행
		//while문이용해서 exit가 입력되면 종료
		Scanner a=new Scanner(System.in);
		
		boolean bool=false;
		//while문>>DB의 데이터를 get할 때 사용
		while(!bool) {
			System.out.println("쿼리문 입력: ");
			String query=a.next();
			
			if(query.equals("insert")){
				System.out.println("회원가입");

				System.out.println("아이디: "+member1.getUserID());
				System.out.println("비밀번호: "+member1.getUserPW());
				System.out.println("이름: "+member1.getUserNAME());
				System.out.println("나이: "+member1.getUserAGE());
			}else if(query.equals("update")) {

				System.out.println("아이디: "+member1.getUserID());
				System.out.println("비밀번호: "+member1.getUserPW());
				System.out.println("이름: "+member1.getUserNAME());
				System.out.println("나이: "+member1.getUserAGE());
				System.out.println("회원수정");
			}else if(query.equals("delete")) {
				System.out.println("회원삭제");
			}else if(query.equals("select")) {
				System.out.println("회원조회");
			}else if(query.equals("exit")) {
				System.out.println("종료합니다.");
				bool=true;
			}else
				System.out.println("쿼리문 입력 오류... 쿼리문을 다시입력하세요.");
		}
		
	}

}
