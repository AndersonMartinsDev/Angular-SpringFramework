package com.calltech.product.controller;

import com.calltech.product.entity.Demanda;
import com.calltech.product.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value ="{project.version}/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @GetMapping
    private List<Demanda> listar(){
        return demandaService.list();
    }
}
