package com.calltech.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.calltech.product.entity.Chamado;
import com.calltech.product.service.ChamadoService;


@RestController
@CrossOrigin
@RequestMapping(path="{project.version}/chamado")
public class ChamadoController {

	@Autowired
	private ChamadoService service;

	@GetMapping
	public List<Chamado> listar(){
		return service.tudo();
	}

	@PostMapping
	public void salvar(@RequestBody Chamado chamado){
		service.save(chamado);
	}
	@GetMapping(path="{id}")
	public Optional<Chamado> porId(@PathVariable Long id){
		return service.porId(id);
	}
	
	
}
