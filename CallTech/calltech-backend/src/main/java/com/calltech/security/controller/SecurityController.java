package com.calltech.security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityController {
    @RequestMapping(value = "/user-auth", method = RequestMethod.GET)
    @ResponseBody
    public UserDetails user() {
        //todo:Converter o userDetails parra um usuário simplificado apenas para enviar para o front os valores de usuários que serão usados
        return (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
    }
}
