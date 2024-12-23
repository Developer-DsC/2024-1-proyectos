package Entidades;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Persona {

   
    private String cedula;
    private String Apellido;
    private String Nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String cedula, String Apellido, String Nombre, int edad) {
        this.cedula = cedula;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.edad = edad;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String imprimirPersona() {
        return  "\nCédula: " + cedula
                + "\nNombre y Apellido: " + Nombre + " " + Apellido
                + "\nEdad: " + edad;

    }
}
