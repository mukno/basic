package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.BookVO;

public interface BookMapper {
	public int book_insert(BookVO vo);
	public List<BookVO> getList();
	public int book_delete(String code);
	public int book_modify(@Param("code")String code,@Param("price")int price);
	public List<BookVO> book_search(@Param("criteria")String criteria,@Param("keyword")String keyword);
	
}
