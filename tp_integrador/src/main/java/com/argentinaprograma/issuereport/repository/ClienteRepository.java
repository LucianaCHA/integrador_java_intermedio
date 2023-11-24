package com.argentinaprograma.issuereport.repository;

import com.argentinaprograma.issuereport.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
