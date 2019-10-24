package com.spring.service;

import java.util.List;

import com.spring.domain.BoardAttachVO;
import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;

public interface BoardService {
	//글 등록
	public void register(BoardVO vo) throws Exception;
	public List<BoardVO> selectAll(Criteria cri);
	public BoardVO board_read(int bno);
	public boolean modify(BoardVO vo);
	public boolean remove(int bno);
	public int getTotalCount(Criteria cri);
	//git test용 추가 첨부파일목록 가져오기
	public List<BoardAttachVO> getAttachList(int bno);
	
	
	
	
	

}
