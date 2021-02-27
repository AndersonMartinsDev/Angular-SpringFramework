package com.calltech.security.repository;

import com.calltech.security.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles,Long> {
    Roles findByName(String name);
}
