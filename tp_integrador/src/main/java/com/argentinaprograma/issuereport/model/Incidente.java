package com.argentinaprograma.issuereport.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

enum EstadoEnum {
    INCOMPLETO,
    EN_PROCESO,
    FINALIZADO
}
@Data
@AllArgsConstructor
@Entity

public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private String consideraciones;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaIngreso;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaResolucion;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaEstimadaResolucion;
    private EstadoEnum estado;
}