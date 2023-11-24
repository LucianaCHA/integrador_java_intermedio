package com.argentinaprograma.issuereport.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private long cuit;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String razonSocial;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;

    @ManyToMany()
    @JoinTable(
            name = "cliente_contrata_servicio",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_servicio")
    )
    private List<Servicio> servicios;
}
