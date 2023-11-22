package com.argentinaprograma.issuereport.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity

public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private String tipo;
    @Getter @Setter
    private int tiempoEstimado;
    @Getter @Setter
    private int tiempoMaximo;

}