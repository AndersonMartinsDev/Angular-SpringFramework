package com.calltech.security.controller;

import com.calltech.security.entity.ModuloEnum;
import com.calltech.security.entity.PermissoesEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${project.version}/seguranca")
public class SecurityController {


    @GetMapping("permissoes")
    public PermissoesEnum[] permissoes(){
        return PermissoesEnum.values();
    }

    @GetMapping("modulos")
    public ModuloEnum[] modulos(){
        return ModuloEnum.values();
    }
}
