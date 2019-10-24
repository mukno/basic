package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyVO;

public interface ReplyMapper {

	
	public int insert(ReplyVO vo);
	public ReplyVO read(int rno);
	public List<ReplyVO> getList(@Param("bno")int bno,@Param("cri")Criteria cri);
	public int update(ReplyVO vo);
	public int delete(int rno);
	public int getCountByBno(int bno);
}
