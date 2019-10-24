package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardAttachVO;
import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	
	
	@Autowired
	private BoardService service;
	

	@GetMapping("/register")
	public void registerGet() {
		
	}

	
	@PostMapping("/register")
	public String registerPost(BoardVO vo,RedirectAttributes rttr) throws Exception {
		log.info("dd "+vo);
		service.register(vo);
		rttr.addFlashAttribute("result", vo.getBno());
		return "redirect:list";
	}
	
	// list로 들어오는 컨트롤러
	//DB작업(전체리스트 가져오기)
	//Model에 담고 페이지 이동
	@GetMapping("/list")
	public void listAll(Model model,Criteria cri) {
		
		List<BoardVO> lists=service.selectAll(cri);
				
		
		model.addAttribute("lists",lists);
		model.addAttribute("pageDTO",new PageDTO(cri, service.getTotalCount(cri)));
		
	}
	
	@GetMapping(value= {"/read","/modify"})
	public void read(int bno,Model model,@ModelAttribute("cri")Criteria cri) {
		
		
		//bno에 해당하는 내용 db작업한 후 
		BoardVO vo=service.board_read(bno);
		model.addAttribute("vo",vo);
		
		log.info("게시글 보기.."+vo+"...cri= "+cri);
		
		//model에 담고 페이지 이동하기.
		
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO vo,Criteria cri,RedirectAttributes rttr) {
		
		log.info("cri="+cri);
		//modify.jsp에서 넘긴 값 가져오기
		//서비스 요청=>title,content수정
		if(service.modify(vo)) {
			rttr.addFlashAttribute("result","success");
		}
		rttr.addAttribute("pageNum",cri.getPageNum());
		rttr.addAttribute("amount",cri.getAmount());
		rttr.addAttribute("type",cri.getType());
		rttr.addAttribute("keyword",cri.getKeyword());
		
		
		return "redirect:list";
		
	}
	
	@PostMapping("/remove")
	public String remove(int bno,RedirectAttributes rttr,Criteria cri) {
		
		log.info("ddd"+bno+"..cri="+cri);
		if(service.remove(bno)) {
			//post방식처럼 경로가 안보인다.
			rttr.addFlashAttribute("result","success");
		}
		//get방식 처럼 보인다 경로가
		rttr.addAttribute("pageNum",cri.getPageNum());
		rttr.addAttribute("amount",cri.getAmount());
		rttr.addAttribute("type",cri.getType());
		rttr.addAttribute("keyword",cri.getKeyword());
		 
		
		 
		
		return "redirect:list";
	}
	//첨부물 전체 목록 가져오기
	public ResponseEntity<List<BoardAttachVO>> getAttachList(int bno){
		log.info("첨부 목록 가져오기");
		return new ResponseEntity<>(service.getAttachList(bno),HttpStatus.OK);
	}
	
	

}

