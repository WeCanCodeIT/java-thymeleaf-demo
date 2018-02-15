package org.wecancodeit.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleValueController {

	@RequestMapping("/simple_string")
	public String showString(Model model) {
		model.addAttribute("name", "Ford Prefect");
		return "simple-string";
	}
	
	@RequestMapping("/show_integer")
	public String showInteger(Model model) {
		model.addAttribute("answer", 42);
		return "integer";
	}
}
