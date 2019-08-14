package com.calltech.product.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calltech.product.entidades.Chamado;

@Repository
@Transactional
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
