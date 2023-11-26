package com.argentinaprograma.issuereport;

import com.argentinaprograma.issuereport.services.IncidenteService;
import com.argentinaprograma.issuereport.services.TecnicoService;

import java.util.Scanner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class IssueReport {

	public static void main(String[] args) {
		// la comenté porque se ejecuta dos veces
		// SpringApplication.run(IssueReport.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(IssueReport.class, args);

        DataInitilization dataInitialization = context.getBean(DataInitilization.class);
		TecnicoService tecnicoService = context.getBean(TecnicoService.class);
		IncidenteService incidenteService = context.getBean(IncidenteService.class);
		if(tecnicoService.buscarTodos().size() == 0){
			dataInitialization.initializeData();
		}

		// tecnicoService.conMasIncidentesResueltosEnXDias(5);

		// String [] opcionesMenu ={
		// 	"Técnico con más incidentes resueltos en los últimos N días",
		// 	"Técnico con más incidentes resueltos en los últimos N días por especialidad",
		// 	"Técnico que resolvió más rápido los incidentes asignados",
		// 	"Salir"
		// };

		// int opciónELegida = JOptionPane.showOptionDialog(null, "Elija una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);

		// switch (opciónELegida) {
		// 	case 0:
		// 		tecnicoService.conMasIncidentesResueltosEnXDias(5);
		// 		break;
		// 	case 1:
		// 		System.out.println("Elegiste la opción 2");
		// 		break;
		// 	case 2:
		// 		System.out.println("Elegiste la opción 3");
		// 		break;
		// 	case 3:
		// 		System.exit(0);
		// 		break;
		// 	default:
		// 		break;
		// }

		Scanner scanner = new Scanner(System.in);

        String[] opcionesMenu = {
                "Técnico con más incidentes resueltos en los últimos N días",
                "Técnico con más incidentes resueltos en los últimos N días por especialidad",
                "Técnico que resolvió más rápido los incidentes asignados",
                "Salir"
        };

        System.out.println("Elija una opción:");

        for (int i = 0; i < opcionesMenu.length; i++) {
            System.out.println((i + 1) + ". " + opcionesMenu[i]);
        }

        int opcionElegida = scanner.nextInt();

        switch (opcionElegida) {
            case 1:
				int dias = 0;
				System.out.println("Ingrese la cantidad de días");
				dias = scanner.nextInt();
                tecnicoService.conMasIncidentesResueltosEnXDias(dias);

                break;
            case 2:
                System.out.println("Elegiste la opción 2");
                break;
            case 3:
                System.out.println("Elegiste la opción 3");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
		scanner.close();
		System.out.println("Anda bien");
	}

}
