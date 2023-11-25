package com.argentinaprograma.issuereport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {
		SpringApplication.run(IssueReport.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

        DataInitilization dataInitialization = context.getBean(DataInitilization.class);

        dataInitialization.initializeData();

        System.out.println("Anda bien");
	}

}
