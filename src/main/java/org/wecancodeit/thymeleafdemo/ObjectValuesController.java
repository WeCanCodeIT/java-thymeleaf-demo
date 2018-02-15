package org.wecancodeit.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/object-values")
public class ObjectValuesController {
	
	@RequestMapping("/show_thing")
	public String showThing(Model model) {
		Person person = new Person("Ford", "Prefect");
		model.addAttribute("thing", person);
		model.addAttribute(person);
		return "object-properties";
	}
}
