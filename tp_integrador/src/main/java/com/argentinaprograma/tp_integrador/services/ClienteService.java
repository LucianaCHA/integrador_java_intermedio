package com.argentinaprograma.tp_integrador.services;

import com.argentinaprograma.tp_integrador.model.Cliente;
import com.argentinaprograma.tp_integrador.repository.ClienteRepository;
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
