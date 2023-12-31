package com.argentinaprograma.tp_integrador.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tecnico {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_tecnico", referencedColumnName = "id")
    private List<MedioComunicacion> contactos;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "tecnico_especialidad",
    joinColumns = @JoinColumn(name = "id_tecnico"),
    inverseJoinColumns = @JoinColumn(name = "id_especialidad"))
    private List<Especialidad> especialidades;

    public Tecnico(String nombre, String apellido, List<MedioComunicacion> contactos, List<Especialidad> especialidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contactos = contactos;
        this.especialidades = especialidades;
    }
}
