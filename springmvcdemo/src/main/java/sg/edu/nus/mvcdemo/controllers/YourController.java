package sg.edu.nus.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.mvcdemo.model.Product;

@Controller
@RequestMapping("/your")
public class YourController {

	@GetMapping("/hello/{msg}")
	public String yourMethod(@PathVariable ("msg") String message) {
		System.out.println("Message" + message);
		return "Welcome";
	} 
	
	@GetMapping("/Controller1")
	public String Controller1() {
		return "redirect:/your/Controller2";
	
	}
	
	@GetMapping("/Controller2")
	public String Controller2() {
		return "test";
	
	}
	
	@GetMapping("/modeldemo")
	public String modelMethod(Model model)
	{	
		Product p = new Product(1, "Laptop", "Dell inspiron", "Electronic", 890.65,20 );
		model.addAttribute("product", p);
		return "print";
	}


}
