package com.savej.ctrls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexCtrl {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
