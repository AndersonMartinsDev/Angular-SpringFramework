package com.calltech.security.service;

import com.calltech.security.entity.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthService {

    public Usuario login(Usuario usuario) {
        return usuario;
    }
}
