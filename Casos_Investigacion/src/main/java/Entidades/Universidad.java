package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dalton
 */

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante a la universidad
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


}
