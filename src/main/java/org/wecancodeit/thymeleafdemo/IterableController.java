package org.wecancodeit.thymeleafdemo;

import static java.util.Arrays.asList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IterableController {

	@RequestMapping("/show_iterable")
	public String showIterable(Model model) {
		Iterable<Person> persons = asList(new Person("Ford", "Prefect"), new Person("Arthur", "Dent"));
		model.addAttribute("myIterable", persons);
		return "iterable";
	}
}
