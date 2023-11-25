package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoService {
    TecnicoRepository tecnicoRepository;
    @Autowired
    public TecnicoService(TecnicoRepository tecnicoRepository){
        this.tecnicoRepository = tecnicoRepository;
    }

    public Tecnico guardar(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public List<Tecnico> buscarTodos(){
        return tecnicoRepository.findAll();
    }

    public void eliminarTodos(){
        tecnicoRepository.deleteAll();
    }

}
