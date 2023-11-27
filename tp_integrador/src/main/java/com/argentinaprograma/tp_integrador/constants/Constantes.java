package com.argentinaprograma.tp_integrador.constants;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.argentinaprograma.tp_integrador.enums.MedioEnum;
import com.argentinaprograma.tp_integrador.model.Cliente;
import com.argentinaprograma.tp_integrador.model.Especialidad;
import com.argentinaprograma.tp_integrador.model.Incidente;
import com.argentinaprograma.tp_integrador.model.MedioComunicacion;
import com.argentinaprograma.tp_integrador.model.Servicio;
import com.argentinaprograma.tp_integrador.model.Tecnico;
import com.argentinaprograma.tp_integrador.model.TipoProblema;

public class Constantes {

    public static LocalDate TODAY = LocalDate.now();
    
    private static Especialidad especialidad1 = new Especialidad("Especialidad1", "Descripción de especialidad 1");
    private static Especialidad especialidad2 = new Especialidad("Especialidad2", "Descripción de especialidad 2");
    private static Especialidad especialidad3 = new Especialidad("Especialidad3", "Descripción de especialidad 3");
    private static Especialidad especialidad4 = new Especialidad("Especialidad4", "Descripción de especialidad 4");
    private static Especialidad especialidad5 = new Especialidad("Especialidad5", "Descripción de especialidad 5");
    private static Especialidad especialidad6 = new Especialidad("Especialidad6", "Descripción de especialidad 6");
    private static Especialidad especialidad7 = new Especialidad("Especialidad7", "Descripción de especialidad 7");
 
    public static List<Especialidad> ESPECIALIDADES = List.of(especialidad1, especialidad2, especialidad3, especialidad4, especialidad5, especialidad6, especialidad7); 

    private static  MedioComunicacion medio1t1 = new MedioComunicacion(MedioEnum.WHATSAPP, "222215151551");
    private static  MedioComunicacion medio1t2 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico2@gmail.com");
    private static  MedioComunicacion medio1t3 = new MedioComunicacion(MedioEnum.WHATSAPP, "356215151551");
    private static  MedioComunicacion medio1t4 = new MedioComunicacion(MedioEnum.WHATSAPP, "123515151551");
    private static  MedioComunicacion medio1t5 = new MedioComunicacion(MedioEnum.EMAIL, "tecnico5@gmail.com");
    private static  MedioComunicacion medio1t6 = new MedioComunicacion(MedioEnum.WHATSAPP, "596231544111");
    private static  MedioComunicacion medio1t7 = new MedioComunicacion(MedioEnum.WHATSAPP, "365415151551");
    private static  MedioComunicacion medio1t8 = new MedioComunicacion(MedioEnum.EMAIL, "tecniconro8@gmail.com");
    private static  MedioComunicacion medio1t9 = new MedioComunicacion(MedioEnum.WHATSAPP, "02211544154154");

    public static final List<MedioComunicacion> MEDIOS_COMUNICACION = List.of(medio1t1, medio1t2, medio1t3, medio1t4, medio1t5, medio1t6, medio1t7, medio1t8, medio1t9);

    public static List<Tecnico> TECNICOS = List.of(
            new Tecnico("Tecnico1", "Apellido1", List.of(medio1t1, medio1t2), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico2", "Apellido2", List.of(medio1t3), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico3", "Apellido3", List.of(medio1t4), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico4", "Apellido4", List.of(medio1t5), List.of(especialidad7)),
            new Tecnico("Tecnico5", "Apellido5", List.of(medio1t6), List.of(especialidad1, especialidad2)),
            new Tecnico("Tecnico6", "Apellido6", List.of(medio1t7), List.of(especialidad3, especialidad4)),
            new Tecnico("Tecnico7", "Apellido7", List.of(medio1t9), List.of(especialidad5, especialidad6)),
            new Tecnico("Tecnico8", "Apellido8", List.of(medio1t8), List.of(especialidad7))
    );

    private static final Servicio servicio1 = new Servicio("Servicio1", "Descripción de servicio 1");
    private static final Servicio servicio2 = new Servicio("Servicio2", "Descripción de servicio 2");
    private static final Servicio servicio3 = new Servicio("Servicio3", "Descripción de servicio 3");
    private static final Servicio servicio4 = new Servicio("Servicio4", "Descripción de servicio 4");
    private static final Servicio servicio5 = new Servicio("Servicio5", "Descripción de servicio 5");

    public static final List<Servicio> SERVICIOS = List.of(servicio1, servicio2, servicio3, servicio4, servicio5);

    private static final Cliente cliente1 = new Cliente(1111111, "email@cliente1.com", "Razon social 1", "Nombre responsable 1", "Apellido responsable 1", List.of(servicio1, servicio2));

    private static final Cliente cliente2 = new Cliente(2222222, "email@cliente2.com", "Razon social 2", "Nombre responsable 2", "Apellido responsable 2", List.of(servicio3, servicio4));

    private static final Cliente cliente3 = new Cliente(3333333, "email@cliente3.com.ar", "Razon social 3", "Nombre responsable 3", "Apellido responsable 3", List.of(servicio5));

    public static final List<Cliente> CLIENTES = List.of(cliente1, cliente2, cliente3);

    public static final TipoProblema problema0 = new TipoProblema(0, "Problema 0", 1, 2, List.of(especialidad1));

    public static final TipoProblema problema1 = new TipoProblema(1, "Problema 1", 1, 2, List.of(especialidad1, especialidad2));

    public static final TipoProblema problema2 = new TipoProblema(2, "Problema 2", 2, 4, List.of(especialidad3, especialidad4));

    public static final TipoProblema problema3 = new TipoProblema(3, "Problema 3", 3, 5, List.of(especialidad5, especialidad6));

    public static final TipoProblema problema4 = new TipoProblema(4, "Problema 4", 4, 6, List.of(especialidad7));

    public static final TipoProblema problema5 = new TipoProblema(5, "Problema 5", 5, 7, List.of(especialidad6, especialidad2));

    public static List <TipoProblema> TIPOS_PROBLEMA = List.of(
        problema0, problema1, problema2, problema3, problema4, problema5);

    public static final Incidente incidente1 = new Incidente(
        "Titulo incidente 1",
        "Descripción incidente 1",
        "Consideraciones incidente 1",
        TODAY,
        TODAY.plusDays(5),
        List.of(problema1, problema2),
        cliente1,
        TECNICOS.get(0),
        servicio1,
        List.of(especialidad1, especialidad2)
    );

    public static final Incidente incidente2 = new Incidente(
        "Titulo incidente 2",
        "Descripción incidente 2",
        "Consideraciones incidente 2",
        TODAY,
        TODAY.plusDays(3),
        List.of(problema3, problema4),
        cliente2,
        TECNICOS.get(1),
        servicio2,
        List.of(especialidad3, especialidad4)
    );

    public static final Incidente incidente3 = new Incidente(
        "Titulo incidente 3",
        "Descripción incidente 3",
        "Consideraciones incidente 3",
        TODAY,
        TODAY.plusDays(2),
        List.of(problema5),
        cliente3,
        TECNICOS.get(2),
        servicio3,
        List.of(especialidad5, especialidad6)
    );

    public static final Incidente incidente4 = new Incidente(
        "Titulo incidente 4",
        "Descripción incidente 4",
        "Consideraciones incidente 4",
        TODAY,
        TODAY.plusDays(1),
        List.of(problema0),
        cliente1,
        TECNICOS.get(3),
        servicio4,
        List.of(especialidad7)
    );

    public static final Incidente incidente5 = new Incidente(
        "Titulo incidente 5",
        "Descripción incidente 5",
        "Consideraciones incidente 5",
        TODAY,
        TODAY.plusDays(4),
        List.of(problema1, problema2),
        cliente2,
        TECNICOS.get(4),
        servicio5,
        List.of(especialidad1, especialidad2)
    );

    public static final Incidente incidente6 = new Incidente(
        "Titulo incidente 6",
        "Descripción incidente 6",
        "Consideraciones incidente 6",
        TODAY,
        TODAY.plusDays(6),
        List.of(problema3, problema4),
        cliente3,
        TECNICOS.get(5),
        servicio1,
        List.of(especialidad3, especialidad4)
    );

    public static final Incidente incidente7 = new Incidente(
        "Titulo incidente 7",
        "Descripción incidente 7",
        "Consideraciones incidente 7",
        TODAY,
        TODAY.plusDays(7),
        List.of(problema5),
        cliente1,
        TECNICOS.get(6),
        servicio2,
        List.of(especialidad5, especialidad6)
    );

    public static final Incidente incidente8 = new Incidente(
        "Titulo incidente 8",
        "Descripción incidente 8",
        "Consideraciones incidente 8",
        TODAY,
        TODAY.plusDays(8),
        List.of(problema0),
        cliente2,
        TECNICOS.get(7),
        servicio3,
        List.of(especialidad7)
    );

    public static final Incidente incidente9 = new Incidente(
        "Titulo incidente 9",
        "Descripción incidente 9",
        "Consideraciones incidente 9",
        TODAY,
        TODAY.plusDays(9),
        List.of(problema1, problema2),
        cliente3,
        TECNICOS.get(0),
        servicio4,
        List.of(especialidad1, especialidad2)
    );

    public static final Incidente incidente10 = new Incidente(
        "Titulo incidente 10",
        "Descripción incidente 10",
        "Consideraciones incidente 10",
        TODAY,
        TODAY.plusDays(10),
        List.of(problema3, problema4),
        cliente1,
        TECNICOS.get(1),
        servicio5,
        List.of(especialidad3, especialidad4)
    );

    public static final Incidente incidente11 = new Incidente(
        "Titulo incidente 11",
        "Descripción incidente 11",
        "Consideraciones incidente 11",
        TODAY,
        TODAY.plusDays(11),
        List.of(problema5),
        cliente2,
        TECNICOS.get(2),
        servicio1,
        List.of(especialidad5, especialidad6)
    );

    public static final Incidente incidente12 = new Incidente(
        "Titulo incidente 12",
        "Descripción incidente 12",
        "Consideraciones incidente 12",
        TODAY,
        TODAY.plusDays(12),
        List.of(problema0),
        cliente3,
        TECNICOS.get(3),
        servicio2,
        List.of(especialidad7)
    );

    public static final Incidente incidente13 = new Incidente(
        "Titulo incidente 13",
        "Descripción incidente 13",
        "Consideraciones incidente 13",
        TODAY,
        TODAY.plusDays(13),
        List.of(problema1, problema2),
        cliente1,
        TECNICOS.get(4),
        servicio3,
        List.of(especialidad1, especialidad2)
    );

    public static final Incidente incidente14 = new Incidente(
        "Titulo incidente 14",
        "Descripción incidente 14",
        "Consideraciones incidente 14",
        TODAY.minusDays(1),
        TODAY.plusDays(3),
        List.of(problema2),
        cliente2,
        TECNICOS.get(5),
        servicio4,
        List.of(especialidad3, especialidad4)
    );

    public static final Incidente incidente15 = new Incidente(
        "Titulo incidente 15",
        "Descripción incidente 15",
        "Consideraciones incidente 15",
        TODAY,
        TODAY.plusDays(5),
        List.of(problema5, problema3),
        cliente3,
        TECNICOS.get(6),
        servicio5,
        List.of(especialidad5, especialidad6)
    );

    public static final Incidente incidente16 = new Incidente(
        "Titulo incidente 16",
        "Descripción incidente 16",
        "Consideraciones incidente 16",
        TODAY,
        TODAY.plusDays(2),
        List.of(problema4),
        cliente1,
        TECNICOS.get(7),
        servicio1,
        List.of(especialidad7)
    );

    public static final Incidente incidente17 = new Incidente(
        "Titulo incidente 17",
        "Descripción incidente 17",
        "Consideraciones incidente 17",
        TODAY.minusDays(4),
        TODAY.plusDays(5),
        List.of(problema1, problema2),
        cliente2,
        TECNICOS.get(0),
        servicio2,
        List.of(especialidad1, especialidad3)
    );

    public static final Incidente incidente18 = new Incidente(
        "Titulo incidente 18",
        "Descripción incidente 18",
        "Consideraciones incidente 18",
        TODAY.minusDays(2),
        TODAY.plusDays(4),
        List.of(problema1),
        cliente3,
        TECNICOS.get(1),
        servicio3,
        List.of(especialidad1, especialidad2)
    );

    public static final Incidente incidente19 = new Incidente(
        "Titulo incidente 19",
        "Descripción incidente 19",
        "Consideraciones incidente 19",
        TODAY.minusDays(1),
        TODAY.plusDays(3),
        List.of(problema5),
        cliente1,
        TECNICOS.get(2),
        servicio4,
        List.of(especialidad4)
    );

    public static final Incidente incidente20 = new Incidente(
        "Titulo incidente 20",
        "Descripción incidente 20",
        "Consideraciones incidente 20",
        TODAY,
        TODAY.plusDays(3),
        List.of(problema0),
        cliente2,
        TECNICOS.get(0),
        servicio5,
        List.of(especialidad1)
    );

    public static final Incidente incidente21 = new Incidente(
            "Titulo incidente 21",
            "Descripción incidente 21",
            "Consideraciones incidente 21",
            TODAY,
            TODAY.plusDays(1),
            List.of(problema0),
            cliente1,
            TECNICOS.get(0),
            servicio3,
            List.of(especialidad2, especialidad3)
    );

    public static final Incidente incidente22 = new Incidente(
            "Titulo incidente 22",
            "Descripción incidente 22",
            "Consideraciones incidente 22",
            TODAY,
            TODAY.plusDays(10),
            List.of(problema4),
            cliente2,
            TECNICOS.get(0),
            servicio5,
            List.of(especialidad5)
    );

    public static final Incidente incidente23 = new Incidente(
            "Titulo incidente 23",
            "Descripción incidente 23",
            "Consideraciones incidente 23",
            TODAY,
            TODAY,
            List.of(problema2),
            cliente2,
            TECNICOS.get(3),
            servicio2,
            List.of(especialidad1, especialidad5)
    );

    public static final Incidente incidente24 = new Incidente(
            "Titulo incidente 24",
            "Descripción incidente 24",
            "Consideraciones incidente 24",
            TODAY,
            TODAY.plusDays(1),
            List.of(problema0),
            cliente3,
            TECNICOS.get(6),
            servicio4,
            List.of(especialidad4)
    );

    public static final Incidente incidente25 = new Incidente(
            "Titulo incidente 25",
            "Descripción incidente 25",
            "Consideraciones incidente 25",
            TODAY,
            TODAY.plusDays(6),
            List.of(problema3),
            cliente2,
            TECNICOS.get(5),
            servicio2,
            List.of(especialidad1, especialidad3)
    );

    public static final Incidente incidente26 = new Incidente(
            "Titulo incidente 26",
            "Descripción incidente 26",
            "Consideraciones incidente 26",
            TODAY,
            TODAY.plusDays(9),
            List.of(problema2, problema4),
            cliente1,
            TECNICOS.get(4),
            servicio3,
            List.of(especialidad4)
    );

    public static final Incidente incidente27 = new Incidente(
            "Titulo incidente 27",
            "Descripción incidente 27",
            "Consideraciones incidente 27",
            TODAY,
            TODAY,
            List.of(problema2, problema4, problema5),
            cliente1,
            TECNICOS.get(7),
            servicio2,
            List.of(especialidad3)
    );
    public static final Incidente incidente28 = new Incidente(
            "Titulo incidente 28",
            "Descripción incidente 28",
            "Consideraciones incidente 28",
            TODAY,
            TODAY.plusDays(4),
            List.of(problema4),
            cliente2,
            TECNICOS.get(5),
            servicio5,
            List.of(especialidad7)
    );
    public static final Incidente incidente29 = new Incidente(
            "Titulo incidente 29",
            "Descripción incidente 29",
            "Consideraciones incidente 29",
            TODAY,
            TODAY.plusDays(1),
            List.of(problema0),
            cliente3,
            TECNICOS.get(6),
            servicio3,
            List.of(especialidad3, especialidad6)
    );
    public static final Incidente incidente30 = new Incidente(
            "Titulo incidente 30",
            "Descripción incidente 30",
            "Consideraciones incidente 30",
            TODAY,
            TODAY.plusDays(5),
            List.of(problema2, problema5),
            cliente1,
            TECNICOS.get(2),
            servicio4,
            List.of(especialidad1)
    );
    public static List<Incidente> INCIDENTES_RESUELTOS = List.of(
        incidente1, incidente9,  incidente17, incidente18, incidente19,
        incidente20, incidente22, incidente23, incidente26, incidente28,incidente29, incidente30
    );

    public static List<Incidente> INCIDENTES_NO_RESUELTOS = List.of(
        incidente2, incidente3, incidente4, incidente5, incidente6, incidente7, incidente8, incidente10,
        incidente11, incidente12, incidente13, incidente14, incidente15, incidente16, incidente21, incidente24,
        incidente25, incidente27
    );

    public static List<Incidente> INCIDENTES = new ArrayList<>(INCIDENTES_NO_RESUELTOS);

static {
    INCIDENTES.addAll(INCIDENTES_RESUELTOS);
}

}

