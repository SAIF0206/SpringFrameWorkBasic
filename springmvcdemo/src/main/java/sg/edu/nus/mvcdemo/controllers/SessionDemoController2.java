package sg.edu.nus.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userssion")
public class SessionDemoController2 {
	
	@RequestMapping("/scontroller2")
	public String firstMethod () {
		return "page2";
	}
	
	@RequestMapping("/s2")
	public String s1Method() {
		return "page2";
		
	}

}
