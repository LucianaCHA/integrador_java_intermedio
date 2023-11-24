package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.enums.MedioEnum;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.model.MedioComunicacion;
import com.argentinaprograma.issuereport.model.Tecnico;
import com.argentinaprograma.issuereport.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class IssueReport {
	private static ClienteService clienteService;
	private static EspecialidadService especialidadService;
	private static IncidenteService incidenteService;
	private static MedioComunicacionService medioComunicacionService;
	private static TecnicoService tecnicoService;
	private static TipoProblemaService tipoProblemaService;

	public IssueReport(ClienteService clienteService, EspecialidadService especialidadService, IncidenteService incidenteService, MedioComunicacionService medioComunicacionService, TecnicoService tecnicoService, TipoProblemaService tipoProblemaService){
		this.clienteService = clienteService;
		this.especialidadService = especialidadService;
		this.incidenteService = incidenteService;
		this.medioComunicacionService = medioComunicacionService;
		this.tecnicoService = tecnicoService;
		this.tipoProblemaService = tipoProblemaService;
	}

	public static void main(String[] args) {
		SpringApplication.run(IssueReport.class, args);

		inicializarEntidades();
		//System.out.println("Anda bien");
	}

	private static void inicializarEntidades(){
		Especialidad especialidad1 = new Especialidad(0,"Especialidad1", "Alguna");
		Especialidad especialidad2 = new Especialidad(0,"Especialidad2", "Alguna");
		Especialidad especialidad3 = new Especialidad(0,"Especialidad3", "Alguna");
		Especialidad especialidad4 = new Especialidad(0,"Especialidad4", "Alguna");
		Especialidad especialidad5 = new Especialidad(0,"Especialidad5", "Alguna");
		Especialidad especialidad6 = new Especialidad(0,"Especialidad6", "Alguna");
		Especialidad especialidad7 = new Especialidad(0,"Especialidad7", "Alguna");
		MedioComunicacion medio1t1 = new MedioComunicacion(0, MedioEnum.WHATSAPP, "222215151551");
		MedioComunicacion medio1t2 = new MedioComunicacion(0, MedioEnum.EMAIL, "tecnico2@gmail.com");
		MedioComunicacion medio1t3 = new MedioComunicacion(0, MedioEnum.WHATSAPP, "356215151551");
		MedioComunicacion medio1t4 = new MedioComunicacion(0, MedioEnum.WHATSAPP, "123515151551");
		MedioComunicacion medio1t5 = new MedioComunicacion(0, MedioEnum.EMAIL, "tecnico5@gmail.com");
		MedioComunicacion medio1t6 = new MedioComunicacion(0, MedioEnum.WHATSAPP, "596231544111");
		MedioComunicacion medio1t7 = new MedioComunicacion(0, MedioEnum.WHATSAPP, "365415151551");
		especialidad1.setId(especialidadService.guardar(especialidad1).getId());
		especialidad2.setId(especialidadService.guardar(especialidad2).getId());
		especialidad3.setId(especialidadService.guardar(especialidad3).getId());
		especialidad4.setId(especialidadService.guardar(especialidad4).getId());
		especialidad5.setId(especialidadService.guardar(especialidad5).getId());
		especialidad6.setId(especialidadService.guardar(especialidad6).getId());
		especialidad7.setId(especialidadService.guardar(especialidad7).getId());
		medio1t1.setId(medioComunicacionService.guardar(medio1t1).getId());
		medio1t2.setId(medioComunicacionService.guardar(medio1t2).getId());
		medio1t3.setId(medioComunicacionService.guardar(medio1t3).getId());
		medio1t4.setId(medioComunicacionService.guardar(medio1t4).getId());
		medio1t5.setId(medioComunicacionService.guardar(medio1t5).getId());
		medio1t6.setId(medioComunicacionService.guardar(medio1t6).getId());
		medio1t7.setId(medioComunicacionService.guardar(medio1t7).getId());
		Tecnico tecnico1 = new Tecnico(0, "Juan", "Sanchez", List.of(medio1t1), List.of(especialidad1, especialidad2, especialidad3));
		tecnico1.setId(tecnicoService.guardar(tecnico1).getId());
		Tecnico tecnico2 = new Tecnico(0, "Claudia", "Perez", List.of(medio1t2), List.of(especialidad7, especialidad5, especialidad6));
		tecnico2.setId(tecnicoService.guardar(tecnico2).getId());
		Tecnico tecnico3 = new Tecnico(0, "Julian", "Simon", List.of(medio1t3), List.of(especialidad4, especialidad2, especialidad1));
		tecnico3.setId(tecnicoService.guardar(tecnico3).getId());
		Tecnico tecnico4 = new Tecnico(0, "Pedro", "Antuno", List.of(medio1t4), List.of(especialidad6, especialidad7, especialidad2));
		tecnico4.setId(tecnicoService.guardar(tecnico4).getId());
		Tecnico tecnico5 = new Tecnico(0, "Andrea", "Juarez", List.of(medio1t5), List.of(especialidad7, especialidad4, especialidad1));
		tecnico5.setId(tecnicoService.guardar(tecnico5).getId());
		Tecnico tecnico6 = new Tecnico(0, "Santino", "Velez", List.of(medio1t6), List.of(especialidad3, especialidad5, especialidad2));
		tecnico6.setId(tecnicoService.guardar(tecnico6).getId());
		Tecnico tecnico7 = new Tecnico(0, "Pablo", "Villar", List.of(medio1t7), List.of(especialidad1, especialidad3, especialidad6));
		tecnico7.setId(tecnicoService.guardar(tecnico7).getId());
		//System.out.println(tecnico1.toString());
	}

}
