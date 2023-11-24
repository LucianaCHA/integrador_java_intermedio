package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService {
    EspecialidadRepository especialidadRepository;
    @Autowired
    public EspecialidadService(EspecialidadRepository especialidadRepository){
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad guardar(Especialidad especialidad){
        return especialidadRepository.save(especialidad);
    }

    public List<Especialidad> buscarTodos(){
        return especialidadRepository.findAll();
    }
}
