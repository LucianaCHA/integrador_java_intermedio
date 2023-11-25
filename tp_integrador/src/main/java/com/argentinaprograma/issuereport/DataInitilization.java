package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.enums.MedioEnum;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.model.MedioComunicacion;
import com.argentinaprograma.issuereport.model.Servicio;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.services.EspecialidadService;
import com.argentinaprograma.issuereport.services.MedioComunicacionService;
import com.argentinaprograma.issuereport.services.TecnicoService;
import com.argentinaprograma.issuereport.constants.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.Provider.Service;
import java.util.List;

@Component
public class DataInitilization {

    private final EspecialidadService especialidadService;
    private final MedioComunicacionService medioComunicacionService;
    private final TecnicoService tecnicoService;

    @Autowired
    public DataInitilization(EspecialidadService especialidadService, MedioComunicacionService medioComunicacionService, TecnicoService tecnicoService) {
        this.especialidadService = especialidadService;
        this.medioComunicacionService = medioComunicacionService;
        this.tecnicoService = tecnicoService;
    }

    public void deleteAllData() {
        tecnicoService.eliminarTodos();
        medioComunicacionService.eliminarTodos();
        especialidadService.eliminarTodos();
    }

    public void initializeData() {
        deleteAllData(); // borramos para no recargar siempre los mismos datos 
        inicializarEspecialidades();
        inicializarMediosComunicacion();
        inicializarTecnicos();
    }

    private void inicializarEspecialidades() {
        // List<Especialidad> especialidades = Constantes.ESPECIALIDADES;
        for (Especialidad especialidad : Constantes.ESPECIALIDADES) {
            especialidadService.guardar(especialidad).getId();
        }       
    }

    private void inicializarMediosComunicacion() {

        // List<MedioComunicacion> mediosComunicacion = Constantes.MEDIOS_COMUNICACION;
		for (MedioComunicacion medioComunicacion : Constantes.MEDIOS_COMUNICACION) {
			medioComunicacionService.guardar(medioComunicacion).getId();
		}

    }

    private void inicializarTecnicos() {

    for (Tecnico tecnico : Constantes.TECNICOS) {
        tecnicoService.guardar(tecnico).getId();
    }
    }

}
