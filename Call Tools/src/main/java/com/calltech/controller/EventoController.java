package com.calltech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calltech.model.Evento;
import com.calltech.repository.EventoRepository;

@Controller
@RequestMapping("cadastrarEvento")
public class EventoController {
	
	
	private EventoRepository er;
	
	
	@RequestMapping(value="cadastrarEvento", method=RequestMethod.GET)
	private String form() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value="cadastrarEvento", method = RequestMethod.POST)
	private String form(Evento evento) {
		
		return "redirect:/cadastrarEvento";
	}

}
