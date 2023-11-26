package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.enums.EstadoEnum;
import com.argentinaprograma.issuereport.model.Incidente;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.repository.TecnicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public Map<Integer, Long> cantidadesPorTecnico(List<Incidente> incidentes){
        return incidentes.stream()
                .collect(Collectors.groupingBy(
                        incidente -> incidente.getTecnico().getId(),
                        Collectors.counting()
                ));
    }
    @Transactional
    public Tecnico conMasIncidentesResueltosEnXDias(int dias){
        LocalDate desde = LocalDate.now().minusDays(dias);
        System.out.println(desde);
        List<Incidente> incidentes = incidenteService.buscarTodos()
                .stream()
                .filter(incidente -> incidente.getEstado() == EstadoEnum.FINALIZADO &&
                        (incidente.getFechaResolucion().isEqual(desde) || incidente.getFechaResolucion().isAfter(desde)))
                .toList();
        Map<Integer, Long> cantidadPorTecnico = cantidadesPorTecnico(incidentes);
        cantidadPorTecnico.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(
                        entry -> {
                            System.out.println("El técnico con más incidentes resueltos en los últimos " + dias + " días es: ");
                            System.out.println("ID: " + entry.getKey());
                            System.out.println("Nombre: " + tecnicoRepository.findById(entry.getKey()).get().getNombre());
                            System.out.println("Apellido: " + tecnicoRepository.findById(entry.getKey()).get().getApellido());
                            System.out.println("Cantidad de incidentes resueltos: " + entry.getValue());
                        }
                );


        return new Tecnico();

    }


}
