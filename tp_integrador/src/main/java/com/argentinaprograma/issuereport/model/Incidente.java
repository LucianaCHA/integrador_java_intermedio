package com.argentinaprograma.issuereport.model;
import com.argentinaprograma.issuereport.enums.EstadoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name="incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private String consideraciones;
    @Column(name="fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaIngreso;
    @Column(name="fecha_resolucion")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaResolucion;
    @Column(name="fecha_estimada_resolucion")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaEstimadaResolucion;
    private EstadoEnum estado;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "incidente_formadopor_tipoproblema",
            joinColumns = @JoinColumn(name = "id_incidente"),
            inverseJoinColumns = @JoinColumn(name = "id_tipoproblema")
    )
    private List<TipoProblema> tiposProblema;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "incidente_id", referencedColumnName = "id")
    private List<Tecnico> tecnicos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "incidente_sobre_especialidad",
            joinColumns = @JoinColumn(name = "id_incidente"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private List <Especialidad> especialidades;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_servicio", referencedColumnName = "id")
    private Servicio servicio;

}