package Entidades;

import java.util.List;

/**
 *
 * @author Dalton
 */

public class Main2 {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Dalton", 20);
        Estudiante estudiante2 = new Estudiante("Anuel", 22);

        // Crear una universidad
        Universidad universidad = new Universidad("Universidad Tecnica de Machala");

        // Agregar estudiantes a la universidad
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        // Obtener la lista de estudiantes de la universidad
        List<Estudiante> estudiantesUniversidad = universidad.getEstudiantes();
        System.out.println("Estudiantes de la " + universidad.getNombre() + ":");
        for (Estudiante estudiante : estudiantesUniversidad) {
            System.out.println(estudiante.getNombre() + " (Edad: " + estudiante.getEdad() + ")");
        }
    }
}
