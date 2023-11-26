package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.enums.EstadoEnum;
import com.argentinaprograma.issuereport.model.Incidente;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.repository.TecnicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
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

    public Integer idConMasIncidentes(Map<Integer, Long> tecnicos){
        return tecnicos.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

 
    @Transactional
    public String conMasIncidentesResueltosEnXDias(int dias){
        LocalDate desde = LocalDate.now().minusDays(dias);
         List<Incidente> incidentes = incidenteService.buscarTodos()
                .stream()
                .filter(incidente -> incidente.getEstado() == EstadoEnum.FINALIZADO &&
                        (incidente.getFechaResolucion().isEqual(desde) || incidente.getFechaResolucion().isAfter(desde)))
                .toList();
        Map<Integer, Long> cantidadPorTecnico = cantidadesPorTecnico(incidentes);

        if(cantidadPorTecnico.isEmpty()){
            return "No hay incidentes resueltos en los últimos " + dias + " días";
        }

        Tecnico tecnico = tecnicoRepository.findById(idConMasIncidentes(cantidadPorTecnico)).get();

        return "El técnico con más incidentes resueltos en los últimos " + dias + " días es: " + tecnico.getNombre() + " " + tecnico.getApellido() + " con " + cantidadPorTecnico.get(tecnico.getId()) + " incidentes resueltos";

    }



    @Transactional
    public String conMasIncidentesPorEspecialidad(int dias, int especialidadId){
        LocalDate desde = LocalDate.now().minusDays(dias);
       List<Incidente> incidentes = incidenteService.buscarTodos()
                .stream()
                .filter((incidente -> incidente.getEspecialidades().stream().anyMatch(especialidad -> especialidad.getId() == especialidadId)))
                .filter(incidente -> incidente.getEstado() == EstadoEnum.FINALIZADO &&
                        (incidente.getFechaResolucion().isEqual(desde) || incidente.getFechaResolucion().isAfter(desde)))

                .toList();
        System.out.println("incidentes" + incidentes);

        Map<Integer, Long> cantidadPorTecnico = cantidadesPorTecnico(incidentes);

        if(cantidadPorTecnico.isEmpty()){
            return "No hay incidentes resueltos en los últimos " + dias + " días" + " para la especialidad elegida";
        }

        return "El técnico con más incidentes resueltos en los últimos " + dias + " días" + " para la especialidad " + incidentes.get(0).getEspecialidades().get(0).getNombre() + " es: " + tecnicoRepository.findById(idConMasIncidentes(cantidadPorTecnico)).get().getNombre() + " " + tecnicoRepository.findById(idConMasIncidentes(cantidadPorTecnico)).get().getApellido() + " con " + cantidadPorTecnico.get(idConMasIncidentes(cantidadPorTecnico)) + " incidentes resueltos";        
        


    }
}
