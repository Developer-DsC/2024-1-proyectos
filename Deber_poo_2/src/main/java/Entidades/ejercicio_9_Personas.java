package Entidades;

/**
 *
 * @author Dalton
 */

public class ejercicio_9_Personas {
    private String nombre;
    private String apellido;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ejercicio_9_Personas() {
    }

    public ejercicio_9_Personas(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public void settelefono(String telefono) {
        // Controlar que el teléfono solo acepte 9 dígitos
        if (telefono.matches("\\d{9}")) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: El teléfono debe contener exactamente 9 dígitos.");
        }
    }
    
    @Override
    public String toString() {
        return "Cliente" + "\nNombre=" + nombre + "\nApellido=" + apellido + "\nTelefono=" + telefono;
    }

}
