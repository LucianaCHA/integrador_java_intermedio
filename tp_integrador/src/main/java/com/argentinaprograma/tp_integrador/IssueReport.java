package com.argentinaprograma.tp_integrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

		com.argentinaprograma.tp_integrador.DataInitilization dataInitialization = context.getBean(com.argentinaprograma.tp_integrador.DataInitilization.class);
		com.argentinaprograma.tp_integrador.MenuIntialization menuIntialization = context.getBean(com.argentinaprograma.tp_integrador.MenuIntialization.class);
		com.argentinaprograma.tp_integrador.services.TecnicoService tecnicoService = context.getBean(com.argentinaprograma.tp_integrador.services.TecnicoService.class);


		if(tecnicoService.buscarTodos().size() == 0){
			dataInitialization.initializeData();
		}
		menuIntialization.initializeMenu();

	}


}
