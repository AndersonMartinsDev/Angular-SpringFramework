package com.calltech.product.validation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calltech.product.entidades.Tramite;
import com.calltech.product.repository.TramiteRepository;

@Service
public class TramiteRegras {

	@Autowired
	private TramiteRepository tramiteRepositorio;
	
	public List<Tramite> tudo(){
		return tramiteRepositorio.findAll();
	}
	
	public Optional<Tramite> porId(Long id){
		return tramiteRepositorio.findById(id);
	}
	
	
}
