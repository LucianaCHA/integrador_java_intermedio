package com.argentinaprograma.tp_integrador.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argentinaprograma.tp_integrador.model.Servicio;
import com.argentinaprograma.tp_integrador.repository.ServicioRepository;

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
