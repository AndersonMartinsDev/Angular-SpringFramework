package com.calltech.product.validation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calltech.product.entidades.Chamado;
import com.calltech.product.repository.ChamadoRepository;

@Service
public class ChamadoRegras {
	
	@Autowired
	private ChamadoRepository chamadoRepositorio;

	
	public List<Chamado> tudo(){
		try {

			return chamadoRepositorio.findAll();
		}catch(Exception ex) {
			return null;
		}
	}
	
	public Optional<Chamado> porId(Long id){
		return chamadoRepositorio.findById(id);
	}
	
	
	
}
