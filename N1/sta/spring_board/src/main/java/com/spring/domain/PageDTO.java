package com.spring.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {
	//VO(DB쪽관련),DTO(화면세팅관련) 전체적역할은 비슷
	//list.jsp에서 필요한 정보들을 담는 객체
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	//화면 하단의 전체 페이지 수 
	private int total;
	private Criteria cri;
	
	
	public PageDTO(Criteria cri,int total)
	{
		this.cri=cri;
		this.total=total;
		//Math.ceil = 소수점 이하를 올림한다.
		this.endPage=(int)(Math.ceil(cri.getPageNum()/10.0))*10;
		this.startPage=endPage-9;
		
		int realEnd=(int)(Math.ceil((total/1.0)/cri.getAmount()));
		if(realEnd<this.endPage) {
			this.endPage=realEnd;
		}
		
		this.prev=this.startPage>1;
		this.next=this.endPage<realEnd;
				
		
	}
	

}
