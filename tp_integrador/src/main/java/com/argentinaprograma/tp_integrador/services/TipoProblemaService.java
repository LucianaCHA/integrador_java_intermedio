package com.argentinaprograma.tp_integrador.services;

import com.argentinaprograma.tp_integrador.model.TipoProblema;
import com.argentinaprograma.tp_integrador.repository.TipoProblemaRepository;
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
