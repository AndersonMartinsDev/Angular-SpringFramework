package com.calltech.product.controller;

import com.calltech.product.entity.Demanda;
import com.calltech.product.service.DemandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value ="${project.version}/demandas")
public class DemandaController {

    @Autowired
    private DemandaService demandaService;

    @GetMapping
    private List<Demanda> listar(){
        return demandaService.list();
    }

    @GetMapping(path="{id}")
    private Optional<Demanda> porId(@PathVariable Long id){
        return demandaService.getById(id);
    }
}
