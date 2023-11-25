package com.argentinaprograma.issuereport.constants;

import java.util.List;

import com.argentinaprograma.issuereport.enums.MedioEnum;
import com.argentinaprograma.issuereport.model.Cliente;
import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.model.MedioComunicacion;
import com.argentinaprograma.issuereport.model.Servicio;
import com.argentinaprograma.issuereport.model.Tecnico;

public class Constantes {
    
    private static Especialidad especialidad1 = new Especialidad("Especialidad1", "Descripción de especialidad 1");
    private static Especialidad especialidad2 = new Especialidad("Especialidad2", "Descripción de especialidad 2");
    private static     Especialidad especialidad3 = new Especialidad("Especialidad3", "Descripción de especialidad 3");
    private static Especialidad especialidad4 = new Especialidad("Especialidad4", "Descripción de especialidad 4");
    private static Especialidad especialidad5 = new Especialidad("Especialidad5", "Descripción de especialidad 5");
    private static Especialidad especialidad6 = new Especialidad("Especialidad6", "Descripción de especialidad 6");
    private static     Especialidad especialidad7 = new Especialidad("Especialidad7", "Descripción de especialidad 7");

    


    public static List<Especialidad> ESPECIALIDADES = List.of(especialidad1, especialidad2, especialidad3, especialidad4, especialidad5, especialidad6, especialidad7); 

    private static  MedioComunicacion medio1t1 = new MedioComunicacion(MedioEnum.WHATSAPP, "222215151551");
    private static  MedioComunicacion medio1t2 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico2@gmail.com");
    private static  MedioComunicacion medio1t3 = new MedioComunicacion(MedioEnum.WHATSAPP, "356215151551");
    private static  MedioComunicacion medio1t4 = new MedioComunicacion(MedioEnum.WHATSAPP, "123515151551");
    private static  MedioComunicacion medio1t5 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico5@gmail.com");
    private static  MedioComunicacion medio1t6 = new MedioComunicacion(MedioEnum.WHATSAPP, "596231544111");
    private static  MedioComunicacion medio1t7 = new MedioComunicacion(MedioEnum.WHATSAPP, "365415151551");

    public static final List<MedioComunicacion> MEDIOS_COMUNICACION = List.of(medio1t1, medio1t2, medio1t3, medio1t4, medio1t5, medio1t6, medio1t7);

    public static List<Tecnico> TECNICOS = List.of(
            new Tecnico("Tecnico1", "Apellido1", List.of(medio1t1, medio1t2), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico2", "Apellido2", List.of(medio1t3), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico3", "Apellido3", List.of(medio1t4), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico4", "Apellido4", List.of(medio1t5), List.of(especialidad7)),
            new Tecnico("Tecnico5", "Apellido5", List.of(medio1t6), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico6", "Apellido6", List.of(medio1t7), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico7", "Apellido7", List.of(medio1t1), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico8", "Apellido8", List.of(medio1t2), List.of(especialidad7))
    );

    private static final Servicio servicio1 = new Servicio("Servicio1", "Descripción de servicio 1");
    private static final Servicio servicio2 = new Servicio("Servicio2", "Descripción de servicio 2");
    private static final Servicio servicio3 = new Servicio("Servicio3", "Descripción de servicio 3");
    private static final Servicio servicio4 = new Servicio("Servicio4", "Descripción de servicio 4");
    private static final Servicio servicio5 = new Servicio("Servicio5", "Descripción de servicio 5");

    public static final List<Servicio> SERVICIOS = List.of(servicio1, servicio2, servicio3, servicio4, servicio5);


    // private static final Cliente cliente1 = new Cliente(1, 123456789, "empresacool@cool.com", "Empresa Cool", "Juan", "Perez", List.of());
    
}