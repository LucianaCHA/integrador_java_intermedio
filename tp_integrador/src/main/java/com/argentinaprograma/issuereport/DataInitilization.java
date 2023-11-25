package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.enums.MedioEnum;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.model.MedioComunicacion;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.services.EspecialidadService;
import com.argentinaprograma.issuereport.services.MedioComunicacionService;
import com.argentinaprograma.issuereport.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

    public void initializeData() {
        inicializarEspecialidades();
        inicializarMediosComunicacion();
        inicializarTecnicos();
    }
    
    Especialidad especialidad1 = new Especialidad("Especialidad1", "Descripción de especialidad 1");
    Especialidad especialidad2 = new Especialidad("Especialidad2", "Descripción de especialidad 2");
    Especialidad especialidad3 = new Especialidad("Especialidad3", "Descripción de especialidad 3");
    Especialidad especialidad4 = new Especialidad("Especialidad4", "Descripción de especialidad 4");
    Especialidad especialidad5 = new Especialidad("Especialidad5", "Descripción de especialidad 5");
    Especialidad especialidad6 = new Especialidad("Especialidad6", "Descripción de especialidad 6");
    Especialidad especialidad7 = new Especialidad("Especialidad7", "Descripción de especialidad 7");


    MedioComunicacion medio1t1 = new MedioComunicacion(MedioEnum.WHATSAPP, "222215151551");
    MedioComunicacion medio1t2 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico2@gmail.com");
    MedioComunicacion medio1t3 = new MedioComunicacion(MedioEnum.WHATSAPP, "356215151551");
    MedioComunicacion medio1t4 = new MedioComunicacion(MedioEnum.WHATSAPP, "123515151551");
    MedioComunicacion medio1t5 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico5@gmail.com");
    MedioComunicacion medio1t6 = new MedioComunicacion(MedioEnum.WHATSAPP, "596231544111");
    MedioComunicacion medio1t7 = new MedioComunicacion(MedioEnum.WHATSAPP, "365415151551");


    private void inicializarEspecialidades() {
        List<Especialidad> especialidades = List.of(especialidad1, especialidad2, especialidad3, especialidad4, especialidad5, especialidad6, especialidad7);
        for (Especialidad especialidad : especialidades) {
            especialidadService.guardar(especialidad).getId();
        }

       
    }

    private void inicializarMediosComunicacion() {
        
		List<MedioComunicacion> mediosComunicacion = List.of(medio1t1, medio1t2, medio1t3, medio1t4, medio1t5, medio1t6, medio1t7);

		for (MedioComunicacion medioComunicacion : mediosComunicacion) {
			medioComunicacionService.guardar(medioComunicacion).getId();
		}

    }

    private void inicializarTecnicos() {
        List<Tecnico> tecnicos = List.of(
            new Tecnico("Tecnico1", "Apellido1", List.of(medio1t1, medio1t2), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico2", "Apellido2", List.of(medio1t3), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico3", "Apellido3", List.of(medio1t4), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico4", "Apellido4", List.of(medio1t5), List.of(especialidad7)),
            new Tecnico("Tecnico5", "Apellido5", List.of(medio1t6), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico6", "Apellido6", List.of(medio1t7), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico7", "Apellido7", List.of(medio1t1), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico8", "Apellido8", List.of(medio1t2), List.of(especialidad7))
    );

    for (Tecnico tecnico : tecnicos) {
        tecnicoService.guardar(tecnico).getId();
    }
    }
}
