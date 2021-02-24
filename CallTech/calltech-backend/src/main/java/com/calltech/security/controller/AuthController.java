package com.calltech.security.controller;


import com.calltech.security.entity.Usuario;
import com.calltech.security.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("${project.version}")
public class AuthController {

    @Autowired
    private AuthService service;

//    @PostMapping("/oauth/authorize")
//    public Usuario entrar(@RequestBody Usuario usuario){
//        return service.login(usuario);
//    }
    @PostMapping("/oauth/authorize")
    public void entrar(){
        log.info("TESTE");
    }
}
