package Entidades;

import java.util.List;

/**
 *
 * @author Dalton
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Estudiante y Curso
        Estudiante estudiante1 = new Estudiante("Dalton Cornejo", 20);
        Curso curso1 = new Curso("Programación Orientada a Objetos", "Ing. Joffre Cartuche");

        // Inscribir al estudiante en el curso
        estudiante1.inscribirCurso(curso1);

        // Obtener la lista de cursos en los que está inscrito el estudiante
        List<Curso> cursosInscritos = estudiante1.getCursosInscritos();
        for (Curso curso : cursosInscritos) {
            System.out.println(estudiante1.getNombre() + " está inscrito en el curso: " + curso.getNombre());
        }
    }
}
