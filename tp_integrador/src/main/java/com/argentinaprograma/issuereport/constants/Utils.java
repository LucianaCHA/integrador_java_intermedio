package com.argentinaprograma.issuereport.constants;

import java.time.LocalDate;
import java.util.Date;

public class Utils {

    public static LocalDate getFechaActual(){
        return LocalDate.now();
    }

    public static Date sumarDiasAFecha(Date fecha, int dias){
        return new Date(fecha.getTime() + (dias * 24 * 60 * 60 * 1000));
    }
    
}
