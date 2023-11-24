package com.argentinaprograma.issuereport.repository;

import com.argentinaprograma.issuereport.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
