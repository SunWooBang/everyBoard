package com.EveryBoardControllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EveryBoardMainController {
	
	@ResponseBody
	@RequestMapping("/error") 
	public String error() {
		System.out.println("아이고 에러났슈");
		return "아이고 에러났슈";
		
	}
	
	@RequestMapping("/main.do") 
	public void main() {
		System.out.println("main.do 실행");
		
	}
	
}
