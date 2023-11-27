package com.argentinaprograma.tp_integrador.repository;

import com.argentinaprograma.tp_integrador.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
