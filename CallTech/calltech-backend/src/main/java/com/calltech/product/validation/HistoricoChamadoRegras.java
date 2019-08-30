package com.calltech.product.validation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calltech.product.entidades.HistoricoChamado;
import com.calltech.product.repository.HistoricoChamadoRepository;

@Service
public class HistoricoChamadoRegras {

	@Autowired
	private HistoricoChamadoRepository historicoRepositorio;
	
	public List<HistoricoChamado> todos(){
		return historicoRepositorio.findAll();
	}
	
	public Optional<HistoricoChamado> porId(Long id){
		return historicoRepositorio.findById(id);
	}
	
}
