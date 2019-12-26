package com.calltech.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calltech.product.entity.Tramite;
import com.calltech.product.repository.TramiteRepository;

@Service
public class TramiteService {

	@Autowired
	private TramiteRepository tramiteRepositorio;
	
	public List<Tramite> tudo(){
		return tramiteRepositorio.findAll();
	}
	
	public Optional<Tramite> porId(Long id){
		return tramiteRepositorio.findById(id);
	}
	
	
}
