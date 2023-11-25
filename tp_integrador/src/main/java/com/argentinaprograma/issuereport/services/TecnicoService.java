package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.enums.EstadoEnum;
import com.argentinaprograma.issuereport.model.Incidente;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TecnicoService {
    TecnicoRepository tecnicoRepository;
    IncidenteService incidenteService;
    @Autowired
    public TecnicoService(TecnicoRepository tecnicoRepository, IncidenteService incidenteService){
        this.tecnicoRepository = tecnicoRepository;
        this.incidenteService = incidenteService;
    }

    public Tecnico guardar(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public List<Tecnico> buscarTodos(){
        return tecnicoRepository.findAll();
    }

    public void eliminarTodos(){
        tecnicoRepository.deleteAll();
    }

    public Tecnico conMasIncidentesResueltosEnXDias(int dias){
        LocalDate desde = LocalDate.now().minusDays(dias);
        Incidente uno = incidenteService.getById(1);
        //List<Incidente> todosIncidentes = incidenteService.buscarTodos();
        /*List<Incidente> incidentes = incidenteService.buscarTodos()
                .stream()
                .filter(incidente -> incidente.getEstado() == EstadoEnum.FINALIZADO &&
                        (incidente.getFechaResolucion().isEqual(desde) || incidente.getFechaResolucion().isBefore(desde)))
                .toList();*/
        System.out.println(uno);
        return new Tecnico();

    }


}
