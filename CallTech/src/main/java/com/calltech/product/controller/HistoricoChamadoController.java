package com.calltech.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calltech.product.entidades.HistoricoChamado;
import com.calltech.product.validation.HistoricoChamadoRegras;

@RestController
@RequestMapping(path="v1/historico")
public class HistoricoChamadoController {
	
	@Autowired
	private HistoricoChamadoRegras historicoRegras;
	
	@GetMapping
	private List<HistoricoChamado> listar(){
		return historicoRegras.todos();
	}
	
	private Optional<HistoricoChamado> porId(@PathVariable Long id){
		return historicoRegras.porId(id);
	}
	
	
}
