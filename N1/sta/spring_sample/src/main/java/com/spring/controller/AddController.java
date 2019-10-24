package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.NumVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AddController {
	
	//http://localhost:8080/add=> add.jsp
	@GetMapping("/add")
	public void add() {
		log.info("add..");
		
	}
//	@PostMapping("/add")
//	public void add(HttpServletRequest req) {
//		log.info("add......");
//		log.info("num1="+req.getParameter("num1"));
//		log.info("num2="+req.getParameter("num2"));
//		a
//	}
//	@PostMapping("/add")
//	public void add(@RequestParam(value="num3",required=false,defaultValue="0")int a,
//					@RequestParam("num4")int b) {
//		log.info("add......");
//		log.info("num3="+a);
//		log.info("num4="+b);
//		
//	}
	@PostMapping("/add")
	public String add(@ModelAttribute("vo")NumVO vo,int page,Model model)
	{
		//ModelAttribute("") = jsp view단에 numVO를 vo로 사용가능 numVO는 사용불가
		//Model.addAttribute() 를 대체한 어노테이션
		
		
		
		//Model=>Request객체 개념
		log.info("add..");
		log.info("num1="+vo.getNum1());
		log.info("num2="+vo.getNum2());
		log.info("page= "+page);
		
		model.addAttribute("page",page);
		return "addResult";
		
	}
	

}
