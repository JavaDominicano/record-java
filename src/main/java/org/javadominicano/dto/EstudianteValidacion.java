package org.javadominicano.dto;

import java.util.Objects;

public record EstudianteValidacion(Long id, String nombre, String carrera) {

    static String datoEstatico = "Información Estatica"; // No es lo aconsejable crear campos y métodos pero es permitido.

    /**
     * Definición de un constructor compacto y agregando validación y generación de
     * @param id
     * @param nombre
     * @param carrera
     */
    public EstudianteValidacion {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(carrera);

        if(carrera.equalsIgnoreCase("XXX")){
            throw  new IllegalArgumentException("Clave de carrera no permitida");
        }

    }

    public String combinacion(){
        return nombre+"-"+carrera;
    }

    public String datoEstatico(){
        return datoEstatico;
    }
}
