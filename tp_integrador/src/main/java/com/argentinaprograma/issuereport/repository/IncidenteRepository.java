package com.argentinaprograma.issuereport.repository;

import com.argentinaprograma.issuereport.model.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository <Incidente, Integer>{
}
