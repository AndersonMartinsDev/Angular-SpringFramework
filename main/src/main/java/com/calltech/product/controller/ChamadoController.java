package com.calltech.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calltech.product.entidades.Chamado;
import com.calltech.product.validation.ChamadoRegras;

@RestController
@RequestMapping(path="v1/chamado")
public class ChamadoController {

	@Autowired
	private ChamadoRegras chamado;
	
	@GetMapping
	public List<Chamado> listar(){
		return chamado.tudo();
	}
	
	@GetMapping(path="{id}")
	public Optional<Chamado> porId(@PathVariable Long id){
		return chamado.porId(id);
	}
	
	
}
