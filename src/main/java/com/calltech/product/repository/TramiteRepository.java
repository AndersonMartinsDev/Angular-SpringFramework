package com.calltech.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calltech.product.entity.Tramite;

@Repository
public interface TramiteRepository extends JpaRepository<Tramite, Long> {

}
