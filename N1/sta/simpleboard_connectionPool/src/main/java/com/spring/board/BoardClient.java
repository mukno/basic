package com.spring.board;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.domain.BoardVO;
import com.spring.service.BoardService;


public class BoardClient {
	public static void main(String[] args) {
		//스프링 컨테이너 시작
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		//스프링컨테이너로부터 boardServicimpl 객체를 lookup
		BoardService service=(BoardService)factory.getBean("boardService");
		//기능 호출
		//글등록
//		BoardVO vo=new BoardVO();
//		vo.setTitle("스프링");
//		vo.setContent("스프링");
//		vo.setWriter("홍길동");
//		service.insertBoard(vo);
//
		//전체목록 가져오기
		ArrayList<BoardVO> list=service.getBoardList();
		for(BoardVO vo:list) {
			System.out.println(vo);
		}
		
		//수정
//		BoardVO vo=new BoardVO();
//		vo.setTitle("dd");
//		vo.setContent("dd");
//		vo.setBno(2);
//		service.updateBoard(vo);
		
		
		//스프링 컨테이너 종료
		factory.close();
		
		
	}

}
