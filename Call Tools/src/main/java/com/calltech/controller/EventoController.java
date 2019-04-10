package com.calltech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping(value="cadastrarEvento")
	private String form() {
		return "evento/formEvento";
	}

}
