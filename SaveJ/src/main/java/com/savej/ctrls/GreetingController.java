package com.savej.ctrls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Anderson") String name,
			Model model) {
		model.addAttribute("name", name);
		return "groot/greeting";
	}
}
