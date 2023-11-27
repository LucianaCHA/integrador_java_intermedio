package com.argentinaprograma.tp_integrador.repository;

import com.argentinaprograma.tp_integrador.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
