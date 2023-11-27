package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.services.TecnicoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

        DataInitilization dataInitialization = context.getBean(DataInitilization.class);
		MenuIntialization menuIntialization = context.getBean(MenuIntialization.class);
		TecnicoService tecnicoService = context.getBean(TecnicoService.class);

	
		if(tecnicoService.buscarTodos().size() == 0){
			dataInitialization.initializeData();
		}
		menuIntialization.initializeMenu();
	
	 }

}
