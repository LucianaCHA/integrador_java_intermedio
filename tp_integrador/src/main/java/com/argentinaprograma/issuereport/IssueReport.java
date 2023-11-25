package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.model.Incidente;
import com.argentinaprograma.issuereport.services.IncidenteService;
import com.argentinaprograma.issuereport.services.TecnicoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {
		SpringApplication.run(IssueReport.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

        DataInitilization dataInitialization = context.getBean(DataInitilization.class);
		TecnicoService tecnicoService = context.getBean(TecnicoService.class);
		IncidenteService incidenteService = context.getBean(IncidenteService.class);
		if(tecnicoService.buscarTodos().size() == 0){
			dataInitialization.initializeData();
		}

		tecnicoService.conMasIncidentesResueltosEnXDias(5);
		
		System.out.println("Anda bien");
	}

}
