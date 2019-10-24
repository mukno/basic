package com.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("/doA")
	public String doA() {
		logger.info("doA call..");
		return "result";
	}
	@RequestMapping(value = "/doB", method = RequestMethod.GET)
	public ModelAndView doB() {
		//model=scope(Request 객체)
		//View = jsp
		
		logger.info("doB call");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("test","ModelAndView");
		return mav;
	}
	
	
	@GetMapping("/doC")
	public String doC(RedirectAttributes rttr) {
		logger.info("doC 호출..");
		//RedirectAttributes:sendRedirect 페이지 이동할때 값을 보낼수 있는
		//잠깐만 session에 쓸떄 필요한 객체
		
		
		//rttr.addFlashAttribute("age",10);//http://localhost:8083/login
		rttr.addAttribute("age",10);//http://localhost:8083/login?age=10경로보임
		//redirect =>sendRedirect방식으로 이동 안써주면 forward방식
		return "redirect:/login";
	}
	
	
	
	
}
