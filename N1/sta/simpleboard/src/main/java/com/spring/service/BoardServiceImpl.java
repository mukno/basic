package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.persistence.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;
	
	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.board_update(vo);
	}

	@Override
	public int deleteBoard(int bno) {
		// TODO Auto-generated method stub
		return dao.deleteBoard(bno);
	}

	@Override
	public BoardVO getBoard(int bno) {
		// TODO Auto-generated method stub
		return dao.selectOne(bno);
	}

	@Override
	public ArrayList<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	

}
