package com.argentinaprograma.tp_integrador.model;
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
    @Getter
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
    

    public Cliente(long cuit, String email, String razonSocial, String nombre, String apellido, List<Servicio> servicios) {
        this.cuit = cuit;
        this.email = email;
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.servicios = servicios;
        }
}
