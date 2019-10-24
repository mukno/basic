package com.spring.service;

import java.util.List;

import com.spring.domain.BookVO;

public interface BookService {
	public int book_insert(BookVO vo);
	public List<BookVO> getList();
	public int book_delete(String code);
	public int book_modify(String code,int price);
	public List<BookVO> book_search(String criteria,String keyword);
}
