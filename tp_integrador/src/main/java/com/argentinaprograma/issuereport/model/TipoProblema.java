package com.argentinaprograma.issuereport.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter @Setter
    private String tipo;
    @Getter @Setter
    private int tiempoEstimado;
    @Getter @Setter
    private int tiempoMaximo;

    @ManyToMany()
    @JoinTable(
            name = "tipoproblema_especialidad",
            joinColumns = @JoinColumn(name = "id_tipoproblema"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private List<Especialidad> especialidades;

}
