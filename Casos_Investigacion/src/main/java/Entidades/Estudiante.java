package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dalton
 */
public class Estudiante {
    // Clase Estudiante

    private String nombre;
    private int edad;

    // Constructor
   public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursosInscritos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    // ... (atributos y métodos ya definidos)

    // Atributo de asociación a Curso
    private List<Curso> cursosInscritos;

    // Constructor
    

    // Método para inscribir al estudiante en un curso
    public void inscribirCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
}