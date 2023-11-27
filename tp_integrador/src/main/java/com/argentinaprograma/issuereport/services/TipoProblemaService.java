package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.TipoProblema;
import com.argentinaprograma.issuereport.repository.TipoProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProblemaService {
    TipoProblemaRepository tipoProblemaRepository;
    @Autowired
    public TipoProblemaService(TipoProblemaRepository tipoProblemaRepository){
        this.tipoProblemaRepository = tipoProblemaRepository;
    }

    public TipoProblema guardar(TipoProblema tipoProblema){
        return tipoProblemaRepository.save(tipoProblema);
    }
}
