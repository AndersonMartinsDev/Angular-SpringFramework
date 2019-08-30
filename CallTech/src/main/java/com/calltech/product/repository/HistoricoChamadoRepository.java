package com.calltech.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calltech.product.entidades.HistoricoChamado;

@Repository
public interface HistoricoChamadoRepository extends JpaRepository<HistoricoChamado, Long> {

}
