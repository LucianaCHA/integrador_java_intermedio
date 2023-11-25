package com.argentinaprograma.issuereport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argentinaprograma.issuereport.model.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer>{
    
}
