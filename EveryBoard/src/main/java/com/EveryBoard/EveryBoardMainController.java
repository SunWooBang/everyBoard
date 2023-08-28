package com.EveryBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EveryBoardMainController {
	
	@RequestMapping("/main.do") 
	public String Main() {
		System.out.println("Main Controller  실행됨");
		System.out.println("/main.do");
		return "main";
	}
	
	/*
	@RequestMapping("/error") 
	public String error() {
		System.out.println("아이고 에러났슈");
		return "아이고 에러났슈";
		
	}*/
	
}
