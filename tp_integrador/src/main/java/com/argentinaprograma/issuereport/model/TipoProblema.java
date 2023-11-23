package com.argentinaprograma.issuereport.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tipoproblema_especialidad",
            joinColumns = @JoinColumn(name = "id_tipoproblema"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private List<Especialidad> especialidades;

}
