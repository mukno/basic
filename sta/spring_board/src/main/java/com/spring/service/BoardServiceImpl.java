package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.domain.BoardAttachVO;
import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.mapper.BoardAttachMapper;
import com.spring.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardMapper mapper;
	
	@Inject
	private BoardAttachMapper attachmapper;
	
	public void register(BoardVO vo) throws Exception {

		mapper.insertSelectKey(vo);
	}

	@Override
	public List<BoardVO> selectAll(Criteria cri) {
		return mapper.selectAll(cri);
		
	}

	@Override
	public BoardVO board_read(int bno) {
		return mapper.board_read(bno);
	}

	@Override
	public boolean modify(BoardVO vo) {
		return mapper.modify(vo);
	}

	@Override
	public boolean remove(int bno) {
		return mapper.remove(bno);
		
	}

	@Override
	public int getTotalCount(Criteria cri) {
		return mapper.totalCnt(cri);
	}

	@Override
	public List<BoardAttachVO> getAttachList(int bno) {
		return attachmapper.findByBno(bno);
	}
	
	
	
	
	

}
