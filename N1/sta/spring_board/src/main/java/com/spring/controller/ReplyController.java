package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyPageDTO;
import com.spring.domain.ReplyVO;
import com.spring.service.ReplyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/replies/*")
public class ReplyController {
	
	@Autowired
	private ReplyService service;
	
	@PostMapping(value="/new",consumes = "application/json",
			produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) throws Exception{
		log.info("댓글 삽입 요청....");
		
		
		
		return service.register(vo)?
				new ResponseEntity<>("success",HttpStatus.OK):
					new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/{rno}")
	public ResponseEntity<ReplyVO> get(@PathVariable("rno")int rno) throws Exception{
		log.info("댓글 하나 가져오기");
		
		return new ResponseEntity<>(service.read(rno),HttpStatus.OK);
	}
	
	@GetMapping(value="/pages/{bno}/{page}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable("bno")int bno,@PathVariable("page") int page) throws Exception{
		
		log.info("댓글 전체 가져오기");
		Criteria cri=new Criteria(page, 10);
		return new ResponseEntity<>(service.getList(cri, bno),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{rno}",method= {RequestMethod.PATCH,RequestMethod.PUT})
	public ResponseEntity<String> update(@PathVariable("rno")int rno,@RequestBody ReplyVO vo) throws Exception{
		log.info("댓글 수정..");
		vo.setRno(rno);
		
		return service.modify(vo)?
				new ResponseEntity<String>("SUCCESS",HttpStatus.OK):
				new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
				
		
	}
	
	@RequestMapping(value="/{rno}",method= {RequestMethod.DELETE})
	public ResponseEntity<String> delete(@PathVariable("rno")int rno) throws Exception{
		
		
		return service.delete(rno)?
				new ResponseEntity<String>("SUCCESS",HttpStatus.OK):
				new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
				
	}
	
	
	
	
}
