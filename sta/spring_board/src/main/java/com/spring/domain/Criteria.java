package com.spring.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;//페이지번호
	private int amount;//페이지당보여줄 페이지 게시물 수
	private String type;//검색조건
	private String keyword;//검색어
	
	
	public Criteria() {
		this(1,10);
		
	}
	
	public Criteria(int pageNum,int amount) {
		this.pageNum=pageNum;
		this.amount=amount;
	}
	
	public String[] getTypeArr() {
		//list.jsp의 type에서 넘어노느것이 TCW인경우 => {'T','C','W'} 로 리턴
		return type==null? new String[] {}:type.split("");
	}

}
