package com.calltech.security.repository;

import com.calltech.security.entity.Perfil;
import com.calltech.security.entity.PerfilName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil,Long> {
    Optional<Perfil> findByName(PerfilName roleName);
}
