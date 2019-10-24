package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.domain.ReplyPageDTO;
import com.spring.domain.ReplyVO;
import com.spring.mapper.BoardMapper;
import com.spring.mapper.ReplyMapper;

@Service("reply")
public class ReplyServiceImpl implements ReplyService {
	@Inject
	private ReplyMapper mapper;
	@Inject
	private BoardMapper boardmapper;

	@Override
	public boolean register(ReplyVO vo) {
		boardmapper.updateReplyCnt(vo.getBno(),1);
		return mapper.insert(vo)==1?true:false;
	}


	@Override
	public ReplyVO read(int rno) throws Exception {
		return mapper.read(rno);
	}


	@Override
	public boolean delete(int rno) {
		ReplyVO vo=mapper.read(rno);
		boardmapper.updateReplyCnt(vo.getBno(),-1);
		return mapper.delete(rno)==1?true:false;
	}


	@Override
	public ReplyPageDTO getList(Criteria cri, int bno) throws Exception {
		return new ReplyPageDTO(mapper.getCountByBno(bno), 
				mapper.getList(bno, cri));
				
	}


	@Override
	public boolean modify(ReplyVO vo) throws Exception {
		
		return mapper.update(vo)==1?true:false;
	}
	
	

}
