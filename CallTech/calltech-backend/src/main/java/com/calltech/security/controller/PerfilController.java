package com.calltech.security.controller;

import com.calltech.security.entity.Perfil;
import com.calltech.security.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${project.version}/perfil")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @PostMapping
    public void inserir(@RequestBody Perfil perfil){
        perfilService.inserir(perfil);
    }

    @GetMapping
    public List<Perfil> listar(){
        return perfilService.listar();
    }

    @DeleteMapping
    public void excluir(@RequestBody Perfil perfil){
        perfilService.excluir(perfil);
    }

    @PostMapping("/atualizar")
    public void atualizar(@RequestBody Perfil perfil){
        perfilService.atualizar(perfil);
    }
}
