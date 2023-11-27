package com.argentinaprograma.tp_integrador.repository;

import com.argentinaprograma.tp_integrador.model.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository <Incidente, Integer>{
}
