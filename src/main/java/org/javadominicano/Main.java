package org.javadominicano;

import com.google.gson.Gson;
import org.javadominicano.dto.Estudiante;
import org.javadominicano.dto.EstudianteValidacion;

public class Main {
    public static void main(String[] args) {
        //Instanciando un record.
        Estudiante estudiante =  new Estudiante(100000, "Carlos Camacho", "ITT");
        System.out.println(estudiante); //notar como imprime los campos .
        System.out.println("La carrera: "+estudiante.carrera());

        //instanciando un record con validación.
        var estu = new EstudianteValidacion(1000000L, "Carlos Camacho", "ICC"); //falla cuando lo genero.
        var estu2 = new EstudianteValidacion(1000000L, "Francisco Grullón", "MED"); //falla cuando lo genero.
        System.out.println(estu); //notar que el campo activo no es parte de la generación de toString, equals y hashCode
        System.out.println("Combinacion estu1: "+estu.combinacion());
        System.out.println("Combinacion estu2: "+estu2.combinacion());

        //Error por la violación de valor en carrera
        //var estuFallo = new EstudianteValidacion(10000L, "Carlos Camacho", "XXX");

        //Exportando el record a un formato de transferencia (JSON).
        Gson gson = new Gson();
        var json = gson.toJson(estudiante);
        System.out.println("JSON: "+json);

    }
}