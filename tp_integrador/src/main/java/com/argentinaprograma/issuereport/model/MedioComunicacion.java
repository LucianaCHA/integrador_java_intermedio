package com.argentinaprograma.issuereport.model;

import com.argentinaprograma.issuereport.enums.MedioEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity
@Table(name="medio_comunicacion")
public class MedioComunicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private MedioEnum medio;
    @Getter @Setter
    private String contacto;

}
