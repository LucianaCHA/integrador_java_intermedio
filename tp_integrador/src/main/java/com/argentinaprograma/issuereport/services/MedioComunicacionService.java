package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.MedioComunicacion;
import com.argentinaprograma.issuereport.repository.MedioComunicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedioComunicacionService {
    MedioComunicacionRepository medioComunicacionRepository;

    @Autowired
    public MedioComunicacionService(MedioComunicacionRepository medioComunicacionRepository){
        this.medioComunicacionRepository = medioComunicacionRepository;
    }

    public MedioComunicacion guardar(MedioComunicacion medioComunicacion){
        return medioComunicacionRepository.save(medioComunicacion);
    }

    public List<MedioComunicacion> buscarTodos(){
        return medioComunicacionRepository.findAll();
    }

}
