package MainController;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@RequestMapping("/main.do")
	public String hello() {
		return "main";
	}
}
