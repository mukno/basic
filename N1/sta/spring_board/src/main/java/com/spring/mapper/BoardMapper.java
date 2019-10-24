package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;

public interface BoardMapper {
	public void insertSelectKey(BoardVO vo);
	public List<BoardVO> selectAll(Criteria cri);
	public BoardVO board_read(int bno);
	public boolean modify(BoardVO vo);
	public boolean remove(int bno);
	public int totalCnt(Criteria cri);
	
	
	
	//댓글 수 카운트 수
	public void updateReplyCnt(@Param("bno")int bno,@Param("amount")int amount);

}
