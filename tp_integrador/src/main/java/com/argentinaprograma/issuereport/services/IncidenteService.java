package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.Incidente;
import com.argentinaprograma.issuereport.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenteService {
    IncidenteRepository incidenteRepository;
    @Autowired
    public IncidenteService(IncidenteRepository incidenteRepository){
        this.incidenteRepository = incidenteRepository;
    }

    public Incidente guardar(Incidente incidente){
        return incidenteRepository.save(incidente);
    }

    public List<Incidente> buscarTodos(){
        return incidenteRepository.findAll();
    }
}
