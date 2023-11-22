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
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;

    @OneToMany
    @JoinColumn(name="id_tecnico", referencedColumnName = "id")
    private List<MedioComunicacion> contactos;

    @ManyToMany
    @JoinTable(name = "tecnico_especialidad",
    joinColumns = @JoinColumn(name = "id_tecnico"),
    inverseJoinColumns = @JoinColumn(name = "id_especialidad"))
    private List<Especialidad> especialidades;
}
