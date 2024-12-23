package Modelos;

/**
 * Clase personalizada Estudiante
 */
public class Estudiante {
    //datos de la clase

    public String Cedula;
    public String Apellido;
    public String Nombre;
    public String Genero;
    public String Direccion;
    public String Padre;
    public String Madre;

    //constructores
    public Estudiante() {
    } //constructor vacio

    public Estudiante(String cedula, String apellido, String nombre,
            String genero, String direccion, String padre, String madre) {
        super();
        Cedula = cedula;
        Apellido = apellido;
        Nombre = nombre;
        Genero = genero;
        Direccion = direccion;
        Padre = padre;
        Madre = madre;
    }
}
