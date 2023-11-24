package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.Cliente;
import com.argentinaprograma.issuereport.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente guardar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> buscarTodos(){
        return  clienteRepository.findAll();
    }
}
