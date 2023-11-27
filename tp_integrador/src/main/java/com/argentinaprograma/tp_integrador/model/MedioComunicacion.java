package com.argentinaprograma.tp_integrador.model;

import com.argentinaprograma.tp_integrador.enums.MedioEnum;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="medio_comunicacion")
public class MedioComunicacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter @Setter
    private MedioEnum medio;
    @Getter @Setter
    private String contacto;

    public MedioComunicacion(MedioEnum medio, String contacto) {
        this.medio = medio;
        this.contacto = contacto;
    }

}
