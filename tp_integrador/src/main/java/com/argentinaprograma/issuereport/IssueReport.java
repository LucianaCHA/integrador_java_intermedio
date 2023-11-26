package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.constants.MenuConstantes;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.services.EspecialidadService;
import com.argentinaprograma.issuereport.services.TecnicoService;

import java.util.Scanner;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

        DataInitilization dataInitialization = context.getBean(DataInitilization.class);
		TecnicoService tecnicoService = context.getBean(TecnicoService.class);
		EspecialidadService especialidadService = context.getBean(EspecialidadService.class);

		List<Especialidad> especialidades = especialidadService.buscarTodos();
		if(tecnicoService.buscarTodos().size() == 0){
			dataInitialization.initializeData();
		}

		Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción:");

        for (int i = 0; i < MenuConstantes.MENU_PRINCIPAL.length; i++) {
            System.out.println((i + 1) + ". " + MenuConstantes.MENU_PRINCIPAL[i]);
        }
        int opcionElegida = scanner.nextInt();

        switch (opcionElegida) {
            case 1:
				int dias = 0;
				System.out.println("Ingrese la cantidad de días");
				dias = scanner.nextInt();
                String resultado =  tecnicoService.conMasIncidentesResueltosEnXDias(dias);

				System.out.println(resultado);

                break;
            case 2:
				System.out.println("Elija una especialidad:");
				
				for (int i = 0; i < especialidades.size(); i++) {
					System.out.println((i + 1) + ". " + especialidades.get(i).getNombre());
				}
				int especialidadElegida = scanner.nextInt() - 1;

				System.out.println("Ingrese la cantidad de días");

				dias = scanner.nextInt();

				resultado = tecnicoService.conMasIncidentesPorEspecialidad(dias, especialidadElegida);

				System.out.println(resultado);

                break;
            case 3:
                resultado = tecnicoService.tecnicoMasRapido();
				System.out.println(resultado);
                break;
            case 4:
                System.exit(0);
                break;
			
            default:
                System.out.println("Opción no válida");
                break;
        }
		scanner.close();
	}

}
