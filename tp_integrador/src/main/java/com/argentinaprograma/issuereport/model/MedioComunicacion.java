package com.argentinaprograma.issuereport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/* REVER COMO CLASE */
enum MedioEnum {
    EMAIL,
    WHATSAPP
}

@Data
@AllArgsConstructor
@Entity
public class MedioComunicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter @Setter
    private MedioEnum medio;
    @Getter @Setter
    private String contacto;

}
