package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateBoard(vo);
	}

	@Override
	public int deleteBoard(int bno) {
		// TODO Auto-generated method stub
		return mapper.deleteBoard(bno);
	}

	@Override
	public BoardVO getBoard(int bno) {
		// TODO Auto-generated method stub
		return mapper.selectOne(bno);
	}

	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}
	

}
