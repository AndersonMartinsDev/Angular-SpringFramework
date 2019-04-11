package com.calltech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.calltech.model.Evento;

@Component
public interface EventoRepository extends CrudRepository <Evento ,String> {

}
