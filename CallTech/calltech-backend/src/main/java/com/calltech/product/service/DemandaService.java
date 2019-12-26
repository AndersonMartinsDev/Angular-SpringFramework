package com.calltech.product.service;

import com.calltech.product.entity.Demanda;
import com.calltech.product.repository.DemandaRepository;
import com.calltech.util.GenericService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DemandaService implements GenericService<Demanda> {

    @Autowired
    private DemandaRepository demandaRepository;

    @Override
    public List<Demanda> list() {
        return demandaRepository.findAll();
    }

    @Override
    public void save(Demanda entity) {
        try{
            demandaRepository.save(entity);
        }catch (Exception ex){
            log.error("Error ao salvar demanda");
        }
    }

    @Override
    public void delete(Demanda entity) {
        try{
            demandaRepository.delete(entity);
        }catch (Exception ex){
            log.error("Error ao deletar demanda");
        }
    }
}
