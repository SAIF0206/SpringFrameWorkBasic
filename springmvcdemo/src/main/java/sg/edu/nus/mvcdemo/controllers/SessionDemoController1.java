package sg.edu.nus.mvcdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import sg.edu.nus.mvcdemo.model.UserSession;

@Controller
@SessionAttributes("usersession")
public class SessionDemoController1 {

	@RequestMapping("/scontroller1")
	public String firstMethod(HttpSession session, Model model) {
		String modelData = "Hello! I am model Data";
		model.addAttribute("m", modelData);
		UserSession usersession = new UserSession("Jack", "Engg");
		session.setAttribute("usersession", usersession);

		return "page1";

	}
	
	@RequestMapping("/s1")
	public String s1Method (Model  model) {
		String modelData = "Hello! I am model Data";
		model.addAttribute("m", modelData);
		UserSession usersession = new UserSession("Jack", "Engg");
		model.addAttribute("usersession", usersession);

		return "page1";

		 
	}

}
