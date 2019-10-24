package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.domain.LoginVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
	@RequestMapping("/login")
	public void login(int age) {
		log.info("login 컨트롤러 동 작  "+age);
		
	}
	
	//login.jsp에서 post넘어오는 값 출력하는 컨트롤러 작성
	@PostMapping("/login")
	public String login(LoginVO vo) {
		log.info("userid= "+vo.getUserid());
		log.info("userpwd= "+vo.getUserpwd());
		
		
		return "logout";
	}
	
	
	
	@PostMapping("/logout")
	public String logout() {
		log.info("logout 컨트롤러 동 작");;
		
		
		return "logout";
	}

}
