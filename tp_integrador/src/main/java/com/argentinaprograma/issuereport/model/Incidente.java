package com.argentinaprograma.issuereport.model;
import com.argentinaprograma.issuereport.enums.EstadoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter @Setter
    private String titulo;
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

    @ManyToMany()
    @JoinTable(
            name = "incidentes_tipos_problema",
            joinColumns = @JoinColumn(name = "id_incidente"),
            inverseJoinColumns = @JoinColumn(name = "id_tipo_problema")
    )
    private List<TipoProblema> tiposProblema;

    @ManyToOne()
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne()
    @JoinColumn(name = "asignado_a", referencedColumnName = "id")
    private Tecnico tecnico;

    @ManyToMany()
    @JoinTable(
            name = "incidentes_especialidades",
            joinColumns = @JoinColumn(name = "id_incidente"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private List <Especialidad> especialidades;


    @ManyToOne()
    @JoinColumn(name = "id_servicio", referencedColumnName = "id")
    private Servicio servicio;


    public Incidente(String titulo, String descripcion, String consideraciones, LocalDate fechaIngreso, LocalDate fechaEstimadaResolucion, List<TipoProblema> tiposProblema, Cliente cliente, Tecnico tecnico, Servicio servicio, List<Especialidad> especialidades) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.consideraciones = consideraciones;
        this.fechaIngreso = fechaIngreso;
        this.fechaEstimadaResolucion = fechaEstimadaResolucion;
        this.tiposProblema = tiposProblema;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.servicio = servicio;
        this.especialidades = especialidades;
        this.setEstado();
    }
    

    public void setEstado() {
        if (this.fechaResolucion == null) {
            this.estado = EstadoEnum.EN_PROCESO;
         } else {
            this.estado = EstadoEnum.FINALIZADO; 
         }
    }

    public void setEspecialidades() {
        for (TipoProblema tipoProblema : this.tiposProblema) {
            this.especialidades.addAll(tipoProblema.getEspecialidades());
        }
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
        this.setEstado();
    }

}