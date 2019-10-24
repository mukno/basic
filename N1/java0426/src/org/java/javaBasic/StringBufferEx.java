package org.java.javaBasic;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer strb=new StringBuffer("문자열");
		String str="문자열";

		//String은 수정불가 replace (자리정하고,수정)
		System.out.println(str.replace("문", "111"));
		System.out.println(str);
		
		//StringBuffer 수정가능
		//append메서드 뒤로 추가 (수정이 됨)
		System.out.println(strb);
		strb.append("문");
		System.out.println(strb);
		strb.append("또추가");
		System.out.println(strb);

		//insert 메서드 특정 요소 번지에 추가 (offset,) : 위치
		strb.insert(4, "4번지에 추가");
		System.out.println(strb);//특정 위치잡고 추가
		
		//replace (어디부터,어디까지 지우고,어떤것으로 변경)
		strb.replace(0,4,"변경문자열");
		System.out.println(strb);
		
		//delete 문자열을 삭제
		strb.delete(0, 4);
		System.out.println(strb);
		
		//reverse 문자열 정렬 역순
		strb.reverse();
		System.out.println(strb);
		
		
		


		
		
		
	}

}
