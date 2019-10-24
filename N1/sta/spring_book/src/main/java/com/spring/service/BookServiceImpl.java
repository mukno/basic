package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.domain.BookVO;
import com.spring.mapper.BookMapper;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Inject
	private BookMapper mapper;
	
	@Override
	public int book_insert(BookVO vo) {
		return mapper.book_insert(vo);
	}
	
	@Override
	public List<BookVO> getList() {		
		return mapper.getList();
	}

	@Override
	public int book_delete(String code) {
		return mapper.book_delete(code);
	}

	@Override
	public int book_modify(String code, int price) {
		return mapper.book_modify(code, price);
	}

	@Override
	public List<BookVO> book_search(String criteria, String keyword) {
		return mapper.book_search(criteria, keyword);
	}
	
	
	
}
