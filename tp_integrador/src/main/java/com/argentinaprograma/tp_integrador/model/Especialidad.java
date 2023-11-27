package com.argentinaprograma.tp_integrador.model;
import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Getter
    private int id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String descripcion;
    
    public Especialidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

}

