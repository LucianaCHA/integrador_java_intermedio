package com.argentinaprograma.tp_integrador;

import com.argentinaprograma.tp_integrador.model.Cliente;
import com.argentinaprograma.tp_integrador.model.Especialidad;
import com.argentinaprograma.tp_integrador.model.Incidente;
import com.argentinaprograma.tp_integrador.model.MedioComunicacion;
import com.argentinaprograma.tp_integrador.model.Servicio;
import com.argentinaprograma.tp_integrador.model.Tecnico;
import com.argentinaprograma.tp_integrador.model.TipoProblema;
import com.argentinaprograma.tp_integrador.services.ClienteService;
import com.argentinaprograma.tp_integrador.services.EspecialidadService;
import com.argentinaprograma.tp_integrador.services.IncidenteService;
import com.argentinaprograma.tp_integrador.services.MedioComunicacionService;
import com.argentinaprograma.tp_integrador.services.ServicioServices;
import com.argentinaprograma.tp_integrador.services.TecnicoService;
import com.argentinaprograma.tp_integrador.services.TipoProblemaService;
import com.argentinaprograma.tp_integrador.constants.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataInitilization {

    private final EspecialidadService especialidadService;
    private final MedioComunicacionService medioComunicacionService;
    private final TecnicoService tecnicoService;
    private final ServicioServices servicioService;
    private final TipoProblemaService tipoProblemaService;
    private final ClienteService clienteService;
    private final IncidenteService incidenteService;


    @Autowired
    public DataInitilization(
        EspecialidadService especialidadService, 
        MedioComunicacionService medioComunicacionService, 
        TecnicoService tecnicoService,
        ServicioServices servicioService,
        ClienteService clienteService,
        TipoProblemaService tipoProblemaService,
        IncidenteService incidenteService
        ) {
        this.especialidadService = especialidadService;
        this.medioComunicacionService = medioComunicacionService;
        this.tecnicoService = tecnicoService;
        this.servicioService = servicioService;
        this.clienteService = clienteService;
        this.tipoProblemaService = tipoProblemaService;
        this.incidenteService = incidenteService;
    }

    public void deleteAllData() {
        tecnicoService.eliminarTodos();
        especialidadService.eliminarTodos();
        medioComunicacionService.eliminarTodos();
    }

    public void initializeData() {
        deleteAllData(); // borramos para no recargar siempre los mismos datos 
        inicializarEspecialidades();
        inicializarMediosComunicacion();
        inicializarTecnicos();
        inicializarServicios();
        inicializarClientes();
        inicializarTiposProblema();
        inicializarIncidentes();
    }

    private void inicializarEspecialidades() {
        for (Especialidad especialidad : Constantes.ESPECIALIDADES) {
            especialidadService.guardar(especialidad).getId();
        }       
    }

    private void inicializarMediosComunicacion() {
		for (MedioComunicacion medioComunicacion : Constantes.MEDIOS_COMUNICACION) {
			medioComunicacionService.guardar(medioComunicacion).getId();
		}

    }

    private void inicializarTecnicos() {

    for (Tecnico tecnico : Constantes.TECNICOS) {
        tecnicoService.guardar(tecnico).getId();
    }
    }

    private void inicializarServicios() {
        for (Servicio servicio : Constantes.SERVICIOS) {
            servicioService.guardar(servicio).getId();
        }
    }

    private void inicializarClientes() {
        for (Cliente cliente : Constantes.CLIENTES) {
            clienteService.guardar(cliente).getId();
        }
    }

    private void inicializarIncidentes() {

        for (Incidente incidente: Constantes.INCIDENTES){

            if (Constantes.INCIDENTES_RESUELTOS.contains(incidente)){
                incidente.setFechaResolucion(Constantes.TODAY);
            }         


            incidenteService.guardar(incidente).getId();
        }

    }

    private void inicializarTiposProblema() {
       for (TipoProblema tipoProblema : Constantes.TIPOS_PROBLEMA) {
        tipoProblemaService.guardar(tipoProblema).getId();
       }

    }

}
