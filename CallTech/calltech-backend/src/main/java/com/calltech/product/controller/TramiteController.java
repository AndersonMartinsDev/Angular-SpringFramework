package com.calltech.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calltech.product.entity.Tramite;
import com.calltech.product.service.TramiteService;

@RestController
@RequestMapping(path="${project.version}/tramite")
public class TramiteController {
	
	@Autowired
	private TramiteService tramite;

	@GetMapping
	public List<Tramite> listar(){
		return tramite.tudo();
	}
	
	@GetMapping(path="{id}")
	public Optional<Tramite> porId(@PathVariable Long id){
		return tramite.porId(id);
	}
}
