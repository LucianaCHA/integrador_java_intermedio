package com.argentinaprograma.issuereport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argentinaprograma.issuereport.model.Servicio;
import com.argentinaprograma.issuereport.repository.ServicioRepository;

@Service
public class ServicioServices {

    ServicioRepository servicioRepository;

    @Autowired
    public ServicioServices(ServicioRepository servicioRepository){
        this.servicioRepository = servicioRepository;
    }

    public Servicio guardar(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    
    
}
