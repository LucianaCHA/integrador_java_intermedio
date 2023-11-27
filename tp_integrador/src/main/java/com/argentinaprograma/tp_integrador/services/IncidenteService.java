package com.argentinaprograma.tp_integrador.services;

import com.argentinaprograma.tp_integrador.model.Incidente;
import com.argentinaprograma.tp_integrador.repository.IncidenteRepository;
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

    public Incidente getById(Integer id){
        return incidenteRepository.getById(id);
    }
}
