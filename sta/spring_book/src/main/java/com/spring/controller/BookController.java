package com.spring.controller;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BookVO;
import com.spring.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BookController {
	
	@Inject
	private BookService service;

	@GetMapping(value= {"/insert","/delete","/modify"})
	public String handleGet() {
		log.info("insert,delete,modify get 호출..");
		
		return "redirect:/";
		
	}
	
	@PostMapping("/insert")
	public String insert(BookVO vo,RedirectAttributes rttr) {
		log.info(""+vo);
		
		

		try {
			int result=service.book_insert(vo);
			if (result>0) {
				return "redirect:select";
				
			}else {
				
				return "redirect:/";
			}
			
		} catch (Exception e) {
		
			rttr.addFlashAttribute("tab","insert");
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/select")
	public String bookList(Model model) {
		log.info("전체 리스트 호출....");
		
		List<BookVO> list=service.getList();
		
		//request 객체 == Model
		model.addAttribute("list", list);
		
		return "book_selectAll";
	}
	
	//삭제요청 처리 컨트롤러
	//삭제가 성공한 후 전체 리스트 보여주기
	@PostMapping("/delete")
	public String bookDelete(String code,RedirectAttributes rttr) {
		
		int result=service.book_delete(code);
		
		if(result>0)
		{
			return "redirect:select";
			
		}else {
			
			rttr.addFlashAttribute("tab","delete");
			return "redirect:/";
		}
		
	}
	
	//도서 정보 수정 컨트롤러(코드가 일치하는 경우 가격수정)
	//수정 성공시 전체 리스트 보여주기
	@PostMapping("modify")
	public String bookModify(String code,int price,RedirectAttributes rttr) {
		
		int result=service.book_modify(code, price);
		
		if (result>0){
			
			 
			return "redirect:select";
		}else {
			rttr.addFlashAttribute("tab","modify");
			return "redirect:/";
		}
		
	}
	@GetMapping("/search")
	public String search(RedirectAttributes rttr) {
		rttr.addFlashAttribute("tab","search");

		return "redirect:/";
	}
	
	
	@PostMapping("/search")
	public String bookSearch(String criteria,String keyword,Model model,RedirectAttributes rttr) {
		
		List<BookVO> list=service.book_search(criteria, keyword);
		
		//request 객체 == Model
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
			return "book_searchAll";
			
		}else {
			return "redirect:/";
		}
	
		
		
	}
	
	
	
	
	
}
