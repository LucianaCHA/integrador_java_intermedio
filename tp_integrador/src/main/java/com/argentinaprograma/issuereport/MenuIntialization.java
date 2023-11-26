package com.argentinaprograma.issuereport;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.argentinaprograma.issuereport.constants.MenuConstantes;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.services.EspecialidadService;
import com.argentinaprograma.issuereport.services.TecnicoService;

@Component
public class MenuIntialization {

    private final TecnicoService tecnicoService;
    private final EspecialidadService especialidadService;
    
    Scanner scanner = new Scanner(System.in);

    
    @Autowired
    public MenuIntialization(
        TecnicoService tecnicoService,
        EspecialidadService especialidadService
        ) {
        this.tecnicoService = tecnicoService;
        this.especialidadService = especialidadService;
    }

    public void initializeMenu() {

        System.out.println(MenuConstantes.MENSAJE_INICIO_MENU);
    
        for (int i = 0; i < MenuConstantes.MENU_PRINCIPAL.length; i++) {
            System.out.println((i + 1) + ". " + MenuConstantes.MENU_PRINCIPAL[i]);
        }
        try {
            int opcionElegida = scanner.nextInt();
            cargarMenu(opcionElegida);
        } catch (InputMismatchException e) {
            System.out.println(MenuConstantes.MENSAJE_ERROR_NUMERO_INVALIDO);
            scanner.next();
            initializeMenu();
        }
    }

    public void cargarMenu(int seleccion) {
    List<Especialidad> especialidades = especialidadService.buscarTodos();
        switch (seleccion) {

            case 1:
                int dias = 0;
                System.out.println(MenuConstantes.MENSAJE_INGRESE_DIAS);
                dias = scanner.nextInt();
                String resultado =  tecnicoService.conMasIncidentesResueltosEnXDias(dias);
                System.out.println(resultado);
                menuConstinuarSalir();
            
            case 2:
				System.out.println(MenuConstantes.MENSAJE_ELEGIR_ESPECIALIDAD);
				
				for (int i = 0; i < especialidades.size(); i++) {
					System.out.println((i + 1) + ". " + especialidades.get(i).getNombre());
				}
				int especialidadElegida = scanner.nextInt() - 1;

				System.out.println(MenuConstantes.MENSAJE_INGRESE_DIAS);
				dias = scanner.nextInt();

				resultado = tecnicoService.conMasIncidentesPorEspecialidad(dias, especialidadElegida);
				System.out.println(resultado);
                menuConstinuarSalir();
            
                case 3:
                    resultado = tecnicoService.tecnicoMasRapido();
				    System.out.println(resultado);
                    menuConstinuarSalir();
                case 4:
                    System.exit(0);
                    break;

            default:
                System.out.println(MenuConstantes.MENSAJE_ERROR_OPCION_INVALIDA);
                initializeMenu();
                break;
        }
    }

    public void menuConstinuarSalir () {
        System.out.println(MenuConstantes.MENSAJE_CONTINUAR_SALIR);
        try {
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    initializeMenu();
                    break;
                default:
                    System.out.println(MenuConstantes.MENSAJE_DESPEDIDA);
                    System.exit(0);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(MenuConstantes.MENSAJE_ERROR_NUMERO_INVALIDO);
            scanner.next();
            initializeMenu();

        }
    }
    
}
