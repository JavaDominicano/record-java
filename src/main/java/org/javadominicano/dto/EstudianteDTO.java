package org.javadominicano.dto;

import java.util.Objects;

/**
 * Clase DTO tradicional sin el uso de los record. Notar el código adicional para mantener el mismo efecto.
 */
public class EstudianteDTO {

    private long id;
    private String nombre;
    private String carrera;

    public EstudianteDTO(long id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudianteDTO that = (EstudianteDTO) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(carrera, that.carrera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, carrera);
    }
}
